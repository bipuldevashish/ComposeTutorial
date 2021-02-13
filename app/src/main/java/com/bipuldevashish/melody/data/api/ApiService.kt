package com.bipuldevashish.melody.data.api

import com.bipuldevashish.melody.data.models.ItemSearchTrack
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


interface ApiService {

    companion object {
        const val BASE_URL = "https://api.pexels.com/v1/"
    }

    @Headers("Authorization: ")
    @GET("curated/")
    suspend fun getSearchTrackResults(
            @Query("query") query: String,
            @Query("page") page: Int,
            @Query("per_page") perPage: Int
    ): ItemSearchTrack
}