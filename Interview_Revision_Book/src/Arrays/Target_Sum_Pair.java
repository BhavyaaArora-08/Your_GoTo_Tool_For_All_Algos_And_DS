package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Target_Sum_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,1,1,2,3,4,5};
		one(arr, 6);
		System.out.println();
		two(arr, 6);
		System.out.println();
		three(arr, 6);
	}
	
	// TC: O(n^2)
	public static void one(int[] arr,int target)
	{
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
					System.out.println(arr[i]+","+arr[j]);
			}
		}
	}
	
	//TC: O(nlogn) 
	public static void two(int[] arr,int target)
	{
		int lo=0;
		int hi=arr.length-1;
		Arrays.sort(arr); //O(nlogn) which is lower than O(n)
		
		//O(n)
		while(lo<hi)
		{
			int sum=arr[lo]+arr[hi];
			
			if(sum==target)
			{
				System.out.println(arr[lo]+","+arr[hi]);
				lo++;
			}
			else if(sum>target)
			{
				hi--;
			}
			else
				lo++;
		}
	}
	
	// TC: O(n)
	public static void three(int[] arr,int target)
	{
		Arrays.sort(arr);
		HashMap<Integer, Boolean> map=new HashMap<Integer, Boolean>();
		
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], true);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(target-arr[i]) && target-arr[i]>arr[i] && target-arr[i]!=arr[i])
			{
				System.out.println(arr[i]+","+(target-arr[i]));
			}
		}
	}

}
