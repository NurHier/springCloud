package com.cloud.ribbon.controller;

import com.cloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hao.zhou02
 * @date 2019/5/7
 */
@RestController
@RefreshScope
public class HelloController {

    @Autowired
    private HelloService helloService;

    @Value("${port}")
    private String defaultPort;

    @Autowired
    private Environment env;

    @GetMapping(value = "/hello")
    public String sayHello(String name) {
        return name + " : " + this.helloService.sayHello();
    }

    @GetMapping(value = "/default/port")
    public String getDefaultPort() {
        if (defaultPort == null || defaultPort.isEmpty()) {
            return "default port is empty";
        }
        String envString = env.getProperty("port");
        return defaultPort + ": env:" + envString;
    }

}
