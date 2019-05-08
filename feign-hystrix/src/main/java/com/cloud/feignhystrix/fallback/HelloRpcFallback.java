package com.cloud.feignhystrix.fallback;

import com.cloud.feignhystrix.remote.HelloRpc;
import org.springframework.stereotype.Component;

/**
 * @author hao.zhou02
 * @date 2019/5/8
 */
@Component
public class HelloRpcFallback implements HelloRpc {
    @Override
    public String sayHello() {
        return "降级处理后的返回值";
    }
}
