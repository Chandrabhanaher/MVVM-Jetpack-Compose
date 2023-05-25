package com.chan.codebank.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chan.codebank.data.Category
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch


/**
 * Created by Chandrabhan Haribhau Aher on 25-05-2023.
 * chandrabhan99@gmail.com
 */
class HomeViewModel : ViewModel() {

    private val _state = MutableStateFlow(HomeViewState())
    private val _selectedCategory = MutableStateFlow<Category?> (null)

    val state: StateFlow<HomeViewState>
        get() = _state

    fun selectedCategory(category: Category) {
        _selectedCategory.value = category
    }

    init {
        val categories = MutableStateFlow<List<Category>>(
            mutableListOf(
                Category(1, "Food"),
                Category(2, "Health"),
                Category(3, "Saving"),
                Category(4, "Drinks"),
                Category(5, "Clothing"),
                Category(6, "Investment"),
                Category(7, "Travel"),
                Category(8, "Fuel"),
                Category(9, "Repairs"),
                Category(10, "Coffee")
            )
        )
        viewModelScope.launch {
            combine(
                categories.onEach { category ->
                    if (categories.value.isNotEmpty() && _selectedCategory.value == null) {
                        _selectedCategory.value = category[0]
                    }
                }, _selectedCategory
            ) { categories, selectedCategory ->
                HomeViewState(categories = categories, selectedCategory = selectedCategory)
            }.collect { _state.value = it }
        }
    }

}