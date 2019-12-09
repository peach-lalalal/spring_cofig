package cn.peach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  //注册服务到注册中心
public class ProviderRun {
    public static void main(String[] args) {
        SpringApplication.run(ProviderRun.class, args);
    }
}
