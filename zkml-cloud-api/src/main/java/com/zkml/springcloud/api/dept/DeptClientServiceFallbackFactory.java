package com.zkml.springcloud.api.dept;

import com.zkml.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @auther BH
 * @Date 2019/1/17 8:31
 */

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientServiceApi> {

    @Override
    public DeptClientServiceApi create(Throwable throwable) {
        return new DeptClientServiceApi() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id)
                                 .setDname("暂停服务")
                                 .setDb_source("no this database in MySql");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
