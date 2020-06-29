package com.example.todoslitApi.payroll;

public class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException(Long id) {
        super("Colud not find employee " + id);
    }
}