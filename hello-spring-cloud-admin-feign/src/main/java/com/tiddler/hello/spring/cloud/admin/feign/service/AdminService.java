package com.tiddler.hello.spring.cloud.admin.feign.service;


import com.tiddler.hello.spring.cloud.admin.feign.service.hystrix.HystrixAdminService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-spring-cloud-admin-service",fallback = HystrixAdminService.class)
public interface AdminService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message);
}
