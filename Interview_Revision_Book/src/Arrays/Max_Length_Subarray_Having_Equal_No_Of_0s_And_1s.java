package Arrays;

import java.util.HashMap;

public class Max_Length_Subarray_Having_Equal_No_Of_0s_And_1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {0,0,1,0,1,0,0};
		one(arr);
		two(arr);
	}

	//TC: O(n^2) SC: O(1)
	public static void one(int[] arr)
	{
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			int one=0;
			int zero=0;
			for(int e=i;e<arr.length;e++)
			{
				if(arr[e]==0)
					zero++;
				else
					one++;
				
				if(zero==one && zero!=0)
					ans=Math.max(zero*2, ans);
			}
		}
			
		System.out.println(ans);
	}
	
	
	//TC: O(n) SC: O(1)
	public static void two(int[] arr)
	{
		int[] sum=new int[arr.length];
		int ans=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==0)
				arr[i]=-1;
		
		sum[0]=arr[0];
		HashMap<Integer, Integer> map=new HashMap();
		
		map.put(arr[0], 0);
		
		for(int i=1;i<arr.length;i++)
		{
			sum[i]=sum[i-1]+arr[i];
			if(map.containsKey(sum[i]))
				ans=Math.max(ans, i-map.get(sum[i]));
			else
				map.put(sum[i],i);
		}
		
		System.out.println(ans);
		
		for(int i=0;i<arr.length;i++)
			if(arr[i]==-1)
				arr[i]=0;
	}
	
}
