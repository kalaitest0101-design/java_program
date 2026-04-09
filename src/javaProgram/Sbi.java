package javaProgram;

public class Sbi extends Bank {
	public void current() {
		System.out.println("current acnt");
	}
	public void salary() {
		System.out.println("salary");
	}
	public void joint() {
		System.out.println("joint");
	}
		public void saving() {
			System.out.println("jjj");
		}
	
	public static void main(String[] args) {
		Sbi s = new Sbi();
		s.branchDetails();
		s.current();
		s.salary();
		s.joint();
	s.saving();
	}

}
