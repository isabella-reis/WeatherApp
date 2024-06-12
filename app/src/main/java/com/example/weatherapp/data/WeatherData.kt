package com.example.weatherapp.data

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

sealed class WeatherData

data class CurrentLocation (
    val date: String = getCurrentDate(),
    val latitude: Double? = null,
    val longitude: Double? = null,
    val location: String = "Selecione sua localização"
) : WeatherData()

data class CurrentWeather(
    val icon: String,
    val temperature: Float,
    val wind: Float,
    val humidity: Int,
    val chanceOfRain: Int
) : WeatherData()

data class Forecast(
    val time: String,
    val temperature: Float,
    val feelsLikeTemperature: Float,
    val icon: String
) : WeatherData()

private fun getCurrentDate(): String {
    val currentDate = Date()
    val formatter = SimpleDateFormat("dd 'de' MMMM 'de' yyyy").format(currentDate);
    return "Hoje, ${formatter.format(currentDate)}"
}

