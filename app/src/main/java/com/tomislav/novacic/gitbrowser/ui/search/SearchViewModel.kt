package com.tomislav.novacic.gitbrowser.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tomislav.novacic.gitbrowser.data.source.model.RepositoryList
import kotlinx.coroutines.launch

class SearchViewModel(private val repository: SearchRepository) : ViewModel() {

    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean> = _loading

    private val _repositoryList = MutableLiveData<RepositoryList?>()
    val repositoryList: LiveData<RepositoryList?> = _repositoryList

    init {
        _loading.postValue(false)
    }

    fun getRepositoryList(searchKeywords: String, sort: String?, order: String?) {
        _loading.postValue(true)
        viewModelScope.launch {
            val response = repository.getRepositoryList(searchKeywords, sort, order)
            _repositoryList.postValue(response)
            _loading.postValue(false)
        }
    }
}