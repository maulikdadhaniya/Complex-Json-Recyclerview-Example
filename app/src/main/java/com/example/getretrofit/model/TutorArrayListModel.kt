package com.example.getretrofit.model

import com.google.gson.annotations.SerializedName

data class TutorArrayListModel(

        @SerializedName("id")
        var id: Int,
        @SerializedName("first_name")
        var first_name: String,
        @SerializedName("last_name")
        var last_name: String,
        @SerializedName("email")
        var email: String,
        @SerializedName("categories")
        var categoryListModel: ArrayList<CategoryListModel>

)


