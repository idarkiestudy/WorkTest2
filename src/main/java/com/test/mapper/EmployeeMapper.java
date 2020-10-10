package com.test.mapper;

import com.test.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 赖春任
 * @date 2020/10/10 20:44
 */
@Repository
public interface EmployeeMapper {
    //增加员工
    int insertEmployee(Employee employee);

    //删除员工
    int deleteEmployee(Integer id);

    //修改员工
    int updateEmployee(Employee employee);

    //查询某个员工
    Employee selectOneEmployee(Integer id);

    //查询所有员工
    List<Employee> selectAllEmployee();
}
