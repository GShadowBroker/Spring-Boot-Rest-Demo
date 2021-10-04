package com.example.demo.quotes;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {
	
	private RestTemplate restTemplate;
	
	public QuoteService(RestTemplateBuilder builder) {
		restTemplate = builder.build();
	}
	
	public Quote getRandomQuote() {
		
		String url = "https://quoters.apps.pcfone.io/api/random";
		
		ResponseEntity<Quote> response = restTemplate.getForEntity(url, Quote.class, 1);
		
		if (response.getStatusCode() == HttpStatus.OK) {
			return response.getBody();
		}
		
		return null;
	}
}
