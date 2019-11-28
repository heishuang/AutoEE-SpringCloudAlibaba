package com.autoee.boot.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// 指定服务提供者应用id
@FeignClient(value = "autoee-busi-provider", fallback=FallbackServiceImpl.class)
public interface FeignService {
	@GetMapping(value = "/provider/test/{callName}")
	String providerTest(@PathVariable("callName") String callName) ;

}
