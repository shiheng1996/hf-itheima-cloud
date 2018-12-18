package com.itheima.springcloud.controller;

import com.itheima.springcloud.api.DeptClientServiceApi;
import com.itheima.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.List;

/**
 * @author NQ
 * @create 2018-12-15 15:04
 */
@RestController
@RequestMapping("feign")
public class DeptController {
    @Autowired
    DeptClientServiceApi deptClientServiceApi;


    @PostMapping(value = "/dept/add")
    public boolean add(Dept dept) {
        return deptClientServiceApi.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptClientServiceApi.get(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        return deptClientServiceApi.list();
    }

}
