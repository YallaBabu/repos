package com.flp.ems.dao;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {
	

		public void ModifyEmployee();
		public void RemoveEmployee(int x,Employee e);
		
		public void getAllEmployee();
		public void addEmployee(Employee employee);
		public void SearchEmployee(int x);
	
		 

	}



