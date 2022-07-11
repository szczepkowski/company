package pl.com.company.service;

import pl.com.company.controller.EmployeeView;
import pl.com.company.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee create(EmployeeView employeeView);

    Employee get(String pesel);

    List<Employee> getAll();

    boolean delete(String pesel);

    Employee update(Employee employee);

}
