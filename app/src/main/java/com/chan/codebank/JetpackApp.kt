package com.chan.codebank

import android.app.Application
import com.chan.codebank.data.room.RoomBuilder


/**
 * Created by Chandrabhan Haribhau Aher on 02-06-2023.
 * chandrabhan99@gmail.com
 */
class JetpackApp: Application() {
    override fun onCreate() {
        super.onCreate()
        RoomBuilder.provide(this)
    }
}