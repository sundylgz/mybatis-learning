package com.sundy.mybatis.dao;

import java.util.List;
import java.util.Map;

import com.sundy.mybatis.bean.Employee;

public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public Employee getEmpByMap(Map<String, Object> paramMap);

    public List<Employee> getEmps();


}
