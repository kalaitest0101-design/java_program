package javaProgram;

public class Array {
	//syntax
	//data type variablename[] = new datatype[5]
	// here 5 is array size
	
	public static void main(String[] args) {
		int num[] = new int[5]; 
		System.out.println(num[2]);
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		System.out.println(num[2]);
		num[3]=60;
		System.out.println(num[3]);
		int l = num.length;
		System.out.println(l);
		
		//int num[]={10,20,30,60,50}
		for(int i =0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		//for(int k:num) {
			//System.out.println(k);
		}
		
		
		
	}


