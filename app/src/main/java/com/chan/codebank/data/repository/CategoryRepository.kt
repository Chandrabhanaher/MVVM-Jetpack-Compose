package com.chan.codebank.data.repository

import com.chan.codebank.data.entity.Category
import com.chan.codebank.data.room.CategoryDao
import kotlinx.coroutines.flow.Flow


/**
 * Created by Chandrabhan Haribhau Aher on 02-06-2023.
 * chandrabhan99@gmail.com
 */
class CategoryRepository(
    private val categoryDeo: CategoryDao
) {
    fun categories(): Flow<List<Category>> = categoryDeo.categories()
    fun getCategoryWithName(categoryId: Long) = categoryDeo.getCategoryWithIn(categoryId)

    /**
     * Add a category to the database if it dose not exit
     * @return the id of the newly added/created category
     */

    suspend fun addCategory(category: Category): Long{
        return when(val result = categoryDeo.getCategoryWithName(category.name)){
            null-> categoryDeo.insert(category)
            else ->result.id
        }
    }
}