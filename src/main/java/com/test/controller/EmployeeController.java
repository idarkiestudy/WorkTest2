package com.test.controller;

import com.test.pojo.Employee;
import com.test.service.EmployeeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 赖春任
 * @date 2020/10/10 20:52
 */
@Controller
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/insert")
    @ResponseBody
    public String insertOne() {
        Employee employee = new Employee();
        employee.setName("22");
        employee.setAddress("广州");
        employee.setAge(23);
        employee.setPassword("123456");
        employee.setPhone("12345678911");
        employee.setSex("女");
        int i = employeeService.insertEmployee(employee);
        return ""+i;
    }

    @RequestMapping("/sel/{id}")
    @ResponseBody
    public String selectOne(@Param("id") int id){
        Employee employee = employeeService.selectOneEmployee(id);
        return employee.toString();
    }


}
