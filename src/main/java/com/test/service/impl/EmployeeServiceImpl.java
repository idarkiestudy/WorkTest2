package com.test.service.impl;

import com.test.mapper.EmployeeMapper;
import com.test.pojo.Employee;
import com.test.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 赖春任
 * @date 2020/10/10 20:46
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeMapper employeeMapper;

    public int insertEmployee(Employee employee) {
        return employeeMapper.insertEmployee(employee);
    }

    public int deleteEmployee(int id) {
        return employeeMapper.deleteEmployee(id);
    }

    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    public Employee selectOneEmployee(int id) {
        return employeeMapper.selectOneEmployee(id);
    }

    public List<Employee> selectAllEmployee() {
        return employeeMapper.selectAllEmployee();
    }
}
