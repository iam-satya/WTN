package com.wtn.arrays;
import java.util.*;
public class A7 {
	public static void main(String[] args) {
		int[] array = {12, 34, 12, 45, 67, 89};
		List<Integer> distinctArray = new ArrayList<>();
		
		for (int item : array) {
			if (!distinctArray.contains(item))
				distinctArray.add(item);
		}
		
		System.out.println(Arrays.toString(distinctArray.toArray()));}
}