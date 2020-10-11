package com.tomislav.novacic.gitbrowser.extensions

import org.threeten.bp.LocalDate
import org.threeten.bp.format.DateTimeFormatter
import java.util.*

fun String.formatDateString(inputPattern: String, outputPattern: String): String {
    val inputFormatter = DateTimeFormatter.ofPattern(inputPattern, Locale.getDefault())
    val outputFormatter = DateTimeFormatter.ofPattern(outputPattern, Locale.getDefault())
    val date = LocalDate.parse(this, inputFormatter)
    return outputFormatter.format(date)
}