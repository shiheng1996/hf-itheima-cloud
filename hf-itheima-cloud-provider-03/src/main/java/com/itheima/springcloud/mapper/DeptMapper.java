package com.itheima.springcloud.mapper;

import com.itheima.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author NQ
 * @create 2018-12-15 14:48
 */
@Mapper
public interface DeptMapper {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}