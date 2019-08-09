package de.sepro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/")
public class HomepageController {
	
	@Autowired
	
	public String sayHello() {
		return "<h1>\"JUSTICE. JUSTICE. JUSTICE\" - OVER JUSTICE</h1>";
	}
}
