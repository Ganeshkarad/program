package Arraylogicalprogram;



public class Arrays10 {
	
	public static int[] doubleArray(int[] a) {
		int m=0;
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]*2;
		//	System.ou t.println(m);
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Write a Java program which has a method called doubleArray(), This method accepts an array as parameter and then returns the array by doubling each element value.
//		And then in program print the returned array.
//		Ex : if the array passed as input is -
//		2,4,6
//		Then the output array returned by doubleArray() method should be - 
//		4,8,12 
//	
//		
		
	int a[]={2,4,6};
		a=doubleArray(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
