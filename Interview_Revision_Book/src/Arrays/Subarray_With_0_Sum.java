package Arrays;

import java.util.HashMap;

public class Subarray_With_0_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,-1,2,+2};
		
		System.out.println(one(arr));
		System.out.println(two(arr));
	}
	
	//TC: O(n^2)
	public static boolean one(int[] arr)
	{
		
		for(int si=0;si<arr.length;si++)
		{
			int sum=0;
			for(int ei=si;ei<arr.length;ei++)
			{
				sum+=arr[ei];
				if(sum==0)
					return true;
			}
		}
		
		return false;
	}
	
	
	//TC: O(n)
	public static boolean two(int[] arr)
	{
		int[] sum=new int[arr.length];
		
		sum[0]=arr[0];
		HashMap<Integer, Boolean> map=new HashMap<Integer, Boolean>();
		
		map.put(arr[0], true);
		
		for(int i=1;i<arr.length;i++)
		{
			sum[i]=sum[i-1]+arr[i];
			if(map.containsKey(sum[i]))
				return true;
			else
				map.put(sum[i],true);
		}
		
		return false;
	}
}
