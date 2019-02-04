package com.example.getretrofit

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.getretrofit.model.TutorArrayListModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.row_adapter_main.view.*
import java.util.*

class MainClassAdapter(
        private val context: Context,
        private var items: ArrayList<TutorArrayListModel>
) : RecyclerView.Adapter<MainClassAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_adapter_main, parent, false))
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.firstName.text = items[position].first_name
        holder.lastName.text = items[position].last_name

        holder.recyclerview?.layoutManager =
            LinearLayoutManager(context, LinearLayout.VERTICAL, false)
        holder.recyclerview.adapter = InnerClassAdapter(context,items[position].categoryListModel)


    }


    fun setItem(tuterList: ArrayList<TutorArrayListModel>) {
        items = tuterList
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val firstName = view.txtFname
        val lastName = view.txtLname
        val recyclerview = view.adapterRecyclerview
    }

}
