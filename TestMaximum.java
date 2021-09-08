package com.generics;

public class TestMaximum {
	
	private static String a,b,c;
	private static Integer x,y,z;
	private static Float j,k,l;
	
	
	public void initInt(Integer x,Integer y,Integer z) {
		this.x=x;
		this.y=y;
		this.z=z;
		
	}
	public void initString(String a,String b,String c) {
		this.a=a;
		this.b=b;
		this.c=c;
		
		
	}
	public void initFloat(Float j,Float  k,Float l) {
		this.j=j;
		this.k=k;
		this.l=l;
		
	}
	
	
	
	
	public static void findStringMax(String a,String b,String c) {
		String max=a;
		if(b.compareTo(max)>0) {
			
			max=b;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		
		System.out.println("Maximum of "+a+","+b+" and "+c+" is =" +max);
		
	}
	public static void findIntMax(Integer a,Integer b,Integer c) {
		Integer max=a;
		if(b.compareTo(max)>0) {
			
			max=b;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		
		System.out.println("Maximum of "+a+","+b+" and "+c+" is =" +max);
		
	}
	
	public static void findFloatMax(Float a,Float b,Float c) {
		Float max=a;
		if(b.compareTo(max)>0) {
			
			max=b;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		
		System.out.println("Maximum of "+a+","+b+" and "+c+" is =" +max);
		
	}
	

}
