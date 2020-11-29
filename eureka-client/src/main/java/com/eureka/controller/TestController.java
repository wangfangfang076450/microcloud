package com.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${server.port}")
	private String port;
	
	@GetMapping("/test")
	public String testMethod(@RequestParam("name") String name) {
		return "hello world!!!  端口为：" + port + "名字为：" + name;
	}
}
