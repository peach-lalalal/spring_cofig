package cn.peach.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
        @Value("${server.port}")
        String port;

        @Value("${spring.application.name}")
        String name;
        @Value("${kd.app.name}")
        String appName;

        @RequestMapping("/test")
        public String test() {
            return appName+"测试:"+name+":"+port;
    }
    @RequestMapping("/testByParam")
    public String testByParam(String from) {
        return appName+"上线测试:"+name+":"+port+"来自:"+from;
    }


}
