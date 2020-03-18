package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Find_Duplicate_Element_In_The_Given_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,2,3,4};
		one(arr);
		two(arr);
		three(arr);
	}
	
	//TC: O(nlogn) SC:O(1)
	public static void one(int[] arr)
	{
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=i+1)
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}
	
	//TC: O(n) SC:O(n)
	public static void two(int[] arr)
	{
		HashMap<Integer,Boolean> map=new HashMap<Integer, Boolean>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				System.out.println(arr[i]);
				break;
			}
			else
				map.put(arr[i], true);
		}
	}
	
	//TC: O(n) SC:O(1)
	public static void three(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[arr[i]-1]>=0)
				arr[arr[i]-1]=-arr[arr[i]-1];
			else
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}
	
	//TC: O(n) SC:O(1)
	public static void four(int[] arr)
	{
		int xor=0;
	
	}

}
