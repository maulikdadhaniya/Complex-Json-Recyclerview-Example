package com.example.getretrofit.model

import com.example.getretrofit.model.TutorArrayListModel
import com.google.gson.annotations.SerializedName

data class MyDataModel(

        @SerializedName("tutors")
        var tutorArrayListModel: ArrayList<TutorArrayListModel>
)