package com.espy.broadway_sales.ui.shops.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.espy.broadway_sales.R
import com.espy.broadway_sales.api.models.shops.EnquiryItem
import com.espy.broadway_sales.utils.CommonUtils

class PendingOrderListAdapter internal constructor(private val context: Context, private val mData: List<EnquiryItem>, val clickHandler: (order: EnquiryItem, type: Int) -> Unit) : RecyclerView.Adapter<PendingOrderListAdapter.ViewHolder>()  {

    private val mInflater: LayoutInflater = LayoutInflater.from(context)

    inner class ViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var dot: TextView = itemView.findViewById(R.id.dot)
//        internal var destiny: TextView = itemView.findViewById(R.id.destiny)
        internal var tvAdultCount: TextView = itemView.findViewById(R.id.tvAdultCount)
//        internal var tvAChildCount: TextView = itemView.findViewById(R.id.tvAChildCount)
//        internal var tvComt: TextView = itemView.findViewById(R.id.tvComt)
//        internal var tvDuration: TextView = itemView.findViewById(R.id.tvDuration)
//        internal var tvQuotation: TextView = itemView.findViewById(R.id.tvQuotation)
//        internal var tvReminder: TextView = itemView.findViewById(R.id.tvReminder)
        internal var tvReceiveDate: TextView = itemView.findViewById(R.id.tvReceiveDate)
        internal var tvNotes: TextView = itemView.findViewById(R.id.tvNotes)
        internal var tvStatus: TextView = itemView.findViewById(R.id.tvStatus)
        internal var btnFollowup: Button = itemView.findViewById(R.id.btnFollowup)
        internal var btnFollowupHistory: Button = itemView.findViewById(R.id.btnFollowupHistory)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = mInflater.inflate(R.layout.row_item_order_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = mData[position]

        holder.dot.text = "Next Meeting date: " + CommonUtils.getConvertedDate2(data.next_meet_date?:"")
//        holder.destiny.text = "Destination: " + data.destination
        holder.tvAdultCount.text = "Product: " + data.product
//        holder.tvAChildCount.text = "Children: " + data.child
//        holder.tvDuration.text = "Duration: " + data.duration
//        holder.tvQuotation.text = "Quotation Amount: " + data.quotation_amount
//        holder.tvReminder.text = "Reminder Date: " + CommonUtils.getConvertedDate2(data.reminder_date?:"")
        holder.tvNotes.text = "Description: " + data.description
        holder.tvReceiveDate.text = "Receive Date: " + CommonUtils.getConvertedDate2(data.recieve_date?:"")
//        holder.tvComt.text = "Notes: " + data.comment

        when(data.meeting_status){
            "1" -> holder.tvStatus.text = "Meeting Status: Warm"
            "2" -> holder.tvStatus.text = "Meeting Status: Hot"
            "3" -> holder.tvStatus.text = "Meeting Status: Cold"
            else -> holder.tvStatus.text = "Meeting Status: Not Available"
        }

        holder.btnFollowup.setOnClickListener {
            clickHandler(data, 1)
        }

        holder.btnFollowupHistory.setOnClickListener {
            clickHandler(data, 2)
        }
    }

    override fun getItemCount(): Int {
        return mData.size
    }
}