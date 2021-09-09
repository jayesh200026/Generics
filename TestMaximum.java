package com.generics;

/**
 * @author jayeshkumar
 *
 * This is generic class of type T[accept any type of data]
 */
public class TestMaximum<T extends Comparable<T>> {

	public T a, b, c, d;

	public TestMaximum(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public TestMaximum(T a, T b, T c, T d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	/**
	 * This is generic method
	 * @param <T> accept any number of parameter of type T
	 * @param values all the parameters will be store in array values
	 * Sort the values array in ascending order
	 */
	public static <T extends Comparable<T>> void testMaximum(T... values) {

		T temp;
		int len = values.length;

		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (values[j].compareTo(values[j + 1]) > 0) {
					temp = values[j];
					values[j] = values[j + 1];
					values[j + 1] = temp;

				}
			}
		}

		printMax(values);

	}

	/**
	 * This is generic method
	 *  prints the maximum which is stored in last index of array values
	 * 
	 */
	private static <T extends Comparable<T>> void printMax(T[] values) {
		System.out.print("Maximum of ");
		for (T t : values) {
			System.out.print(t + " ");

		}
		System.out.println("is " + values[values.length - 1]);

	}

}
