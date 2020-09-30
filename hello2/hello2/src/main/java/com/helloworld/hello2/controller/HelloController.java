package com.helloworld.hello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello2")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Objetivos de aprendizagem é conhecimento de Spring,  Métodos e Status Http, e Camadas";
	}

}
