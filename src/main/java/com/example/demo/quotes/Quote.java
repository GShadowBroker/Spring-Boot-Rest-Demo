package com.example.demo.quotes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
	
	private final String type;
	private final QuoteValue value;
	
	public Quote(String type, long id, String quote) {
		this.type = type;
		this.value = new QuoteValue(id, quote);
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	static class QuoteValue {
		
		private final long id;
		private final String quote;
		
		public QuoteValue(long id, String quote) {
			this.id = id;
			this.quote = quote;
		}

		public long getId() {
			return id;
		}

		public String getQuote() {
			return quote;
		}
		
	}

	public String getType() {
		return type;
	}

	public QuoteValue getValue() {
		return value;
	}
	
}
