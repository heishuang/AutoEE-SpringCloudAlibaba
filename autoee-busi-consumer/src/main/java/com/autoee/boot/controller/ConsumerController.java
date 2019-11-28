package com.autoee.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value = "/consumer/test")
	public String consumerTest() {
		//使用 LoadBalanceClient 和 RestTemplate 结合的方式来访问
		//获取provider应用实例
		ServiceInstance serviceInstance = loadBalancerClient.choose("autoee-busi-provider");
		String url = String.format("http://%s:%s/provider/test", serviceInstance.getHost(), serviceInstance.getPort());
		
		return "consumerTest: " + restTemplate.getForObject(url + "/restTemplate", String.class);
	}
}
