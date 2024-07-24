package com.prop.rest.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prop.constansts.AppConstants;
import com.prop.propties.AppProperties;

@RestController
public class MessageRestController {
	
//	@Value("${greetMessage}")
//	private String greetMsg;
//		
//	@Value("${welcomeMessage}")
//	private String welcomeMsg;
	
	@Autowired
	private AppProperties appProperties;
	
	@GetMapping("/greet")
	private String greet() {
		Map<String, String> messages = appProperties.getMessages();
		String greetMsg = messages.get(AppConstants.GREET_MSG_KEY);
		return greetMsg;
	}
	
	@GetMapping("/welcome")
	private String welcome() {
		Map<String, String> messages = this.appProperties.getMessages();
		String welcomeMsg = messages.get(AppConstants.WELCOME_MSG_KEY);
		return welcomeMsg;
	}
	
}
