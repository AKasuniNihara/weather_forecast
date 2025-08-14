package com.nihara.weather_forecast;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherForecastApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(WeatherForecastApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WeatherForecastApplication.class, args);
		LOGGER.info("#################################################################################################");
		LOGGER.info("########################## Started the Weather Forecasting application ##########################");
		LOGGER.info("#################################################################################################");
	}

}
