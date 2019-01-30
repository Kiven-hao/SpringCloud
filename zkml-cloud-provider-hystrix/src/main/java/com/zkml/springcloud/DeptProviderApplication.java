package com.zkml.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther BH
 * @date 2019/1/15 9:19
 */

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker   //对hystrixR熔断机制的支持
public class DeptProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderApplication.class, args);
    }
}
