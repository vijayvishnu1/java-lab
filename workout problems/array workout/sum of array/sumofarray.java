import java.util.*;
public class sumofarray
{
	public static void main(String [] args)
	{
		int a[] = new int [20];
		int size;
		int sum=0;
		System.out.print("enter the size of array:");
		Scanner sc= new Scanner(System.in);
		size= sc.nextInt();
		System.out.println("enter the array elements");
			for(int i=0;i<size;i++)
			{
				a[i]= sc.nextInt();
			}
		System.out.println("the entered array elements are:");
		    for(int i=0;i<size;i++)
			{
				System.out.print(a[i] +"\t");
			
			}
				sum=a[0];
				for(int i=0;i<size;i++)
				{
					sum+=a[i];
				}
		System.out.println("sum of  the array is:"+sum);		
		}
		
		
		
	}
		

 