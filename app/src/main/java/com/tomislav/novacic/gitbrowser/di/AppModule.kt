package com.tomislav.novacic.gitbrowser.di

import com.tomislav.novacic.gitbrowser.data.source.remote.RetrofitService
import com.tomislav.novacic.gitbrowser.ui.search.SearchRepository
import com.tomislav.novacic.gitbrowser.ui.search.SearchViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { RetrofitService() }
    single { SearchRepository(get()) }
    viewModel { SearchViewModel(get()) }
}