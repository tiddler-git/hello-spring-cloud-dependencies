package com.tiddler.hello.spring.cloud.admin.comsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorSayHi")
    public String sayHi(String message){
        return restTemplate.getForObject("http://hello-spring-cloud-admin-service/hi?message=" + message, String.class);
    }

    public String errorSayHi(String message){
        return String.format("your message but request bad: %s", message);
    }

}
