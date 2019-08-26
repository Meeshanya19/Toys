package toys.service;

import toys.entity.Employee;

import java.util.List;

/**
 * Created by Michail on 7/23/2019.
 */
public interface EmployeeService  {
    void save(Employee employee);
    List<Employee> findAll();
    void delete(int id);
    void update(int id ,Employee employee);
    Employee findOne(int id);
}
