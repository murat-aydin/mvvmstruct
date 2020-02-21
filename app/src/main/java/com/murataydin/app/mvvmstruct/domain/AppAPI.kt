package com.murataydin.app.mvvmstruct.domain

import com.murataydin.app.mvvmstruct.domain.response.Comics
import io.reactivex.Observable
import retrofit2.http.GET

interface AppAPI {

    @GET("api/comics")
    fun getComics(): Observable<Comics>
}
