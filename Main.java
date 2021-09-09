package com.generics;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of parameters >=3");
		int choice = sc.nextInt();
		if (choice == 3) {
			String a1 = "Apple", b1 = "Peach", c1 = "Banana";
			TestMaximum<String> obj1 = new TestMaximum<>(a1, b1, c1);
			obj1.testMaximum(a1, b1, c1);
			Float a2 = 10.7f, b2 = 50.8f, c2 = 30.3f;
			TestMaximum<Float> obj2 = new TestMaximum<>(a2, b2, c2);
			obj2.testMaximum(a2, b2, c2);
			Integer a3 = 10, b3 = 50, c3 = 80;
			TestMaximum<Integer> obj3 = new TestMaximum<>(a3, b3, c3);
			obj3.testMaximum(a3, b3, c3);

		} else if (choice == 4) {
			String a1 = "Apple", b1 = "Peach", c1 = "Banana", d1 = "Avacado";
			TestMaximum<String> obj1 = new TestMaximum<>(a1, b1, c1, d1);
			obj1.testMaximum(a1, b1, c1, d1);
			Float a2 = 10.7f, b2 = 50.8f, c2 = 30.3f, d2 = 32.4f;
			TestMaximum<Float> obj2 = new TestMaximum<>(a2, b2, c2, d2);
			obj2.testMaximum(a2, b2, c2, d2);
			Integer a3 = 10, b3 = 50, c3 = 80, d3 = 42;
			TestMaximum<Integer> obj3 = new TestMaximum<>(a3, b3, c3, d3);
			obj3.testMaximum(a3, b3, c3, d3);

		}

	}

}
