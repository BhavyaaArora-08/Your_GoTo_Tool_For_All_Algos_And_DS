package Arrays;

public class Maximum_Length_Subarray_With_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,6,-5,5,3,5,3,-2,0};
		one(arr, 8);
	}

	//TC: O(n^2)
	public static void one(int[] arr,int tar)
	{
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int e=i;e<arr.length;e++)
			{
				sum+=arr[e];
				if(sum==tar)
				{
					ans=Math.max(ans, (e-i+1));
					break;
				}
			}
		}
		
		System.out.println(ans);
	}
	
	//One more hashing method that i cudnt/didnt try to understand
}
