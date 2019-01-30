package com.zkml.springcloud.mapper;

import com.zkml.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @auther BH
 * @date 2019/1/15 9:11
 */

@Mapper
public interface DeptMapper {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
