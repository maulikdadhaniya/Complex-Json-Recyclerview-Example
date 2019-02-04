package com.example.getretrofit.response

import com.example.getretrofit.model.MyDataModel
import com.google.gson.annotations.SerializedName

data class MyResponse(
        @SerializedName("is_error")
        var is_error: Boolean,
        @SerializedName("data")
        var data: MyDataModel?,
        @SerializedName("message")
        var message: String,
        @SerializedName("page_count")
        var page_count: String
)