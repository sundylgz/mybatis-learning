package com.sundy.mybatis.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundy.mybatis.bean.Employee;
import com.sundy.mybatis.dao.EmployeeMapper;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private SqlSession sqlSession;

    public List<Employee> getEmps(){
        //
        //EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        return employeeMapper.getEmps();
    }

}

