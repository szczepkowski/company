package pl.com.company.controller;

import java.math.BigDecimal;

public class EmployeeView {

    private String firstName;
    private String lastName;
    private  String pesel;
    private BigDecimal salary;

    public EmployeeView(String firstName, String lastName, String pesel, BigDecimal salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.salary = salary;
    }

    public EmployeeView() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
