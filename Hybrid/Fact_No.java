package Arrays.hybrid;

public class Fact_No extends Greater_No {

	public void cal_fact()
	{
		System.out.println("The Process Of FACTORIAL :");
		accept_demo();
		num1=arr[0];
		while(num1>0)
		{
		f=f*num1;
		num1--;
		}
		System.out.println("The factorial is ="+f);
	}

}
