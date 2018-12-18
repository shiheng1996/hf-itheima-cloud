package com.itheima.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author NQ
 * @create 2018-12-15 14:52
 */
@SpringBootApplication
@EnableEurekaClient      //  DeptProviderApplication 就是 Eureka client
@EnableDiscoveryClient   // 启用发现服务
public class DeptProviderApplication_03 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProviderApplication_03.class, args);
    }

}
