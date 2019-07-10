package com.tiddler.hello.spring.cloud.admin.comsumer.controller;

import com.tiddler.hello.spring.cloud.admin.comsumer.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService service;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(String message){
        return service.sayHi(message);
    }
}
