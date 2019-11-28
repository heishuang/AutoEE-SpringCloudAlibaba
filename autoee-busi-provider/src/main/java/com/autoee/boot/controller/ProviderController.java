package com.autoee.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
	
	@Value("${server.port}")
	private String serverPort;
	
	@GetMapping(value = "/provider/test/{callName}")
	public String providerTest(@PathVariable("callName") String callName) {
		return "providerTest: Hello World! I am from port " + serverPort + " -- call by " + callName;
	}
}
