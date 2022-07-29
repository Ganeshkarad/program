package Arraylogicalprogram;

import java.util.Arrays;

public class Arrays6 {
 public static int[] concatenatAndsorted(int [] a,int[] b) {
	 int a1=a.length;
	   int b1=b.length;
	   int len=a1+b1;
	   
	   int c[]=new int [len]; 
	   
	   for (int i=0;i<a1;i++) {
		   c[i]=a[i];
	   }
		for(int i=0;i<b1;i++) {
			c[a1+i]=b[i];
		}

		
		 Arrays.sort(c);
		return c;
//			for ( int i=0;i<c.length;i++) {
//			System.out.println( c[i]+" ");	
//			}
		
			//System.out.print(Arrays.toString(c));
		 
 }
	public static void main(String[] args) {
/*
 6.	Write a Java program which will create a 
 concatenated and sorted array of two arrays.
Lets say we have array1 = {3,5,1,0,4}
and array2 = {7,9,8,6,2}
Then the program will create a final 
array which will be 
array3 = {0,1,2,3,4,5,6,7,8,9}  
*/
   int a[]=	 {3,5,1,0,4};
   
   int b[]= {7,9,8,6,2};
 
  int k[]= concatenatAndsorted(a,b);
   
   for ( int i=0;i<k.length;i++) {
		System.out.println( k[i]+" ");	
		}
	
	}

}
