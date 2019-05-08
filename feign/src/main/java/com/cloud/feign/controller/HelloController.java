package com.cloud.feign.controller;

import com.cloud.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hao.zhou02
 * @date 2019/5/7
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hello")
    public String sayHello(String name) {
        return name + " : " + this.helloService.sayHello();
    }

}
