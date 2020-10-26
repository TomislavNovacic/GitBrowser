package com.tomislav.novacic.gitbrowser.delegates

import com.tomislav.novacic.gitbrowser.data.source.model.Person
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

//medium.com/androiddevelopers/delegating-delegates-to-kotlin-ee0a0b21c52b
//Use ReadProperty<Any?, String> if you need to delegate only the getter
class FormatDelegate : ReadWriteProperty<Any?, String> {
    private var formattedString: String = ""

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return formattedString
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        if (thisRef is Person) {
            thisRef.updateCount++
        }
        formattedString = value.toLowerCase().capitalize()
    }
}