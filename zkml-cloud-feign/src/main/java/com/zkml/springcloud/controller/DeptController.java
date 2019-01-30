package com.zkml.springcloud.controller;

import com.zkml.springcloud.api.dept.DeptClientServiceApi;
import com.zkml.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @auther BH
 * @date 2019/1/16 10:27
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
