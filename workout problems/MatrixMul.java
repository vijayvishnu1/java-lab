import java.util.*;
public class MatrixMul
{
	public static void main(String args[])
	{
	int row,col;
	int row2,col2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows of matrix 1:");
		row = sc.nextInt();	
		System.out.println("enter the no columns of matrix 1 ");
		col= sc.nextInt();
		System.out.println("enter the no of rows of matrix 2:");
		row2 = sc.nextInt();	
		System.out.println("enter the no columns of matrix 2 ");
		col2= sc.nextInt();
if(col != row2)
    {
	System.out.println("column and row of both metrix miss match cant perform operation");
    }
else
	{
		int[][] matrixA= new int[row][col];
		int[][] matrixB= new int[row2][col2];
		int[][] matrixC= new int[row][col2];
		
		System.out.println("enter the elements of  matrix A");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrixA[i][j]= sc.nextInt();
			}
		}
		System.out.println("\n");
		System.out.println("enter the elements of matrix B");
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<col2;j++)
			{
				matrixB[i][j]=sc.nextInt();
		
	           }

               }
			   System.out.println("\n");
			   System.out.println("the elements of matrix A is:");
for(int i=0;i<row;i++)
{
 for(int j=0;j<col;j++)
 {			   
	System.out.print(matrixA[i][j]+"\t");	   
 }
}
System.out.println("\n");
System.out.println("the elements of matrix B is:");
for(int i =0;i<row2;i++)
{
	for(int j=0;j<col2;j++)
	{
		System.out.println(matrixB[i][j]+"\t");

	}
	System.out.println("\n");
}
System.out.println("\n");
System.out.println("after multiplication:");
for(int i=0;i<row;i++)
{    
for(int j=0;j<col2;j++)
{          
for(int k=0;k<col2;k++)      
{      
matrixC[i][j]+=matrixA[i][k]*matrixB[k][j];      
}
System.out.print(matrixC[i][j]+" ");  
} 
System.out.println("\n"); 
}    
}
}  

}