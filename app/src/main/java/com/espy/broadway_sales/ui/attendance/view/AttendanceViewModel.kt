package com.espy.broadway_sales.ui.attendance.view

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.espy.broadway_sales.api.MultiPartRequestHelper
import com.espy.broadway_sales.preference.AppPreferences
import com.espy.broadway_sales.repository.AttendanceRepository
import com.espy.broadway_sales.ui.base.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class AttendanceViewModel : BaseViewModel() {

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

    val attendanceRepository = AttendanceRepository()

    private val _attendanceMarked: MutableLiveData<String> = MutableLiveData()
    val attendanceMarked: LiveData<String>
        get() = _attendanceMarked

    fun processPunchInPunchOut(status: String, imagepath: String, context: Context){
        val partLoginId = MultiPartRequestHelper.createRequestBody("login_id", AppPreferences.userId)
        val partStatus = if (status == "0") {
            MultiPartRequestHelper.createRequestBody("punch_in", status)
        } else {
            MultiPartRequestHelper.createRequestBody("punch_out", status)
        }
        val partFile = MultiPartRequestHelper.createFileRequestBody(imagepath, "image", context)

        viewModelScope.launch {
            attendanceRepository.processAttendance(partLoginId, partStatus, partFile, status).collect {
                _attendanceMarked.value = it
            }
        }
    }
}