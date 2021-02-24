package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactiveRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveRestServiceApplication.class, args);

		GreetingWebClient client = new GreetingWebClient();
		System.out.println(client.getResult());
	}

}
