package com.tomislav.novacic.gitbrowser.helpers

class SearchHelper {

    companion object {
        const val SORT_OPTION_STARS = 1
        const val SORT_OPTION_FORKS = 2
        const val SORT_OPTION_HELP_WANTED_ISSUES = 3
        const val SORT_OPTION_UPDATED = 4
        const val SORT_OPTION_BEST_MATCH = 5
        const val ORDER_DESC = 4
        const val ORDER_ASC = 5

        var sortOption = SortOption.BEST_MATCH
            private set

        var order = Order.DESC
            private set

        fun setSortOption(sortOptionFlag: Int) {
            when (sortOptionFlag) {
                SORT_OPTION_STARS -> sortOption = SortOption.STARS
                SORT_OPTION_FORKS -> sortOption = SortOption.FORKS
                SORT_OPTION_HELP_WANTED_ISSUES -> sortOption = SortOption.HELP_WANTED_ISSUES
                SORT_OPTION_UPDATED -> sortOption = SortOption.UPDATED
                SORT_OPTION_BEST_MATCH -> sortOption = SortOption.BEST_MATCH
            }
        }

        fun setOrder(orderFlag: Int) {
            when (orderFlag) {
                ORDER_DESC -> order = Order.DESC
                ORDER_ASC -> order = Order.ASC
            }
        }
    }
}

enum class SortOption(var value: String?) {
    STARS("stars"),
    FORKS("forks"),
    HELP_WANTED_ISSUES("help-wanted-issues"),
    UPDATED("updated"),
    BEST_MATCH(null),
}

enum class Order(var value: String?) {
    DESC(null),
    ASC("asc")
}