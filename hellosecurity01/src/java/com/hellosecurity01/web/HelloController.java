package com.hellosecurity01.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping(value="/first",method = RequestMethod.GET)
	@ResponseBody
	public String sayHello1(){
		System.out.println("=====hello test======");
		return "hello";
	}
	
	@RequestMapping(value="/second",method = RequestMethod.GET)
	public String sayHello2(Model model)
	{
		model.addAttribute("name","tian");
		System.out.println("=====hello test 22222======");
		return "hello";
	}
}
