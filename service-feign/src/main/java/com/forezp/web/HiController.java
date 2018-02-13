package com.forezp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.forezp.service.HomeService;

/**
 */
@RestController
public class HiController {

    @Autowired
    HomeService schedualServiceHi;
    
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String sayHi(){
        return schedualServiceHi.info();
    }
}
