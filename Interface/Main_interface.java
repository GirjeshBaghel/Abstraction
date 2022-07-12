package Abstraction;

import java.util.Scanner;

public class Main_interface implements Rev_Interface, Smallest_Array {

	Scanner sc = new Scanner(System.in);
	int i;
	
	@Override
	public void rev() 
	{
		// TODO Auto-generated method stub
		System.out.print("Please enter the digit here : ");
		int num , rev = 0;
		
		num = sc.nextInt();
		while(num != 0)   
		{  
		int r = num % 10;  
		rev = rev * 10 + r;  
		num = num/10;  
		}  
		System.out.println("The reverse of the given number is: " + rev);  
	}  
	
		
	
	public  void small() 
	{		  
		// this is smallest function
		System.out.print("Enter the array size : ");
		
		int size = sc.nextInt();
		int[] arr = new int[size];
        
        System.out.print("Please enter the "+size +"values : ");
        
        // taking array from user
        for(i=0; i<arr.length;i++)
        {
            
            arr[i] = sc.nextInt();
        }
        
        int small = arr[0];
        
        // checking the condition which is smallest value       
        for (i = 1; i < arr.length; i++)
         {
            if (arr[i] < small)
            small = arr[i];
         }
        
        System.out.println("Smallest : "+small);
        
     }
		

	public static void main(String[] args)
	{
		Main_interface ob = new Main_interface ();
		ob.rev();
		ob.small();
	}
		


}
