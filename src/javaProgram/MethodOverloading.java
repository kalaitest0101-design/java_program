package javaProgram;

public class MethodOverloading {
	public void employeeDetails(int age) {
		System.out.println(age);
		
	}
	public void employeeDetails(String name) {
		System.out.println(name);
		
	}
	public void employeeDetails(long mobile, String depart) {
		System.out.println( mobile);
		System.out.println(depart);
	}
public static void main(String[] args) {
	MethodOverloading med = new MethodOverloading();
	med.employeeDetails(25);
	med.employeeDetails("kalaipriya");
	med.employeeDetails(9823462833l, "testing");
}

}
