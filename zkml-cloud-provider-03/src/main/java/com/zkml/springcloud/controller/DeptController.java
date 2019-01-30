package com.zkml.springcloud.controller;

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
    public Dept get(@PathVariable("id") Long id)  {
        return service.get(id);
    }

    @GetMapping(value="/dept/list")
    public List<Dept> list()  {
        return service.list();
    }
}
