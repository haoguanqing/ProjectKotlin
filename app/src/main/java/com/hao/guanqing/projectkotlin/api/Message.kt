package com.hao.guanqing.projectkotlin.api

import com.google.gson.annotations.SerializedName

class Message {

    @SerializedName(value = "message")
    lateinit var message: String
}