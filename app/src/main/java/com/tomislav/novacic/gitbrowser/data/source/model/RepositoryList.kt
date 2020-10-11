package com.tomislav.novacic.gitbrowser.data.source.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class RepositoryList {
    @SerializedName("total_count")
    @Expose
    var totalCount: Int? = null

    @SerializedName("incomplete_results")
    @Expose
    var incompleteResults: Boolean? = null

    @SerializedName("items")
    @Expose
    lateinit var repositories: List<Repository>
}