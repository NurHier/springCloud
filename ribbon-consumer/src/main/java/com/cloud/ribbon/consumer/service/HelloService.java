package com.cloud.ribbon.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author hao.zhou02
 * @date 2019/5/7
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    public String sayHello() {
        return restTemplate.getForObject("http://ribbon-provider/hello?name=I am ribbon comsumer", String.class);
    }
}
