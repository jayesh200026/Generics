package com.generics;

public class Main {
	
	public static void main(String args[]) {
		String a1="Apple",b1="Peach",c1="Banana";
		TestMaximum obj1=new TestMaximum(a1,b1,c1);
		obj1.maximum();
		String a2="Peach",b2="Apple",c2="Banana";
		TestMaximum obj2=new TestMaximum(a2,b2,c2);
		obj2.maximum();
		String a3="Banana",b3="Peach",c3="Watermenol";
		TestMaximum obj3=new TestMaximum(a3,b3,c3);
		obj3.maximum();
	}

}
