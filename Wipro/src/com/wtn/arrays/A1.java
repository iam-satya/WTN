package com.wtn.arrays;

public class A1 {
	public static void main(String[] args) {
		int[] array = {8,9,1,2,3};
		
		double sum = 0;
		double average;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		average = sum / array.length;
		System.out.println("SUM: " + sum);
		System.out.println("Average: " + average);
	}

}
