package com.espy.broadway_sales.ui.sync.view

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProvider
import com.espy.broadway_sales.R
import com.espy.broadway_sales.databinding.ActivitySyncBinding
import com.espy.broadway_sales.ui.base.BaseActivity

class SyncActivity : BaseActivity<ActivitySyncBinding>(
    R.layout.activity_sync,
    true,
    R.string.sync_all_data
)  {

    private lateinit var viewModel: SyncViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this).get(SyncViewModel::class.java)
        binding?.apply {
            lifecycleOwner = this@SyncActivity
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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}