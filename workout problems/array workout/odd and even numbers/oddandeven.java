import java.util.*;
public class oddandeven
{
	public static void main(String [] args)
	{
		int a[] = new int [20];
		
		int size;
		
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
			System.out.println("\n");
				for(int i=0;i<size;i++)
				{
					if (a[i]%2==0)
					{
						System.out.println("the even numbers are:"+a[i]); 
					}
					else
					{
						System.out.println("the odd numbers are:"+a[i]);
					}
				}
				

			
		}
		
		
		
}
		

 