package com.bartolay.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.bartolay.app.services.GreetingService;

@Controller
public class PropertyInjectedController {
	@Autowired
	private GreetingService greetingService;
	
	public void sayHello() {
		greetingService.sayHello();
	}
}
