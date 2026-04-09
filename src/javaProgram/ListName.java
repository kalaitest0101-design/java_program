package javaProgram;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;


public class ListName {
	public static void main(String[] args) {
		List<String> ex = new ArrayList<>();
		ex.add("a");
		ex.add("b");
		ex.add("a");
		ex.add(null);
		ex.add(null);
		System.out.println(ex);
		List<Integer> ex1 = new LinkedList<Integer>();
		ex1.add(12);
		ex1.add(34);
		ex1.add(12);
		System.out.println(ex1);
		
	}

}
