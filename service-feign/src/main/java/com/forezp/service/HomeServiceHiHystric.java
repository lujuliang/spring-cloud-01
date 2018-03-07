package com.forezp.service;

import org.springframework.stereotype.Component;

@Component
public class HomeServiceHiHystric implements HomeService {

	@Override
	public String info() {
		return "error: service-down";
	}

}
