package com.example.getretrofit

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.LinearLayout
import com.example.getretrofit.model.TutorArrayListModel
import com.example.getretrofit.response.MyResponse
import com.example.getretrofit.retrofit.ApiClient
import com.example.getretrofit.retrofit.ApiInterface
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@SuppressLint("Registered")
class MainActivity : AppCompatActivity() {

    var tutorList: ArrayList<TutorArrayListModel> = ArrayList()
    var adapter: MainClassAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview?.layoutManager =
                LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        adapter = MainClassAdapter(this, tutorList)
        loadData()
    }

    private fun loadData() {
        val apiService = ApiClient.client.create(ApiInterface::class.java)
        val call =
                apiService.GETDATA()
        call.enqueue(object : Callback<MyResponse> {
            override fun onResponse(
                    call: Call<MyResponse>,
                    response: Response<MyResponse>
            ) {
                adapter!!.setItem(response.body()!!.data!!.tutorArrayListModel)
                recyclerview.adapter = adapter
            }

            override fun onFailure(call: Call<MyResponse>, t: Throwable) {
                Log.e("MYERROR", "" + t.message)
            }
        })
    }
}
