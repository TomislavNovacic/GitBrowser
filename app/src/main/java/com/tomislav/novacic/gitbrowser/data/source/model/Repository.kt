package com.tomislav.novacic.gitbrowser.data.source.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Repository {
    @SerializedName("id")
    @Expose
    val id: Int? = null

    @SerializedName("node_id")
    @Expose
    lateinit var nodeId: String

    @SerializedName("name")
    @Expose
    lateinit var name: String

    @SerializedName("full_name")
    @Expose
    lateinit var fullName: String

    @SerializedName("owner")
    @Expose
    lateinit var owner: Owner

    @SerializedName("private")
    @Expose
    var private: Boolean? = null

    @SerializedName("html_url")
    @Expose
    lateinit var htmlUrl: String

    @SerializedName("description")
    @Expose
    lateinit var description: String

    @SerializedName("fork")
    @Expose
    val fork: Boolean? = null

    @SerializedName("url")
    @Expose
    lateinit var url: String

    @SerializedName("created_at")
    @Expose
    lateinit var createdAt: String

    @SerializedName("updated_at")
    @Expose
    lateinit var updatedAt: String

    @SerializedName("pushed_at")
    @Expose
    lateinit var pushedAt: String

    @SerializedName("homepage")
    @Expose
    lateinit var homepage: String

    @SerializedName("size")
    @Expose
    val size: Int? = null

    @SerializedName("stargazers_count")
    @Expose
    val stargazersCount: Int? = null

    @SerializedName("watchers_count")
    @Expose
    val watchersCount: Int? = null

    @SerializedName("language")
    @Expose
    lateinit var language: String

    @SerializedName("forks_count")
    @Expose
    val forksCount: Int? = null

    @SerializedName("open_issues_count")
    @Expose
    val openIssuesCount: Int? = null

    @SerializedName("master_branch")
    @Expose
    lateinit var masterBranch: String

    @SerializedName("default_branch")
    @Expose
    lateinit var defaultBranch: String

    @SerializedName("score")
    @Expose
    val score: Int? = null
}