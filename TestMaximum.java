package com.generics;

public class TestMaximum<T extends Comparable<T>> {
	
	 public  T a,b,c,d;
	
	
	  
	  public TestMaximum(T a,T b,T c) {
		  this.a=a;
		  this.b=b;
		  this.c=c;
	  }
	  public TestMaximum(T a,T b,T c,T d) {
		  this.a=a;
		  this.b=b;
		  this.c=c;
		  this.d=d;
	  }
	
	
	
	public static <T extends Comparable<T>> void testMaximum(T ...values) {
		//T[] array = (T[])values;
		
		//for(int i=0;i<values.length;i++) {
		//	array[i]=values[i];
		//}
		T temp;
		int len=values.length;
		
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-i-1;j++) {
				if(values[j].compareTo(values[j+1]) >0) {
					temp=values[j];
					values[j]=values[j+1];
					values[j+1]=temp;
					
				}
			}
		}
		System.out.print("Maximum of ");
		for(T t : values) {
			System.out.print(t+" ");
			
		}
		System.out.println("is "+values[values.length-1]);
	
	
		
		/*for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-i-1;j++) {
				if(array[j].compareTo(array[j+1]) >0) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
			}
		}*/
			  
			
		

	
}
}
	
	
	
	