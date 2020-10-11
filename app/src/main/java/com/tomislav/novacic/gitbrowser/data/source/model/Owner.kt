package com.tomislav.novacic.gitbrowser.data.source.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Owner {
    @SerializedName("login")
    @Expose
    lateinit var login: String

    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("node_id")
    @Expose
    lateinit var nodeId: String

    @SerializedName("avatar_url")
    @Expose
    lateinit var avatarUrl: String

    @SerializedName("gravatar_id")
    @Expose
    lateinit var gravatarId: String

    @SerializedName("url")
    @Expose
    lateinit var url: String

    @SerializedName("received_events_url")
    @Expose
    lateinit var receivedEventsUrl: String

    @SerializedName("type")
    @Expose
    lateinit var type: String

    @SerializedName("html_url")
    @Expose
    lateinit var htmlUrl: String

    @SerializedName("followers_url")
    @Expose
    lateinit var followersUrl: String

    @SerializedName("following_url")
    @Expose
    lateinit var followingUrl: String

    @SerializedName("gists_url")
    @Expose
    lateinit var gistsUrl: String

    @SerializedName("starred_url")
    @Expose
    lateinit var starredUrl: String

    @SerializedName("subscriptions_url")
    @Expose
    lateinit var subscriptionsUrl: String

    @SerializedName("organizations_url")
    @Expose
    lateinit var organizationsUrl: String

    @SerializedName("repos_url")
    @Expose
    lateinit var reposUrl: String

    @SerializedName("events_url")
    @Expose
    lateinit var eventsUrl: String

    @SerializedName("site_admin")
    @Expose
    val siteAdmin: Boolean? = null
}