package javaProgram;

public class StringBasic {
	public static void main(String[] args) {
		String name = "kalaipriya";
		System.out.println(name);
		char c = name.charAt(2);
		System.out.println(c);
		boolean b = name.equals("KALAIPRIYA");
		System.out.println(b);
		boolean b1 = name.equals("kalaipriya");
		System.out.println(b1);
		boolean b2 = name.equalsIgnoreCase("kalaipriyA");
		System.out.println(b2);
		boolean b3 = name.contains("priya");
		System.out.println(b3);
		String lowerCase = name.toLowerCase();
		System.out.println(lowerCase);
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);
	}

}

