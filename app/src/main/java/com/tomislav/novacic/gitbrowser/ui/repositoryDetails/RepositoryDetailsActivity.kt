package com.tomislav.novacic.gitbrowser.ui.repositoryDetails

import android.content.Context
import android.content.Intent
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.tomislav.novacic.gitbrowser.Constants.Companion.DATE_INPUT_FORMAT
import com.tomislav.novacic.gitbrowser.Constants.Companion.DATE_OUTPUT_FORMAT
import com.tomislav.novacic.gitbrowser.R
import com.tomislav.novacic.gitbrowser.base.BaseActivity
import com.tomislav.novacic.gitbrowser.data.source.model.Repository
import com.tomislav.novacic.gitbrowser.extensions.formatDateString
import kotlinx.android.synthetic.main.activity_repository_details.*


class RepositoryDetailsActivity : BaseActivity() {

    private val repository by lazy { intent.getParcelableExtra<Repository>(KEY_REPOSITORY) }

    companion object {
        private const val KEY_REPOSITORY = "KEY_REPOSITORY"

        fun newInstance(context: Context, repository: Repository) = Intent(context, RepositoryDetailsActivity::class.java).apply {
                putExtra(KEY_REPOSITORY, repository)
            }
    }

    override fun provideLayout() = R.layout.activity_repository_details

    override fun init() {
        title = repository?.fullName
        showUpButton()
        populateLayout()
    }

    private fun populateLayout() {
        Glide.with(applicationContext)
            .load(repository?.owner?.avatarUrl)
            .apply(RequestOptions.circleCropTransform()).placeholder(R.drawable.ic_avatar_placeholder)
            .into(ownerImg)
        updateDate.text = String.format(getString(R.string.last_update_label), repository?.updatedAt?.formatDateString(DATE_INPUT_FORMAT, DATE_OUTPUT_FORMAT))
        owner.text = repository?.owner?.login
        watchersCount.text = repository?.watchersCount.toString()
        forkCount.text = repository?.forksCount.toString()
        issueCount.text = repository?.openIssuesCount.toString()
        repoName.text = repository?.name
        description.text = repository?.description
    }
}