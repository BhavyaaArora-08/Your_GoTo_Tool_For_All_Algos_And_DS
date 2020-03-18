package Arrays;

import java.util.Arrays;

public class Maximum_Product_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	//TC: O(n^2)
	public static void one(int[] arr)
	{
		
		int prod=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				prod=Math.max(prod, arr[i]*arr[j]);
			}
		}
		
		System.out.println(prod);
	}

	//TC: O(nlogn)
	public static void two(int[] arr)
	{
		if(arr.length<2)
			return;
		
		int prod=0;
		Arrays.sort(arr);
		prod=arr[arr.length-1]*arr[arr.length-2];
		System.out.println(prod);
	}
	
	
	//USing heap top two elements
}
