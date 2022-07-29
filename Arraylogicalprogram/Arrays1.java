package Arraylogicalprogram;

public class Arrays1 {
	
	public static double calculateAverage(int[] arr) {
		
		int sum=0; double avg;
		
		for (int i=0;i<arr.length;i++) {
			sum=arr[i]+sum;
		}
		avg=sum/arr.length;
		
		return avg;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	Write a Java program to print the average of
	 all the items in the array.

	 */
	
	
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	double aa1 =calculateAverage(a);
	System.out.println(aa1);
	
	}

}
