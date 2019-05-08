package com.cloud.feign.service;

import com.cloud.feign.remote.HelloRpc;
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
    private HelloRpc helloRpc;

    public String sayHello() {
        return helloRpc.sayHello();
    }
}
