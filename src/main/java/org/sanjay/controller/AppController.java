package org.sanjay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

	@GetMapping("/hello")
	@ResponseBody
	public String getString() {
		System.out.println("Hello ======");
		return "Hello Spring Again";
	}

// ONe way of resolving the view as below. Another way is by enabling the resolver bean in the dispatcher dispatcher servlet.
	@GetMapping("/index")
	public String getViews() {
		System.out.println("index ======");
		return "index";
	}

}
