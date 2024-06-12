package com.example.weatherapp.dependency_injection

import com.example.weatherapp.fragments.home.HomeViewModel
import com.example.weatherapp.fragments.location.LocationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(weatherDataRepository = get()) }
    viewModel { LocationViewModel(weatherDataRepository = get()) }
}