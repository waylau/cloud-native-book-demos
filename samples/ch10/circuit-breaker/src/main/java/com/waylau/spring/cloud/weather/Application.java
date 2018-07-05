package com.waylau.spring.cloud.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 主应用程序.
 * 
 * @since 1.0.0 2018年7月5日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@SpringBootApplication
@EnableCircuitBreaker
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public RestTemplate rest(RestTemplateBuilder builder) {
		return builder.build();
	}

}
