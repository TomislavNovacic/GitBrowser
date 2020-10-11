package com.tomislav.novacic.gitbrowser.data.source.remote

import com.tomislav.novacic.gitbrowser.data.source.model.RepositoryList
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiClient {

    @GET("/search/repositories")
    suspend fun getRepositoryList(@Query("q") searchKeywords: String, @Query("sort") sort: String?, @Query("order") order: String?): RepositoryList
}