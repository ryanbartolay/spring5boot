package com.bartolay.app.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	@Override
	public void sayHello() {
		System.out.println("Hello");
	}

}
