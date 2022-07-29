package Arraylogicalprogram;

public class Arrays4 {
public static int[] rversearray(int []arrays) {

	int i=0;
	int len=arrays.length-1;
	int j=len;
	
	
	while(i<j) {
		int temp;
		temp=arrays[i];
		arrays[i]=arrays[j];
		arrays[j]=temp;
		i++;
		j--;
	}
	return arrays;
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Write a java program to reverse the given array.

	int a[]= {10,20,30,40,50,90,1};
	int[] k=rversearray(a);
	for(int i=0;i<k.length;i++) {
		System.out.println(k[i]);
	}

	
	
	
	
	
	
	
	
	
	
	
	}

}
