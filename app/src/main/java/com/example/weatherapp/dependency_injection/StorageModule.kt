package com.example.weatherapp.dependency_injection

import com.example.weatherapp.storage.SharedPreferencesManager
import org.koin.dsl.module

val storeModule = module {
    single { SharedPreferencesManager(context = get(), gson = get()) }
}