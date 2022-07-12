package Abstraction;

import java.util.Scanner;

public class Fibo_Series extends Abstract_Class{

	@Override
	void fibo() {
		 Scanner sc = new Scanner(System.in);
	        int n1, n2,n3,count;
	        
	        // asking the starting value and last value
	        System.out.print("Please enter the two value for Fibonacci Series : ");
	        n1 = sc.nextInt();
	        n2 = sc.nextInt();
	        System.out.println(" Your starting value is : "+n1+"   Your Ending value is : "+n2);
	        
	        // asking the no of count that loop will be run
	        System.out.println("Please enter the Counting value : ");
	        count = sc.nextInt();
	        for(int i=2 ; i<count; ++i)
	        {
	            // adding the stating value and last value
	            n3 = n1+n2;
	            System.out.print(" "+n3);
	            // interchange value
	            n1 = n2;
	            n2 = n3;
	        }
		
	}

}
