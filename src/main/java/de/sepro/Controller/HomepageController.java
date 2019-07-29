package de.sepro.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomepageController {
	
	@RequestMapping("/")
	public String sayHello() {
		return "<h1>Hello whad up?</h1>";
	}
}
