package Arraylogicalprogram;

import java.util.Arrays;

public class Arrays2 {
	public static int secondLargestarray (int[] a) {
		
		System.out.println("printed Array Elements");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+ " ");	
			
		}
	System.out.println("second largerst number");
	Arrays.sort(a);
	 int second=a[a.length-2];
	 
	return second;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Write a Java program to print the second largest number in the array.
	

//		
//		
		int a[]= {10,12,13,14,50,25,78,5};
		int k =secondLargestarray(a);
		
		System.out.println(k);
	
	}

}
