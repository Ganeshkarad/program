package Arraylogicalprogram;

import java.util.Arrays;
import java.util.HashSet;

public class Arrays3 {

	
		
		public static int[] removeDuplicate(int[]arrays) {
			Arrays.sort(arrays);
			int len=arrays.length;
			 
			int j=0;
			for (int i=0;i<len-1;i++) {
				if(arrays[i]!=arrays[i+1])
				{
					
					arrays[j]=arrays[i];
					j++;
				}
			}
		arrays[j]=arrays[len-1];
		
		for(int i=0;i<j+1;i++) {
			System.out.println(arrays[i]);
		}
		return arrays;
		}
  
   
   
   public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to remove the duplicate numbers from an array.

  int a[]= {10,12,8,9,9,9,8,4,5,6,10,4,1,1,1};
  removeDuplicate(a);
  
	 
	 
	 
	 
	 
	
	
	
	}

	}
