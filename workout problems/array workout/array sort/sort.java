import java.util.*;
public class sort
{
	public static void main(String [] args)
	{
		int a[] = new int [20];
		
		int size;
	
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
				
				for(int i=0;i<size-1;i++)
				{
					for(int j=0;j<size-1;j++)
					{
						if (a[j] > a[j+1])
						{
							int temp= a[j];
							a[j] = a[j+1];
							a[j+1]=temp;
							
						}
					}
				}
				System.out.println("the sorted array elements are:");
			for(int i=0;i<size;i++)
			{
				System.out.print(a[i]+"\t");
			}

			
		}
		
		
		
	}
		

 