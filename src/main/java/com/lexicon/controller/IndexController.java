package com.lexicon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class IndexController {
	
	@GetMapping("/")
	public String index() {
		return "Hello There ! I am running mode";
	}

}
