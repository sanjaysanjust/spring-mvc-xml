package org.sanjay.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/message")
	public String getMessage() {
		return "Message Recieved Again And Again";
	}

}
