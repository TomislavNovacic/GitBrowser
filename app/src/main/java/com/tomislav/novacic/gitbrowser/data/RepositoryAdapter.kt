package com.tomislav.novacic.gitbrowser.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.tomislav.novacic.gitbrowser.extensions.formatDateString
import com.tomislav.novacic.gitbrowser.R
import com.tomislav.novacic.gitbrowser.data.source.model.Repository
import kotlinx.android.synthetic.main.item_repository.view.*

private const val DATE_INPUT_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'"
private const val DATE_OUTPUT_FORMAT = "dd.MM.yyyy"

class RepositoriesAdapter(val data: ArrayList<Repository>, private val onClick: OnClick) : RecyclerView.Adapter<RepositoriesAdapter.RepositoryViewHolder>() {

    class RepositoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(repository: Repository, onClick: OnClick) {
            Glide.with(itemView.context)
                .load(repository.owner.avatarUrl)
                .apply(RequestOptions.circleCropTransform())
                .placeholder(R.drawable.ic_avatar_placeholder)
                .into(itemView.avatar)
            itemView.repositoryName.text = repository.name
            itemView.owner.text = repository.owner.login
            itemView.updateDate.text = repository.updatedAt.formatDateString(DATE_INPUT_FORMAT, DATE_OUTPUT_FORMAT)
            itemView.watchersCount.text = repository.watchersCount.toString()
            itemView.forkCount.text = repository.forksCount.toString()
            itemView.issueCount.text = repository.openIssuesCount.toString()
            itemView.container.setOnClickListener(OnItemClick(repository, onClick))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryViewHolder {
        return RepositoryViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_repository, parent, false))
    }

    override fun onBindViewHolder(viewHolder: RepositoryViewHolder, position: Int) {
        viewHolder.bind(data[position], onClick)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    private class OnItemClick(repository: Repository, onClick: OnClick) : View.OnClickListener {
        private var mRepository = repository
        private var mOnItemClick: OnClick = onClick

        override fun onClick(view: View) {
            mOnItemClick.onRepositoryClick(mRepository)
        }
    }
}