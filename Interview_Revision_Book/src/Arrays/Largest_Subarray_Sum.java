package Arrays;

public class Largest_Subarray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {-1,-2,-11,-3,-4};
		one(arr);
		two(arr);
		three(arr);
		
	}
	
	//TC: O(n^2) SC: O(1)
	public static void one(int[] arr)
	{
		int max=Integer.MIN_VALUE;
		
		for(int si=0;si<arr.length;si++)
		{
			int sum=0;
			for(int ei=si;ei<arr.length;ei++)
			{
				sum+=arr[ei];
				max=Math.max(max, sum);
			}
		}
		
		System.out.println(max);
	}
	
	//TC: O(n) SC: O(1)
	//Will not work when all elements are negative
	public static void two(int[] arr)
	{
		int max_so_far=0;
		int max_ending_here=0;
		
		for(int i=1;i<arr.length;i++)
		{
			max_ending_here+=arr[i];
			
			if(max_ending_here<0)
				max_ending_here=0;
			
			max_so_far=max_ending_here;
		}
		
		System.out.println(max_so_far);
		
	}
	
	//TC: O(n) SC: O(1)
	public static void three(int[] arr)
	{
		int max_so_far=arr[0];
		int curr_max=arr[0];
			
		for(int i=1;i<arr.length;i++)
		{
			curr_max=Math.max(arr[i], arr[i]+curr_max);
			max_so_far=Math.max(max_so_far,curr_max);
		}
			
		System.out.println(max_so_far);
			
	}
}
