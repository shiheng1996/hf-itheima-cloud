package com.itheima.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author NQ
 * @create 2018-12-15 14:59
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients   // 开启Feign的远程调用
public class DeptConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApplication.class, args);
    }
}