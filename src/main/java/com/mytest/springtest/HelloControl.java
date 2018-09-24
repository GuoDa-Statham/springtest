package com.mytest.springtest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloControl {

    @RequestMapping("/hello")
    private String  hello(String[] ar) {
        return "hello";
    }

    private String a (){
        return "";
    }
}
