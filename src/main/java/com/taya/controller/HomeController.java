package com.taya.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class  HomeController {
	
	@ResponseBody
	public String welcome() {
		return "Welcom Spring Boot.";
	}
}
