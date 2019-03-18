package com.cheer.mybatis.mapper;

import com.cheer.mybatis.model.Emp;
import org.junit.Test;

import java.util.List;

public class CacheTest extends AbstractMapperTest {
    @Test
    public void cache() {
        EmpMapper empMapper = this.session.getMapper(EmpMapper.class);
        List<Emp> empList = empMapper.getList();
        List<Emp> emplist1 = empMapper.getList();
    }

    @Test
    public void cache1() {
        EmpMapper empMapper = this.session.getMapper(EmpMapper.class);
        List<Emp> empList = empMapper.getList();
        for (Emp emp : empList) {
         if(emp.getEmpNo()==7449){
             emp.setCom(999.0);
             empMapper.update(emp);
         }
        }
        List<Emp> empList1=empMapper.getList();
    }
}