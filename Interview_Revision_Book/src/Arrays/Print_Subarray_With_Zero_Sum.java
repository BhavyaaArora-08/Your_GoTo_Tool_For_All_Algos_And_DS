package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class Print_Subarray_With_Zero_Sum {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,-2,-2,0,-4,+4};
		one(arr);
		System.out.println();
		two(arr);
		
	}
	
	//TC: O(n^3) SC: O(1)
	public static void one(int[] arr)
	{
			
		for(int si=0;si<arr.length;si++)
		{
			int sum=0;
			for(int ei=si;ei<arr.length;ei++)
			{
				sum+=arr[ei];
				if(sum==0)
					print(arr,si,ei);
			}
		}
			
	}
		
	//TC: O(n^3) SC: O(n^2)  check this complexity
	public static void two(int[] arr)
	{
		int[] sum=new int[arr.length];
		
		sum[0]=arr[0];
		HashMap<Integer, ArrayList<Integer>> map=new HashMap();
		
		ArrayList<Integer> temp=new ArrayList();
		temp.add(0);
		map.put(sum[0], temp);
			
		for(int i=1;i<arr.length;i++)
		{
			sum[i]=sum[i-1]+arr[i];
			if(map.containsKey(sum[i]))
			{
				for(int val:map.get(sum[i]))
				{
					print(arr,val+1,i);
				}
				
				temp=map.get(sum[i]);
				temp.add(i);
				map.put(sum[i], temp);
			}
			else
			{
				temp=new ArrayList<Integer>();
				temp.add(i);
				map.put(sum[i], temp);
			}
			
		}
			
	}

	private static void print(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		
		for(int i=si;i<=ei;i++)
			System.out.print(arr[i]+",");
		
		System.out.println();
	}
	
}
