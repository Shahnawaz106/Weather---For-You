package com.shahnawaz.weatherapp.domain.repository

import com.shahnawaz.weatherapp.util.Resource
import com.shahnawaz.weatherapp.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}