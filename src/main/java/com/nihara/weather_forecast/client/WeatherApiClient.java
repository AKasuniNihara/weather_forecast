package com.nihara.weather_forecast.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class WeatherApiClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(WeatherApiClient.class);

	@Value("${openweathermap.api.key}")
	private String openWeatherApiKey;

	private final WebClient webClient;

	public WeatherApiClient(WebClient openWeatherWebClient){
		this.webClient = openWeatherWebClient;
	}

	public String getWeatherDataByCityIds(String cityIds) {

		return webClient.get()
				.uri(uriBuilder -> uriBuilder
						.path("/weather")
						.queryParam("id", cityIds)
						.queryParam("units", "metric")
						.queryParam("appid", openWeatherApiKey)
						.build())
				.retrieve()
				.bodyToMono(String.class)
				.block();
	}


}
