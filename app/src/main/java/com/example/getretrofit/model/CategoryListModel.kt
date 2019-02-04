package com.example.getretrofit.model

import com.google.gson.annotations.SerializedName

data class CategoryListModel(

        @SerializedName("id")
        var id: Int,
        @SerializedName("tutor_id")
        var tutor_id: Int,
        @SerializedName("category")
        var category: Category


)
