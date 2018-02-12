package com.bartolay.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bartolay.app.controllers.ConstructorInjectedController;
import com.bartolay.app.controllers.PropertyInjectedController;

@SpringBootApplication
public class TempApplication {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(TempApplication.class, args);
		ctx.getBean(PropertyInjectedController.class).sayHello();
		ctx.getBean(ConstructorInjectedController.class).sayHello();
	}
}
