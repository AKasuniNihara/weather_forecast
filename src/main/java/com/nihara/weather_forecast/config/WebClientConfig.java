package com.nihara.weather_forecast.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

	@Value("${openweather.base.url}")
	private String openWeatherBaseUrl;

	@Bean
	public WebClient openWeatherWebClient(WebClient.Builder builder){
		return builder
				.baseUrl(openWeatherBaseUrl)
				.build();
	}
}
