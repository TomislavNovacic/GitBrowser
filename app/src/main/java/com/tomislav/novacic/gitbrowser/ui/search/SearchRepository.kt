package com.tomislav.novacic.gitbrowser.ui.search

import com.tomislav.novacic.gitbrowser.data.source.model.RepositoryList
import com.tomislav.novacic.gitbrowser.data.source.remote.RetrofitService

class SearchRepository(private val retrofitService: RetrofitService) {

    suspend fun getRepositoryList(searchKeywords: String, sort: String?, order: String?): RepositoryList {
        val apiClient = retrofitService.provideRetrofitService()
        return apiClient.getRepositoryList(searchKeywords, sort, order)
    }
}