package com.itheima.springcloud.api;

import com.itheima.springcloud.fallback.DeptClientServiceFallbackFactory;
import com.itheima.springcloud.pojo.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@FeignClient(value = "HF-ITHEIMA-CLOUD-PROVIDER",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientServiceApi {
    @PostMapping(value="/dept/add")
    public boolean add(@RequestBody Dept dept);

    @GetMapping(value="/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id);

    @GetMapping(value="/dept/list")
    public List<Dept> list();
}
