package com.nihara.weather_forecast.controller;

import com.nihara.weather_forecast.dto.response.ApiResponse;
import com.nihara.weather_forecast.service.WeatherService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WeatherController {

	private final WeatherService weatherService;

	public WeatherController(WeatherService weatherService){
		this.weatherService = weatherService;
	}

	@GetMapping("/weather")
	@Cacheable("weatherDate")
	public ResponseEntity<ApiResponse> getWeather(@RequestParam String cityIds) {
		ApiResponse apiResponse = new ApiResponse(true, 200, weatherService.getWeatherForAllCities(cityIds));
		return new ResponseEntity<>(apiResponse, HttpStatus.OK);
	}

}
