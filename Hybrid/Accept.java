package Arrays.hybrid;

import java.util.Scanner;

public class Accept
{
	int f=1,size,i,j,temp,gt,num1;
	int[] arr;
	Scanner sc=new Scanner(System.in);
	public void accept_demo()
	{
		System.out.println("Enter the size : ");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("Enter "+size+" numbers :");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
	}

}

