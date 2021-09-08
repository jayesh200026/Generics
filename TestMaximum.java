package com.generics;

public class TestMaximum {
	
	private static Integer a,b,c;
	TestMaximum(Integer a,Integer b,Integer c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public static void findMax() {
		Integer max=a;
		if(b.compareTo(max)>0) {
			
			max=b;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		
		System.out.println("Maximum of "+a+","+b+" and "+c+" is =" +max);
		
	}
	

}
