package com.example.demo.quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {
	
	@Autowired
	QuoteService quoteService;
	
	@GetMapping("/quote")
	public Quote randomQuote() {
		return quoteService.getRandomQuote();
	}
	
}
