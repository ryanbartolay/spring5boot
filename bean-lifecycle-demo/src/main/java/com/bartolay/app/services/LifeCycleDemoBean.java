package com.bartolay.app.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	public LifeCycleDemoBean() { // 1
		System.out.println("Constructor");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception { // 6
		System.out.println("properties set");
	}

	@Override
	public void destroy() throws Exception { // 8 - last
		System.out.println("destroy - terminated");
	}

	@Override
	public void setBeanName(String arg0) { // 2
		System.out.println("set bean name");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException { // 3
		System.out.println("set bean factory");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException { // 4
		System.out.println("application context aware");
	}

	@PostConstruct
	public void postConstruct() { // 5
		System.out.println("post construct");
	}
	
	@PreDestroy
	public void preDestroy() { // 7
		System.out.println("pre destroy");
	}
	
	public void beforeInit() {
		System.out.println("before init");
	}
	
	public void afterInit() {
		System.out.println("after init");
	}
}
