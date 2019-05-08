package com.cloud.feignhystrix.remote;

import com.cloud.feignhystrix.fallback.HelloRpcFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author hao.zhou02
 * @date 2019/5/7
 */
@FeignClient(value = "ribbon-consumer", fallback = HelloRpcFallback.class)
public interface HelloRpc {
    @RequestMapping(value = "/hello?name=I am feign hystrix", method = RequestMethod.GET)
    String sayHello();
}
