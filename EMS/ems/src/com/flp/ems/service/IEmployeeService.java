package com.flp.ems.service;

import java.util.Map;



public interface IEmployeeService {

		
	
		public void ModifyEmployee();
		public void RemoveEmployee(int x);
		
		public void getAllEmployee();
	
		public void addEmployee(Map<String, Object> empDetails);
		public void SearchEmployee(int x);
				

	}



