package net.gotech.springwebdemo.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.gotech.springwebdemo.app.services.RandomQuoteService;

@Controller
public class JokesController {
	
	private RandomQuoteService rqs;
	
	public JokesController(RandomQuoteService rqs) {
		this.rqs = rqs;
	}

	@RequestMapping(path= {"/", ""})
	public String index(Model model) {
		model.addAttribute("joke", rqs.getJoke());
		return "joke";
	}
}
