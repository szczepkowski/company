package pl.com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.company.controller.EmployeeView;
import pl.com.company.model.Employee;
import pl.com.company.repository.EmployeeRepo;
import java.util.List;

@Service
public class EmployeeServiceDefault implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee create(EmployeeView view) {

        return employeeRepo.create(view.getFirstName(),
                view.getLastName(),
                view.getPesel(),
                view.getSalary());
    }

    @Override
    public Employee get(String pesel) {
        return employeeRepo.get(pesel);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepo.getAll();
    }

    @Override
    public boolean delete(String pesel) {
        return employeeRepo.delete(pesel);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepo.update(employee);
    }

}
