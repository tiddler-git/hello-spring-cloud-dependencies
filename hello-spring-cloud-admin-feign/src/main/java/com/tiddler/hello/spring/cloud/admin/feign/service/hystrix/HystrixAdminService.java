package com.tiddler.hello.spring.cloud.admin.feign.service.hystrix;

import com.tiddler.hello.spring.cloud.admin.feign.service.AdminService;
import org.springframework.stereotype.Service;

@Service
public class HystrixAdminService implements AdminService {
    @Override
    public String sayHi(String message) {
        return "your message can not request:" + message;
    }
}
