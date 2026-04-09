package javaProgram;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//int empId= s.nextInt();
		//System.out.println("enter the employee id:"  +empId);
		//String name = s.nextLine();
		//System.out.println("enter the employee name: "    +name);
		//long empPhone =s.nextLong();
		//System.out.println("enter the employee phone number "    +empPhone);
		//double salary =s.nextDouble();
		
		//System.out.println("enter the salary:"       +salary);
		String dept = s.next(); 
		System.out.println("department name:"    +dept);

}
}