package com.example.getretrofit

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.getretrofit.model.CategoryListModel
import kotlinx.android.synthetic.main.row_adapter_inner.view.*
import java.util.*

class InnerClassAdapter(
        private val context: Context,
        private var items: ArrayList<CategoryListModel>
) : RecyclerView.Adapter<InnerClassAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_adapter_inner, parent, false))
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.firstName.text = items[position].category.category_name
    }

    fun setItem(tuterList: ArrayList<CategoryListModel>) {
        items = tuterList
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val firstName = view.txtFname
    }

}
