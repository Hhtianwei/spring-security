package com.hellosecurity01.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloServiceTest {
	public static void main(String args[]){
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext("com.hellosecurity01");
		HelloService service = (HelloService) context.getBean("helloService");
		service.sayHello();
	}
}
