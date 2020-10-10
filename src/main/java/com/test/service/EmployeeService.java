package com.test.service;

import com.test.pojo.Employee;

import java.util.List;

/**
 * @author 赖春任
 * @date 2020/10/10 20:46
 */
public interface EmployeeService {
    //增加员工
    int insertEmployee(Employee employee);

    //删除员工
    int deleteEmployee(int id);

    //修改员工
    int updateEmployee(Employee employee);

    //查询某个员工
    Employee selectOneEmployee(int id);

    //查询所有员工
    List<Employee> selectAllEmployee();
}
