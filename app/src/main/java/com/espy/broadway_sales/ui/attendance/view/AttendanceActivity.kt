package com.espy.broadway_sales.ui.attendance.view

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProvider
import com.espy.broadway_sales.R
import com.espy.broadway_sales.databinding.ActivityAttendanceBinding
import com.espy.broadway_sales.ui.base.BaseActivity

class AttendanceActivity : BaseActivity<ActivityAttendanceBinding>(
    R.layout.activity_attendance,
    true,
    R.string.attendance
){

    private lateinit var viewModel: AttendanceViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AttendanceViewModel::class.java)
        binding?.apply {
            lifecycleOwner = this@AttendanceActivity
            this.viewModel = viewModel
        }
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_arrow_back)
    }

    override fun onCreateToolbar(): Toolbar? {
        return binding?.toolbarHolder?.toolbar
    }

    override fun onCreateLoader(): View? {
        return binding?.loadingView?.loaderView
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}