package com.wtn.arrays;

public class A3 {
	public static void main(String[] args) {
		int[] array = {6,7,8,9,10,1,5};
		int element = 9;
		int position = -1;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				position = i + 1;
				break;
			}
		}

		System.out.println(position);
	}


}
