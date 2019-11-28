package com.autoee.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 表明是一个Nacos客户端，该注解是 SpringCloud 提供的原生注解。
public class AutoeeBusiProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoeeBusiProviderApplication.class, args);
	}

}
