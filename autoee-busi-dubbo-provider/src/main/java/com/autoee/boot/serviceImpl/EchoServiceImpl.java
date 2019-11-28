package com.autoee.boot.serviceImpl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import com.autoee.busi.service.EchoService;

@Service
public class EchoServiceImpl implements EchoService{

	@Value("${server.port}")
	private String serverPort;
	
	@Override
	public String echo(String message) {
		return "Dubbo Provider："+ serverPort +" - 输出消息：" + message;
	}
	
}
