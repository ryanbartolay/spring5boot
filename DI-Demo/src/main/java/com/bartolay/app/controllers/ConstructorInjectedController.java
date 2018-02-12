package com.bartolay.app.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.bartolay.app.services.GreetingService;

@Controller
public class ConstructorInjectedController {
	private GreetingService greetingService;

	public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public void sayHello() {
		greetingService.sayHello();
	}

}
