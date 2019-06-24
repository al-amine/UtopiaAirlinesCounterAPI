package com.st.utopia.counter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CounterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterAppApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemnplate() {
		return new RestTemplate();
	}

}