package com.generics;

public class TestMaximum {
	
	private static String a,b,c;
	TestMaximum(String a,String b,String c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void maximum() {
		String res=TestMaximum.findMax(a,b,c);
		System.out.println("Maximum of "+a+","+b+" and "+c+" is =" +res);
	}
	
	public static String findMax(String a,String b,String c) {
		String max=a;
		if(b.compareTo(max)>0) {
			
			max=b;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		
		return max;
		
	}
	

}
