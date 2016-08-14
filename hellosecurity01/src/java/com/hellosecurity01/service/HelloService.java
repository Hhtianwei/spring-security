package com.hellosecurity01.service;

import org.springframework.stereotype.Component;

@Component("helloService")
public class HelloService {
	public void sayHello(){
		System.out.println("========================");
	}
}
