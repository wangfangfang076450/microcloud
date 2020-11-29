package com.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conf")
public class TestController {

	@Value("${foo}")
    String foo;


    @RequestMapping(value = "/foo")
    public String foo(){
        return foo;
    }
}
