package com.tomislav.novacic.gitbrowser.data

import com.tomislav.novacic.gitbrowser.data.source.model.Repository

interface OnClick {
    fun onRepositoryClick(repository: Repository)
}