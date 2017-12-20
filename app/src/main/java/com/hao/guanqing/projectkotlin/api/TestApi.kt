package com.hao.guanqing.projectkotlin.api

import io.reactivex.Observable
import retrofit2.http.GET

interface TestApi {

    @GET("/api/test")
    fun getMessage(): Observable<Message>
}