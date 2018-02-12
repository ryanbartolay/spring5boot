package com.bartolay.app.controllers;

import org.springframework.stereotype.Controller;

import com.bartolay.app.services.GreetingService;

@Controller
public class SetterInjectedController {
	private GreetingService greetingService;

	public GreetingService getGreetingService() {
		return greetingService;
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
