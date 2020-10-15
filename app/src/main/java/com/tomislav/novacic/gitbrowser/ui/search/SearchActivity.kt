package com.tomislav.novacic.gitbrowser.ui.search

import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.LinearLayout
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DividerItemDecoration
import com.tomislav.novacic.gitbrowser.R
import com.tomislav.novacic.gitbrowser.base.BaseActivity
import com.tomislav.novacic.gitbrowser.data.OnClick
import com.tomislav.novacic.gitbrowser.data.RepositoriesAdapter
import com.tomislav.novacic.gitbrowser.data.source.model.Repository
import com.tomislav.novacic.gitbrowser.helpers.SearchHelper.Companion.SORT_OPTION_UPDATED
import com.tomislav.novacic.gitbrowser.helpers.SearchHelper.Companion.order
import com.tomislav.novacic.gitbrowser.helpers.SearchHelper.Companion.setSortOption
import com.tomislav.novacic.gitbrowser.helpers.SearchHelper.Companion.sortOption
import com.tomislav.novacic.gitbrowser.ui.repositoryDetails.RepositoryDetailsActivity
import kotlinx.android.synthetic.main.activity_search.*
import org.koin.android.viewmodel.ext.android.viewModel

class SearchActivity : BaseActivity(), OnClick {

    private val viewModel: SearchViewModel by viewModel()
    private val repositoriesAdapter by lazy { RepositoriesAdapter(repositoryList, this) }
    private val repositoryList by lazy { arrayListOf<Repository>() }

    override fun provideLayout() = R.layout.activity_search

    override fun init() {
        viewModel.loading.observe(this) {
            progress.visibility = if (it == true) View.VISIBLE else View.GONE
        }

        viewModel.repositoryList.observe(this) {
            it.takeUnless { it?.repositories.isNullOrEmpty() }.apply {
                if (noRepositoriesImg.isVisible) {
                    noRepositoriesImg.visibility = View.GONE
                }
                repositoryList.clear()
                repositoryList.addAll(it?.repositories!!)
                repositoriesAdapter.notifyDataSetChanged()
            } ?: run {
                noRepositoriesImg.visibility = View.VISIBLE
            }
        }

        searchKeywords.setOnEditorActionListener { view, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                if (noRepositoriesImg.isVisible) {
                    noRepositoriesImg.visibility = View.GONE
                }
                setSortOption(SORT_OPTION_UPDATED)
                viewModel.getRepositoryList(view.text.toString(), sortOption.value, order.value)
            }
            false
        }

        recyclerView.addItemDecoration(DividerItemDecoration(applicationContext, LinearLayout.VERTICAL))
        recyclerView.adapter = repositoriesAdapter
    }

    override fun onRepositoryClick(repository: Repository) {
        startActivity(RepositoryDetailsActivity.newInstance(applicationContext, repository))
    }
}