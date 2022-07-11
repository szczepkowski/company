package pl.com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.com.company.model.Employee;
import pl.com.company.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{pesel}")
    public Employee get(@PathVariable String pesel) {
        return employeeService.get(pesel);
    }

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @PostMapping
    public Employee create(@RequestBody EmployeeView view) {
        return employeeService.create(view);
    }

    @DeleteMapping("/{pesel}")
    public boolean delete(@PathVariable String pesel) {
        return this.employeeService.delete(pesel);
    }
}
