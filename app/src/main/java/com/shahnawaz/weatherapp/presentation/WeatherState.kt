package com.shahnawaz.weatherapp.presentation

import com.shahnawaz.weatherapp.weather.WeatherInfo


data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)