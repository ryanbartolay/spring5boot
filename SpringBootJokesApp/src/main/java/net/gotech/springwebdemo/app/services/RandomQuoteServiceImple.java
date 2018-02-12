package net.gotech.springwebdemo.app.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class RandomQuoteServiceImple implements RandomQuoteService {

	private ChuckNorrisQuotes chuckNorrisQuotes;
	
	public RandomQuoteServiceImple(ChuckNorrisQuotes chuckNorrisQuotes) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
