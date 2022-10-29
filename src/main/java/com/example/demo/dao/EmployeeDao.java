package com.example.demo.dao;

import com.example.demo.model.Employee;
import com.example.demo.model.RegionList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Long> {

	@Query("select new Employee(name,id)" + "from Employee where id > 1")
    List<Employee> findbyname();


}
