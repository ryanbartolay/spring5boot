package net.gotech.springwebdemo.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class RandomQuoteServiceImpl implements RandomQuoteService {
	
	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public RandomQuoteServiceImpl() {
		chuckNorrisQuotes = new ChuckNorrisQuotes();
	} 
	
	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
