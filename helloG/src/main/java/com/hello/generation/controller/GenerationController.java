package com.hello.generation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
	
@RestController
@RequestMapping("/HelloG")
public class GenerationController {
			
	@GetMapping("/get1")
	public String hello() {
		return "Hello Generation!!!";
	}
	
	@GetMapping("/get2")
	public String hello2() {
		return "Hello Generation2!!!";
	}

}
