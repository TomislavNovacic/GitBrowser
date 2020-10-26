package com.tomislav.novacic.gitbrowser.data.source.model

import com.tomislav.novacic.gitbrowser.delegates.FormatDelegate

class Person(name: String, lastname: String) {
    var name: String by FormatDelegate()
    var lastname: String by FormatDelegate()
    var updateCount = 0
}