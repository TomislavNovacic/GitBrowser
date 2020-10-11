package com.tomislav.novacic.gitbrowser

import android.app.Application
import com.tomislav.novacic.gitbrowser.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class GitBrowserApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@GitBrowserApplication)
            modules(appModule)
        }
    }
}