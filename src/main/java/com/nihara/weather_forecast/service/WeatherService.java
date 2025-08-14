package com.nihara.weather_forecast.service;

import com.nihara.weather_forecast.client.WeatherApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

	private static final Logger LOGGER = LoggerFactory.getLogger(WeatherService.class);

	private final WeatherApiClient weatherApiClient;

	public WeatherService(WeatherApiClient weatherApiClient){
		this.weatherApiClient = weatherApiClient;
	}

	public String getWeatherForAllCities(String cityIds) {

		LOGGER.info("API call: get weather for all cities");

		return weatherApiClient.getWeatherDataByCityIds(cityIds);

	}

}
