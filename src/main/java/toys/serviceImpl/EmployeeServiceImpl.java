package toys.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toys.dao.EmployeeDao;
import toys.entity.Employee;
import toys.service.EmployeeService;

import java.util.List;

/**
 * Created by Michail on 7/23/2019.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    public void delete(int id) {
employeeDao.delete(id);
    }

    public void update(int id, Employee employee) {
        employeeDao.delete(id);
employeeDao.save(employee);
    }

    public Employee findOne(int id) {
        return employeeDao.findOne(id);
    }
}