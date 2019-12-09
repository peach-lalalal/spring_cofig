package cn.peach.feign;

import cn.peach.controller.Demo;
import org.springframework.stereotype.Component;

@Component
public class TestFeignFallback implements  TestFeign

{
    @Override
    public String testByFeign() {
        return "error";
    }

    @Override
    public String testByParam(String from) {
        return "error";
    }



}
