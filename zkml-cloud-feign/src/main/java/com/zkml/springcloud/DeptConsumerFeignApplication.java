package com.zkml.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @auther BH
 * @date 2019/1/16 10:36
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients   // 开启Feign的远程调用
//@ComponentScans("api")   // 扫描 feign 对应的 API的接口所在的包
public class DeptConsumerFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeignApplication.class, args);
    }
}
