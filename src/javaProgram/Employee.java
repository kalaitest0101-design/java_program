package javaProgram;

import javaProgram1.Company;

public class Employee extends ChildClass {
	
	 void empID() {
		System.out.println("123456");
	}
		public void empName() {
			System.out.println("kalai");
			
		}
		private void empPhone() {
			System.out.println("9776544678");
		}
		public static void main(String[] args) {
			//Language lan = new Language();
		
			ChildClass c= new Employee();
	c.deposit();
	
		}
		
	}


