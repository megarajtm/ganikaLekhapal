package com.gem.it.spi.ds;

import com.gem.it.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Megaraj on 20-03-2019.
 */
public interface EmployeeAccess extends CrudRepository<Employee,String> {
}
