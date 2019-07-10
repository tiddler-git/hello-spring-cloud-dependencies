package com.tiddler.hello.spring.cloud.admin.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Value("${server.port}")
    private Integer port;
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(String message){
        return String.format("message:%s port:%s",message,port);
    }
}
