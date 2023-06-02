package com.chan.codebank.ui.home

import com.chan.codebank.data.entity.Category


/**
 * Created by Chandrabhan Haribhau Aher on 25-05-2023.
 * chandrabhan99@gmail.com
 */
data class HomeViewState(
    val categories: List<Category> = emptyList(),
    val selectedCategory: Category? = null
)
