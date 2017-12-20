package com.hao.guanqing.projectkotlin.api

import com.hao.guanqing.projectkotlin.BuildConfig
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import com.facebook.stetho.okhttp3.StethoInterceptor
import okhttp3.OkHttpClient

class TestService private constructor() {

    companion object Instance {

        @JvmField val INSTANCE: TestService = TestService()

        private val HTTP_CLIENT: OkHttpClient = OkHttpClient.Builder()
                .addNetworkInterceptor(StethoInterceptor())
                .build()

        private val RETROFIT: Retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.END_POINT)
                .client(HTTP_CLIENT)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }

    fun getMessage(): Observable<Message> {
        return RETROFIT
                .create(TestApi::class.java)
                .getMessage()
    }
}