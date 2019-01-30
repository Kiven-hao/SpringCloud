package com.zkml.sprigcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @auther BH
 * @date 2019/1/15 9:45
 */

@SpringBootApplication
@EnableEurekaServer  //EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
