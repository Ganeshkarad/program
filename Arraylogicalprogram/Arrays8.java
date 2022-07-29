package Arraylogicalprogram;

public class Arrays8 {
  public static int[] twoDimensionarray(int[][] a) {
	  
	  int row =a.length, col=a[0].length;
		
	  int[] arr=new int[row+col];
	  int k;
for(k=0;k<row;k++)
{int rowsum=0;
for (int j=0;j<col;j++) {
	rowsum=rowsum+a[k][j];  
}

arr[k]=rowsum;
}
	
		
for(int i = 0; i < col; i++){  
  int sumCol = 0;  
  for(int j = 0; j < row; j++){  
    sumCol = sumCol + a[j][i];  
  }  

arr[k+i]=sumCol;
}


return arr;

	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a java program to create a 2D array 
//		which has 3 columns and 4 rows and display
//		the sum of each rows and columns.
//		Example : consider below array
//		2	6	8
//		3	7	0
//		4	5	3
//		1	0	9


int[] []a= new int[][] {
	{2,6,8},{3,7,0},{4,5,3},{1,0,9}
};
 
int [] k=twoDimensionarray(a);
for(int i=0;i<7;i++) {
	if(i<4) {
		System.out.println("sum of Row "+(i+1)+"=" +k[i]);
	}
	else {
		System.out.println("sum of Col "+(i-3)+"=" +k[i]);
	}
}

	}}

