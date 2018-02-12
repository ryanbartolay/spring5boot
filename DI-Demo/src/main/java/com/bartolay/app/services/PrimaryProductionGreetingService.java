package com.bartolay.app.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("production")
public class PrimaryProductionGreetingService implements GreetingService {

	@Override
	public void sayHello() {
		System.out.println("production hello???");
	}
}
