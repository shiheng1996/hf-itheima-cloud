package com.itheima.springcloud.controller;

import com.itheima.springcloud.pojo.Dept;
import com.itheima.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author NQ
 * @create 2018-12-15 14:51
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @PostMapping(value="/dept/add")
    public boolean add(@RequestBody Dept dept)  {
        return service.add(dept);
    }

    @GetMapping(value="/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)  {
        return service.get(id);
    }

    @GetMapping(value="/dept/list")
    public List<Dept> list()  {
        return service.list();
    }
    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 系统中的微服务可以通过Eureka的服务发现去获得在Eureka中注册的服务的信息，这是一个对外暴露的接口
     * @return
     */
    @GetMapping("/provider/discovery")
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println(list);
        List<ServiceInstance> insList = discoveryClient.getInstances("HF-ITHEIMA-CLOUD-PROVIDER");
        for (ServiceInstance si:insList) {
            System.out.println(si.getHost() +"," + si.getServiceId() +"," +si.getPort() +"," +si.getUri() +"," +si.getMetadata());
        }
        return this.discoveryClient;
    }


}
