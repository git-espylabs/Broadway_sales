package com.espy.broadway_sales.ui.profile.view

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.espy.broadway_sales.BuildConfig
import com.espy.broadway_sales.R
import com.espy.broadway_sales.api.Result
import com.espy.broadway_sales.databinding.FragmentLoginBinding
import com.espy.broadway_sales.extensions.launchActivity
import com.espy.broadway_sales.preference.AppPreferences
import com.espy.broadway_sales.ui.base.BaseFragmentWithBinding
import com.espy.broadway_sales.ui.home.HomeActivity

class LoginFragment:
    BaseFragmentWithBinding<FragmentLoginBinding>(R.layout.fragment_login),
    View.OnClickListener{

    private lateinit var loginViewModel: ProfileViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loginViewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            viewModel = loginViewModel
            viewParent = this@LoginFragment
        }

        if (BuildConfig.DEBUG){
            binding.apply {
                etUsername.setText("developer@gmail.com")
                etPassword.setText("developer@123")
            }
        }

        setObservers()
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btnLogin -> {
                (activity as LoginActivity).showProgress()
                binding.apply {
                    loginViewModel.processUserLogin(etUsername.text.toString(), etPassword.text.toString())
                }
            }
        }
    }

    private fun setObservers(){
        loginViewModel.loginsResponse.observe(viewLifecycleOwner, {
            val responseData = if(it is Result.Success && it.data.isError.not() && it.data.data?.any() == true){
                it.data.data
            }else{
                null
            }
            handleLoginResponse(responseData)
        })
    }

    private fun handleLoginResponse(data: String?){
        (activity as LoginActivity).hideProgress()
        data?.let {
            AppPreferences.userId = it
            activity?.launchActivity<HomeActivity>()
            activity?.finish()
        }?: run {
            showToast("Login Failed!")
        }
    }
}