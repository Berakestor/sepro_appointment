package de.sepro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomepageController {
	
	@RequestMapping("/")
	public String sayHello() {
		//Programmers note: "He is da Homepage. Repecc him"
		return "<h1>Ik bin da Homepage./h1>";
	}
}
