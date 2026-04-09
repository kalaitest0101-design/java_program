package javaProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetProgram {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("abi");
		set1.add("bala");
		set1.add("an");
		set1.add(null);
		set1.add(null);
		System.out.println(set1);
		Set<String> set2 = new LinkedHashSet<String>();
		set2.add("A");
		set2.add("B");
		set2.add("A");
		set2.add(null);
		System.out.println(set2);
		Set<String> set3 = new TreeSet<String>();
		set3.add("ananya");
		set3.add("kruthika");
		set3.add("abi");
		//set3.add(null);
		System.out.println(set3);
		
		
		
	}

}
