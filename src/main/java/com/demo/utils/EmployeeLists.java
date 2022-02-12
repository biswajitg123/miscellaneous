package com.demo.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.demo.model.Employee;

public class EmployeeLists {
	
	private static List<Employee> empList = new ArrayList<>();
	static {
		
		empList.add(new Employee("Akanksha","Delhi"));
		empList.add(new Employee("Biswajit","Bangalore"));
		empList.add(new Employee("Chinmaya","Delhi"));
		empList.add(new Employee("Abhinav","Delhi"));
		empList.add(new Employee("Pallavi","Pune"));
		empList.add(new Employee("Shantanu","Delhi"));
		empList.add(new Employee("Sagar","Bangalore"));
		empList.add(new Employee("Piyush","Bangalore"));
		empList.add(new Employee("Madan","Pune"));
	}
	
	public static Map<String , List<Employee>> getEmpDetails()  {
		
		Map<String , List<Employee>> empMap = new HashMap<>();
		
		for(Employee emp : empList) {
			
			String key = emp.getCity();
			List<Employee> employee = new ArrayList<>();
			employee.add(emp);
			
			if(empMap.containsKey(key)) {
				
				employee = empMap.get(key);
				employee.add(emp);
				empMap.put(key, employee);
			}
			
			else {				
				empMap.put(key, employee);
			}
		
		}
		
		return empMap;
	}
	
	public Map<String, Employee> getEmpDetailsUsingStream() {
		
		return null;
	}
	
	public static void main(String[] args) {
		
		Map<String , List<Employee>> empMap = getEmpDetails();
		for (Map.Entry<String, List<Employee>> entry : empMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue().size());
			System.out.println("Details : " + entry.getValue());
		}
		
	}
}
