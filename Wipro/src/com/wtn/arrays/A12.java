package com.wtn.arrays;

public class A12 {



    public static void main(String[] args) {
        int[] array = middleWay(new int[] {1,2,3},new int[] {4,5,6,7,8}, new int[] {3,4,5,6});

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
    public static int[] middleWay(int[]... arrays) { 
        int[] result = new int[arrays.length];          
        for(int i = 0; i < result.length; i++) {
            int index = (int) Math.round(arrays[i].length / 2); 
            result[i] = arrays[i][index];
        }
        return result;
    }
    }