package com.generics;

public class TestMaximum<T extends Comparable<T>> {
	
	 public  T a,b,c;
	
	
	  
	  public TestMaximum(T a,T b,T c) {
		  this.a=a;
		  this.b=b;
		  this.c=c;
	  }
	
	

	  
	  public void findMax() {
		  T res=TestMaximum.testMaximum(a, b, c);
		  System.out.println("Maximum of " + a + "," + b + " and " + c + " is =" + res);
	  }
	
	public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {
		
		T max =a;
		
		if (b.compareTo(max) > 0) {

			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}

		return max;

	}
}
	
	
	
	