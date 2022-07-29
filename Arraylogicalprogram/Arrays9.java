package Arraylogicalprogram;

public class Arrays9 {
	public static int[][] transposetwoDarray(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			
		}
			}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to transpose a 2D array.
//		Example : If the given array is 
//		2	4	8
//		3	6	9
//Then the Output should be - 
//		2	3
//		4	6
//		8	9


int a[][]= {{2,3},{4,6},{8,9}};

 int[][]k=transposetwoDarray(a);
		
for(int i=0;i<k.length;i++) {
	for(int j=0;j<k[i].length;j++) {
	System.out.print(k[i][j]+" ");
}System.out.println();
	}	
		
		
		
		
	}

}
