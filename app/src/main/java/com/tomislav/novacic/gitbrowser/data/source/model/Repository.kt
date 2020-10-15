package com.tomislav.novacic.gitbrowser.data.source.model

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Repository(
    @SerializedName("id")
    @Expose
    val id: Int?,
    @SerializedName("node_id")
    @Expose
    val nodeId: String?,
    @SerializedName("name")
    @Expose
    val name: String?,

    @SerializedName("full_name")
    @Expose
    val fullName: String?,

    @SerializedName("owner")
    @Expose
    val owner: Owner?,

    @SerializedName("private")
    @Expose
    val private: Boolean?,

    @SerializedName("html_url")
    @Expose
    val htmlUrl: String?,

    @SerializedName("description")
    @Expose
    val description: String?,

    @SerializedName("fork")
    @Expose
    val fork: Boolean?,

    @SerializedName("url")
    @Expose
    val url: String?,

    @SerializedName("created_at")
    @Expose
    val createdAt: String?,

    @SerializedName("updated_at")
    @Expose
    val updatedAt: String?,

    @SerializedName("pushed_at")
    @Expose
    val pushedAt: String?,

    @SerializedName("homepage")
    @Expose
    val homepage: String?,

    @SerializedName("size")
    @Expose
    val size: Int?,

    @SerializedName("stargazers_count")
    @Expose
    val stargazersCount: Int?,

    @SerializedName("watchers_count")
    @Expose
    val watchersCount: Int?,

    @SerializedName("language")
    @Expose
    val language: String?,

    @SerializedName("forks_count")
    @Expose
    val forksCount: Int?,

    @SerializedName("open_issues_count")
    @Expose
    val openIssuesCount: Int?,

    @SerializedName("master_branch")
    @Expose
    val masterBranch: String?,

    @SerializedName("default_branch")
    @Expose
    val defaultBranch: String?,

    @SerializedName("score")
    @Expose
    val score: Int?
) : Parcelable