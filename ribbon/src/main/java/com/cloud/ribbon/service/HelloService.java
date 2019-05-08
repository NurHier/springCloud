package com.cloud.ribbon.service;

import org.springframework.stereotype.Service;

/**
 * @author hao.zhou02
 * @date 2019/5/7
 */
@Service
public class HelloService {
    public String sayHello() {
        System.out.println("hello world!");
        return "hello world! I am ribbon server.";
    }
}
