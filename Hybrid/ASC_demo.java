package Arrays.hybrid;

public class ASC_demo extends Accept
{
	public void cal_asc()
	{
		System.out.println("The Process Of Ascending :");
		accept_demo();
		System.out.println("The numbers  is =");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nThe numbers in ascending order is =");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	
}
