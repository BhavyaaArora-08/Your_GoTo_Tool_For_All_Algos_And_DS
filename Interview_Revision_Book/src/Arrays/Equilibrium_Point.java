package Arrays;

public class Equilibrium_Point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,-3,5,-4,-2,3,1,0};
		one(arr);
		System.out.println();
		two(arr);
	}
	
	//TC: O(n) SC: O(n)
	public static void one(int[] arr)
	{
		int[] left=new int[arr.length];
		left[0]=arr[0];
		
		for(int i=1;i<arr.length;i++)
			left[i]=arr[i]+left[i-1];
		
		int right=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			right+=arr[i];
			if(right==left[i])
				System.out.print(i+", ");
		}
	}
	
	
	//TC: O(n) SC:O(1)
	public static void two(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
			
		int right=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(right==sum-right-arr[i])
				System.out.print(i+", ");
			
			right+=arr[i];
		}
	}

}
