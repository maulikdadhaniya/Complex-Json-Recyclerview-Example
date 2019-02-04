package com.example.getretrofit.model

import com.google.gson.annotations.SerializedName

data class Category(

        @SerializedName("category_name")
        var category_name: String
)