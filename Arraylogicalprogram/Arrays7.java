package Arraylogicalprogram;

import java.util.Arrays;

public class Arrays7 {
	public static int[][] convertSinglearray(int[] a,int[] b,int[] c) {
		int a1=a.length;
		int b1=b.length;
		int c1=c.length;
		int len=a1+b1+c1;
		int[] arr=new int[len];
		   
		   for (int i=0;i<a1;i++) {
			   arr[i]=a[i];
		   }
			for(int i=0;i<b1;i++) {
				arr[a1+i]=b[i];
			}
			for(int i=0;i<c1;i++) {
				arr[a1+b1+i]=c[i];
			}
			

			int k=0;
		int[][] d=new int[3][4];
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				d[i][j]=arr[k];
				k++;
			}
		}
		
		return d;
		
		
		
		
//		int k= a.length+b.length;
//		int d[]=new int [k];
//
//		   for (int i=0;i<a.length;i++) {
//			   d[i]=a[i];
//		   }
//			for(int i=0;i<b.length;i++) {
//				d[a.length+i]=b[i];
//			}
//		
//			System.out.println("Merage Three array");
//			for(int i=0;i<d.length;i++) {			// System.out.print(d[i]+" ");
//			}
//		
//		
//		int D= d.length;
//		 int k2= d.length+c.length;
//		 int[] k4=new int[k2];
//		 for(int i=0;i<d.length;i++)
//		 {
//			k4[i]=d[i];
//		 }
//		 for(int i=0;i<c.length;i++) {			
//		 k4[d.length+i]=c[i];
//			}
//		
//			for(int i=0;i<k4.length;i++) {
//				//System.out.println(k4[i]+" ");
//			}
//		System.out.println(Arrays.toString(k4));	//Arrays.toString(k4);
//		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
Write a java program to convert 3 arrays into a single multidimensional array.
example : lets say we have 3 arrays, each of length 4.
arr1 = {3,5,7,9}
arr2 = {2,4,6,8}
arr3 = {0,3,6,9}
So create a multidimensional array to store these array.
arr4 = [ 3,5,7,9
	2,4,6,8
	0,3,6,9]
	
*/
	
	int a[]= {3,5,7,9};
	
	int b[]= {2,4,6,8};
	
	int c[]= {0,3,6,9};
	
	int[][] d=convertSinglearray(a,b,c);
	
	for(int i=0;i<3;i++) {
		for(int j=0;j<4;j++) {
			System.out.print(d[i][j]+" ");
		}
		System.out.println();
	}

	
		}
		
		
		
	
	
	}


