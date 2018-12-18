package com.itheima.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author NQ
 * @create 2018-12-15 14:52
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker   //对hystrixR熔断机制的支持
public class DeptProviderApplication_04 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProviderApplication_04.class, args);
    }

}
