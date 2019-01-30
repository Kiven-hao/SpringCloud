package com.zkml.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zkml.springcloud.pojo.Dept;
import com.zkml.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @auther BH
 * @date 2019/1/15 9:17
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
    @HystrixCommand(fallbackMethod = "getDeptFallback")
    public Dept get(@PathVariable("id") Long id)  {
        Dept dept = service.get(id);
        if (dept == null) {
            throw new RuntimeException("getById is Null for Mysql...");
        }

        return dept;
    }

    // 熔断处理的 fallback方法，  主方法出现异常时会出发此方法
    public Dept getDeptFallback(@PathVariable("id")Long id) {
        System.out.println("熔断回调方法被调用.....");
        return new Dept().setDeptno(id).setDname("nullName").setDb_source("nullDB");
    }

    @GetMapping(value="/dept/list")
    public List<Dept> list()  {
        return service.list();
    }
}
