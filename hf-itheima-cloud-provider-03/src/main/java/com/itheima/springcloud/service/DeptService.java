package com.itheima.springcloud.service;

import com.itheima.springcloud.pojo.Dept;

import java.util.List;

/**
 * @author NQ
 * @create 2018-12-15 14:50
 */
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
