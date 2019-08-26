package toys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import toys.entity.Employee;
import toys.entity.commodity.Clothing;

import java.util.List;

/**
 * Created by Michail on 6/19/2019.
 */
public interface EmployeeDao extends JpaRepository<Employee,Integer>{

}
