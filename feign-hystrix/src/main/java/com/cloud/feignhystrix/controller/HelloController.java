package com.cloud.feignhystrix.controller;

import com.cloud.feignhystrix.service.HelloService;
import com.cloud.feignhystrix.service.UserService;
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

    @Autowired
    private UserService userService;

    @GetMapping(value = "/hello")
    public String sayHello(String name) {
        return name + " : " + this.helloService.sayHello();
    }

    @GetMapping(value = "/user/name")
    public String getName() {
        try {
            return "获取名称：" + this.userService.getUserName();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

}
