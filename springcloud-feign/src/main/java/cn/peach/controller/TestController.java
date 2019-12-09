package cn.peach.controller;

import cn.peach.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestFeign testFeign;
    @RequestMapping("/test")
    public String testFeign(){
        return testFeign.testByFeign();
    }

}
