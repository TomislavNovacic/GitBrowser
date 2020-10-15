package com.tomislav.novacic.gitbrowser.data.source.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RepositoryList(
    @SerializedName("total_count")
    @Expose
    val totalCount: Int?,

    @SerializedName("incomplete_results")
    @Expose
    val incompleteResults: Boolean?,

    @SerializedName("items")
    @Expose
    val repositories: List<Repository>?
)