package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Role;
import com.flp.ems.domain.project;

public class EmplyeeDaoImplForList implements IemployeeDao{
	List<Employee>employees=new ArrayList<Employee>();
	List<Department>departments=new ArrayList<Department>();
	List<project>projects=new ArrayList<project>();
	List<Role>roles=new ArrayList<Role>();

	public void addEmployee( Employee emp)
	{
		
		
		employees.add(emp);
		departments.add(emp.getDepartment());
		projects.add(emp.getProject());
		roles.add(emp.getRole());
		System.out.println(emp);
		
	}

	

	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	
	public void RemoveEmployee(int x,Employee emp) {
	
		for (Employee e : employees) {
		       if (e.getEmpid()==x){
		          employees.remove(emp);
		          System.out.println("employee removed successfully with kin_id:"+x);
		         break;
				
		       }

		      
		  }
		}
	

	
	public void SearchEmployee(int x) 
	{
		 for(Employee e : employees) {
		        if(e.getEmpid() == x)
		        {
		           System.out.println("found");
		        }
		        else
		        {
		        	System.out.println("not found");
		        }
		    }
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}

}
