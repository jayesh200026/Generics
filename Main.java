package com.generics;

public class Main {
	
	public static void main(String args[]) {
		Integer a1=40,b1=20,c1=30;
		TestMaximum obj1=new TestMaximum(a1,b1,c1);
		obj1.findMax();
		Integer a2=10,b2=50,c2=30;
		TestMaximum obj2=new TestMaximum(a2,b2,c2);
		obj2.findMax();
		Integer a3=10,b3=50,c3=80;
		TestMaximum obj3=new TestMaximum(a3,b3,c3);
		obj3.findMax();
	}

}
