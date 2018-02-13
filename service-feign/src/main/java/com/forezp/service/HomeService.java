package com.forezp.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.forezp.ServiceUtil;

/**
 */
@FeignClient(value = ServiceUtil.SERVICE_NAME)
public interface HomeService {
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    String info();
}
