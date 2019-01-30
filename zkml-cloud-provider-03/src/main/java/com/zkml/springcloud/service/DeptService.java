package com.zkml.springcloud.service;

import com.zkml.springcloud.pojo.Dept;

import java.util.List;

/**
 * @auther BH
 * @date 2019/1/15 9:13
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
