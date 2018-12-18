package com.itheima.springcloud.controller;

import com.itheima.springcloud.pojo.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.itheima.springcloud.service.DeptService;

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

    @GetMapping(value="/dept/list")
    public List<Dept> list()  {
        return service.list();
    }


    @GetMapping(value="/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "nullDeptFallBack")
    public Dept get(@PathVariable("id") Long id)  {
        Dept dept = service.get(id);
        if (dept == null) {
            throw new RuntimeException("异常...");
        }
        return dept;
    }
    public Dept nullDeptFallBack(@PathVariable("id")Long id) {
        System.out.println("熔断回调方法被调用.....");
        return new Dept().setDeptno(id).setDname("nullName").setDb_source("nullDB");
    }

}
