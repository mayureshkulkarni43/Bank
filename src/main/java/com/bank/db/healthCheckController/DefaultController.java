package com.bank.db.healthCheckController;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

	
	@GetMapping("/ping")
	
public String healthCheck() {
		return "SUCCESS"+new Date().toString();
	}
}
