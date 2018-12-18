package com.itheima.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author NQ
 * @create 2018-12-15 14:59
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApplication.class, args);
    }
}