package com.sundy.mybatis.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sundy.mybatis.bean.Employee;
import com.sundy.mybatis.service.EmployeeService;

import javax.xml.ws.Response;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/getemps")
    public ResponseEntity<?> emps(Map<String, Object> map) {
        List<Employee> emps = employeeService.getEmps();
        map.put("allEmps", emps);
        return ResponseEntity.ok(map);
    }

}
