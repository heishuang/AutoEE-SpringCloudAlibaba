package com.autoee.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.autoee.boot.service.FeignService;

@RestController
public class FeignConsumerController {
	
	@Autowired
	private FeignService feignService;

	@GetMapping(value = "/feign/sentinel/consumer/test")
	public String consumerTest() {
		
		return "ConsumerTest:" + feignService.providerTest("Feign Sentinel");
	}
}
