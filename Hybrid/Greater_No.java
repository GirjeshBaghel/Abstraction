package Arrays.hybrid;

public class Greater_No extends Accept
{
	public void cal_gr()
	{
		System.out.println("The Process Of GRETAER BETWEEN THREE NUMBERS :");
		accept_demo();
		for(i=0;i<size;i++)
		{
			if(gt<arr[i])
			{
				gt=arr[i];
			}
		}
		System.out.println("The greater vnumber is = "+gt);
	}
}
