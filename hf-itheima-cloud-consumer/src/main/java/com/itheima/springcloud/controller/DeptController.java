package com.itheima.springcloud.controller;

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
@RequestMapping("consumer")
public class DeptController {
//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    @Autowired
    RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://HF-ITHEIMA-CLOUD-PROVIDER";

    @GetMapping(value = "/dept/list")
    public List<Dept> findAll() {
        System.out.println("DeptController.findAll");
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
    }


    @PostMapping(value = "/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @GetMapping("/discovery")
    public Object discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/discovery",Object.class);
    }


}
