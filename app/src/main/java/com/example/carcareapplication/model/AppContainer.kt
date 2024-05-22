package com.example.carcareapplication.model

import android.content.Context
import com.example.carcareapplication.model.repositories.UserRepository

interface AppContainer {
    val userRepository: UserRepository
}
class AppDataContainer(private val context: Context): AppContainer {

    override val userRepository: UserRepository by lazy {
        UserRepository(AppDatabase.getDatabase(context).userDao())
    }
}