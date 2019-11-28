package com.autoee.boot.service;

import org.springframework.stereotype.Component;

@Component
public class FallbackServiceImpl implements FeignService{

	@Override
	public String providerTest(String callName) {
		// TODO Auto-generated method stub
		return "请求服务失败！ sentinel fallback";
	}

}
