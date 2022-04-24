import java.util.*;
public class Arraylargestelements
{
	public static void main(String [] args)
	{
		int a[] = new int [20];
		int size;
		int max=0;
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
				max=a[0];
				for(int i=0;i<size;i++)
				{
					if(max < a[i])
					{
						max=a[i];
					}
				}
		System.out.println("the largest among the array is:"+max);		
		}
		
		
		
	}
		

 