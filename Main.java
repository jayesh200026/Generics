package com.generics;

public class Main {
	
	public static void main(String args[]) {
		String a1="Apple",b1="Peach",c1="Banana";
		TestMaximum<String> obj1=new TestMaximum<>(a1, b1, c1);
		obj1.findMax();
		Float a2=10.7f,b2=50.8f,c2=30.3f;
		TestMaximum<Float> obj2=new TestMaximum<>(a2, b2, c2);
		obj2.findMax();
		Integer a3=10,b3=50,c3=80;
		TestMaximum<Integer> obj3=new TestMaximum<>(a3, b3, c3);
		obj3.findMax();
	}

}
