package com.example.demo.api;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;
import com.example.demo.model.RegionList;
import com.example.demo.service.HomeService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController // @Controller + @ResponseBody
public class HomeController {

	//private static final Logger logger = LogManager.getLogger(HomeController.class);

	@Autowired
	HomeService service;

	@Autowired
	EmployeeDao employeeDao;

	@RequestMapping(value = "/employeelist", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> add () {//(@RequestHeader("authorization")String auth) {
		try {
			
		//logger.info("inside get method");
		List<Employee> a = new ArrayList<Employee>();

		a = service.employeeList();

		return new ResponseEntity<>(a, HttpStatus.OK);
		} catch(Exception e) {
			List l = new ArrayList();
			l.add("exception");
			return new ResponseEntity<>(l, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
	
	

	//@PostMapping("/post")
	@RequestMapping(value = "/post", method = RequestMethod.POST)// by default it will be get
	public ResponseEntity<String> insert(@RequestBody Employee employee) {
		
		List<Employee> list = employeeDao.findAll();
		
		//Map<String, List<Employee>> postsPerType = list.stream().
			//	collect(Collectors.groupingBy((Employee::getName)));
		 
		//System.out.println(postsPerType);
		
		/*Map<Boolean,Integer>  m = new HashMap();
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			Employee de = (Employee)itr.next();
			if(m.containsKey(de.getName())) {
				m.put(de.getName(), m.get(de.getName())+1);
			} else {
				m.put(de.getName(),1);

			}
			
			
		}
		
		List<RegionList> reg = new ArrayList();
		for(Map.Entry<Boolean,Integer> word : m.entrySet()) {
			
			//RegionList l = RegionList.builder().name(word.getKey()).value(word.getValue()).build();
			RegionList l = new RegionList();
		   l.setName(word.getKey() ? "Active":"Inactive");
		   l.setValue(word.getValue());
			reg.add(l);
			
		}
		
		
		System.out.println(reg);*/
		Employee e = employeeDao.save(employee);

		return new ResponseEntity<>("Data inserted successfully", HttpStatus.CREATED);
	}
}
