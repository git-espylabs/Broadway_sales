package com.espy.broadway_sales.ui.shops.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.MutableLiveData
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.espy.broadway_sales.R
import com.espy.broadway_sales.api.Result
import com.espy.broadway_sales.api.models.shops.FollowupHistoryItem
import com.espy.broadway_sales.databinding.FragmentFollowupHistoryBinding
import com.espy.broadway_sales.ui.base.BaseFragmentWithBinding
import com.espy.broadway_sales.ui.shops.adapter.FollowupHistoryAdapter

class FollowupHistoryFragment:
    BaseFragmentWithBinding<FragmentFollowupHistoryBinding>(R.layout.fragment_followup_history) {

    private val shopsViewModel: ShopsViewModel by activityViewModels()
    private val args: FollowupHistoryFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as OrderHistoryActivity).setToolBarProperties("Follow Up History", false)

        binding.apply {
            viewModel = shopsViewModel
        }

        setObservers()
        (activity as OrderHistoryActivity).showProgress()
        shopsViewModel.getFollowupHistory(args.enqid?:"0", args.agencyid?:"0")
    }

    override fun onStop() {
        super.onStop()
        shopsViewModel._followupHistory = MutableLiveData()
    }

    private fun setObservers(){
        shopsViewModel.followupHistory.observe(viewLifecycleOwner) {
            (activity as OrderHistoryActivity).hideProgress()
            if (it is Result.Success && it.data.any()) {
                loadOrders(it.data)
            } else {
                showToast("No data found!")
            }
        }
    }

    private fun loadOrders(list: List<FollowupHistoryItem>){
        val followupHistoryAdapter = FollowupHistoryAdapter(requireContext(), list){ _ ->
        }.apply {
            notifyDataSetChanged()
        }

        binding.rvOrderList.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = followupHistoryAdapter
            setHasFixedSize(false)
        }
    }
}