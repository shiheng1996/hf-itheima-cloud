package com.itheima.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Zuul9527_APP {
    public static void main(String[] args) {
        SpringApplication.run(Zuul9527_APP.class,args);
    }
}
