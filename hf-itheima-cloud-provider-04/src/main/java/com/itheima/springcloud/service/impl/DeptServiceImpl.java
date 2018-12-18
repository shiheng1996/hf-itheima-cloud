package com.itheima.springcloud.service.impl;

import com.itheima.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itheima.springcloud.mapper.DeptMapper;
import com.itheima.springcloud.service.DeptService;

import java.util.List;

/**
 * @author NQ
 * @create 2018-12-15 14:50
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper ;

    @Override
    public boolean add(Dept dept)  {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept get(Long id)  {
        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> list()  {
        return deptMapper.findAll();
    }
}
