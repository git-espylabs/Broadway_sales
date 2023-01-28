package com.espy.broadway_sales.ui.attendance.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.espy.broadway_sales.R
import com.espy.broadway_sales.databinding.FragmentPhotoOptionBottomSheetDialogBinding
import com.espy.broadway_sales.interfaces.PhotoOptionListener
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class PhotoOptionBottomSheetDialogFragment(private val listener: PhotoOptionListener) :
    BottomSheetDialogFragment() {

    private lateinit var binding: FragmentPhotoOptionBottomSheetDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_photo_option_bottom_sheet_dialog,
            container,
            false
        )
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setClickListeners()
    }

    private fun setClickListeners() {
        binding.tvChoosePhoto.setOnClickListener {
            listener.onChoosePhotoSelected()
            dismiss()
        }
        binding.tvTakePhoto.setOnClickListener {
            listener.onTakePhotoSelected()
            dismiss()
        }
    }

    private fun showSimpleDialog(){

    }
}