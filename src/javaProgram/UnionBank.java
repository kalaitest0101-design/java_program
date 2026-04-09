package javaProgram;

public class UnionBank implements Bank1{
	public void  saving () {
		System.out.println("saving acnt");
	}
	public void current() {
		System.out.println("current acnt");
	}
public static void main(String[] args) {
	Bank1 u = new UnionBank();
	u.saving();//method calling
	u.current();
	
}
}
