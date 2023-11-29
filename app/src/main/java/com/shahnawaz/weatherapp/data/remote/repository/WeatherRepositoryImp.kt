package com.shahnawaz.weatherapp.data.remote.repository

import com.shahnawaz.weatherapp.data.remote.WeatherApi
import com.shahnawaz.weatherapp.data.remote.mappers.toWeatherInfo
import com.shahnawaz.weatherapp.domain.repository.WeatherRepository
import com.shahnawaz.weatherapp.util.Resource
import com.shahnawaz.weatherapp.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImp @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch(e: Exception){
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}