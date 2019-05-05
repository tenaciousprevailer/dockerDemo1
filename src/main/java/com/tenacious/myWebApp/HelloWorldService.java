package com.tenacious.myWebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldService {

	@GetMapping(path="hello")
	public String sayHelloWorld() {
		return "Hello World ";
	}
	
}
