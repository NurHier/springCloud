package com.cloud.feignhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * @author hao.zhou02
 * @date 2019/5/8
 */
@Service
public class UserService {
    @HystrixCommand(fallbackMethod = "getUserNameFallback")
    public String getUserName() throws Exception {
        throw new Exception("获取用户异常");
    }

    private String getUserNameFallback() {
        return "I am feign hystrix.熔断降级后用户名称";
    }
}
