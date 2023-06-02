package com.chan.codebank.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.chan.codebank.data.entity.Category


/**
 * Created by Chandrabhan Haribhau Aher on 02-06-2023.
 * chandrabhan99@gmail.com
 */
@Database(entities = [Category::class], version = 1, exportSchema = false)

abstract class AppLocalDatabase: RoomDatabase() {
    abstract fun categoryDao(): CategoryDao
}