package com.flp.ems.view;

import java.util.Scanner;

	public class BootClass {
	
		
		static UserInteraction ui=new UserInteraction();	
		static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{   int ch;
		 while(true)
		 {
		   System.out.println("Menu");
		   System.out.println("Enter ur choice 1.Add 2.Modify 3.Remove 4.Search 5.GetAllEmp");
		   ch=sc.nextInt();
		   menuSelection(ch);
		 }
		 
		 
	}
public static void menuSelection(int ch)
{
	switch(ch)
	{
	case 1:ui.AddEmployee();
		       break;
	case 2:ui.ModifyEmployee();
		  break;
    case 3:ui.RemoveEmployee();
    	          break;
   case 4: ui.SearchEmployee();
           break;
   case 5:ui.getAllEmployee();
          break;
	case 6:System.exit(0);       
	
}

	

}
}
