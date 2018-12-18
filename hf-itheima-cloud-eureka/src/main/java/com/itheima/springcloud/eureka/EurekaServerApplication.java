package com.itheima.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server  负责管理服务的 注册和发现
 * @author NQ
 * @create 2018-12-15 15:42
 */
@SpringBootApplication
@EnableEurekaServer   // Eureka的 服务端
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
