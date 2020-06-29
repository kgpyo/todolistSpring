package com.example.todoslitApi.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

interface ployeeRepository extends JpaRepository<Employee, Long> {

}