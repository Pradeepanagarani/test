package com.example.demo.service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HomeService {

    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> employeeList() {

        return employeeDao.findAll();




    }
}
