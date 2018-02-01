package com.tch.marketing.hub.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/v1")
public class HelloSpring {

	@RequestMapping(value="hello", method = RequestMethod.GET)
	public String hello(@RequestParam("name") String name){
		return "Hello from Spring Boot "+name;
	}
}
