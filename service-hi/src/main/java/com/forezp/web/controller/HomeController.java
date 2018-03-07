package com.forezp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 */
@RestController
public class HomeController {

	@Value("${info.build.name}")
	private String info;

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/hi")
	public String info() {
		return info;
	}
	
	@RequestMapping("/hi")
	public String callHome(){
		return restTemplate.getForObject("http://service-ribbon/zuul", String.class);
	}
}
