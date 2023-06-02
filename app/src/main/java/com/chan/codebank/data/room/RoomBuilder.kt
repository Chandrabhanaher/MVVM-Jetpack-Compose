package com.chan.codebank.data.room

import android.content.Context
import androidx.room.Room
import com.chan.codebank.data.repository.CategoryRepository


/**
 * Created by Chandrabhan Haribhau Aher on 02-06-2023.
 * chandrabhan99@gmail.com
 */

/**
 * Simple singleton dependency graph
 *
 * For a real app, please use something like Koin/Dagger/Hilt instead
 */

object RoomBuilder {
    lateinit var appLocalDatabase: AppLocalDatabase
        private set

    val categoryRepository by lazy {
        CategoryRepository(
            categoryDeo = appLocalDatabase.categoryDao()
        )
    }

    fun provide(context: Context) {
        appLocalDatabase = Room.databaseBuilder(
            context,
            AppLocalDatabase::class.java,
            "app_db")
            .fallbackToDestructiveMigration()
            .allowMainThreadQueries()
            .build()
    }

}