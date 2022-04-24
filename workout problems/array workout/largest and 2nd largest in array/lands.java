import java.util.*;
public class lands
{
	public static void main(String [] args)
	{
		int a[] = new int [20];
		
		int size;
		int max =0;
		int temp=0;
	
		System.out.print("enter the size of array:");
		Scanner sc= new Scanner(System.in);
		size= sc.nextInt();
		System.out.println("enter the array elements");
			for(int i=0;i<size;i++)
			{
				a[i]= sc.nextInt();
			}
		System.out.println("the entered array elements are:");
		    for(int i=size-1;i>=0;i--)
			{
				System.out.print(a[i] +"\t");
			
			}
				for(int i=0;i<size;i++)
				{
					if (max < a[i] )
					{
						 temp = max;
						max=a[i];
					}
				}
				
System.out.println("the largest is" +max);
System.out.println("the second largest is" +temp);
			
		}
		
		
		
}
		

 