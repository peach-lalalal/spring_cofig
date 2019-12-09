package cn.peach.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "springcloud-provider",fallback = TestFeignFallback.class)
public interface TestFeign {
    @RequestMapping(value = "/test")
    String testByFeign();

    @RequestMapping(value = "/testByParam")
    String testByParam(@RequestParam("from") String from);
}
