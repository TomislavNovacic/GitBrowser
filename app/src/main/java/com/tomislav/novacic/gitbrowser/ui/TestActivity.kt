package com.tomislav.novacic.gitbrowser.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tomislav.novacic.gitbrowser.data.source.model.Person

class TestActivity : AppCompatActivity() {

    lateinit var person: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        person = Person("tomislav", "novacic")
        person.name = "ivan"
        person.lastname = "ivic"
        Toast.makeText(this, "${person.name} ${person.lastname}", Toast.LENGTH_SHORT).show()
    }
}