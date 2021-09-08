package com.generics;

public class Main {
	
	public static void main(String args[]) {
		Float a1=40.3f,b1=20.9f,c1=30.7f;
		TestMaximum obj1=new TestMaximum(a1,b1,c1);
		obj1.maximum();
		Float a2=10.7f,b2=50.8f,c2=30.3f;
		TestMaximum obj2=new TestMaximum(a2,b2,c2);
		obj2.maximum();
		Float a3=10.2f,b3=50.6f,c3=80.9f;
		TestMaximum obj3=new TestMaximum(a3,b3,c3);
		obj3.maximum();
	}

}
