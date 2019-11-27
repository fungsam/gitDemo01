package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author teacher feng
 * @date 2019-11-27 13:26
 **/
@RestController
@EnableAutoConfiguration
public class TestController {
    @RequestMapping("/")
    public  String  test(){
        return "nihao,welcome  to  use  springboot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestController.class,args);
    }
}
