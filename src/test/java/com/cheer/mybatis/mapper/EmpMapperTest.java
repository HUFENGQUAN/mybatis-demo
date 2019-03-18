package com.cheer.mybatis.mapper;

import com.cheer.mybatis.model.Dept;
import com.cheer.mybatis.model.Emp;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EmpMapperTest extends AbstractMapperTest {
    @Test
    public void getEmp() {
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        Emp emp = empMapper.getEmp(7449);
        assertNotNull(emp);
    }

    @Test
    public void getList() {
        EmpMapper empMapper = this.session.getMapper(EmpMapper.class);
        List<Emp> emplist = empMapper.getList();
        assertEquals(13, emplist.size());
        Emp emp= emplist.get(0);
        Dept dept=emp.getDept();
        System.out.println(dept);

    }

    @Test
    public void insert() {
        EmpMapper empMapper = this.session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setEmpNo(8888);
        emp.setEName("JODAN");
        int result= empMapper.insert(emp);
        assertEquals(1,result);
    }

    @Test
    public void update() {
        EmpMapper empMapper = this.session.getMapper(EmpMapper.class);
        Emp emp = empMapper.getEmp(8888);
        emp.setEName("join");
        int result = empMapper.update(emp);
        assertEquals(1, result);
    }

    @Test
    public void delete() {
        EmpMapper empMapper = this.session.getMapper(EmpMapper.class);
        int result = empMapper.delete(8888);
        assertEquals(1, result);
    }

    @Test
    public void getCount() {
        EmpMapper empMapper = this.session.getMapper(EmpMapper.class);
       int count= empMapper.getCount();
        assertEquals(13, count);
    }
}

