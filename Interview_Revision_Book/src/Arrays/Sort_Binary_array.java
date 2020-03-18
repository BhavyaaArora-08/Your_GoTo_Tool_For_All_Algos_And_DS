package Arrays;

public class Sort_Binary_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {0,0,0,1,1,0,1,0,1,1};
		one(arr);

		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+",");
		
		System.out.println();
		
		two(arr);
		
	}
	
	//TC: O(n)
	public static void one(int[] arr)
	{
		int c=0;
		
		for(int i=0;i<arr.length;i++)
			if(arr[i]==0)
				c++;
		
		int i=0;
		
		while(i<c)
		{
			arr[i]=0;
			i++;
		}
		
		while(i<arr.length)
		{
			arr[i]=1;
			i++;
		}
	}
	
	//TC: O(n)
	public static void two(int[] arr)
	{
		int lo=0;
		int hi=arr.length-1;
		
		while(lo<hi)
		{
			while(lo<arr.length && arr[lo]==0)
				lo++;
			while(hi>0 && arr[hi]==1)
				hi--;
			
			if(lo<hi)
			{
				int temp=arr[lo];
				arr[lo]=arr[hi];
				arr[hi]=temp;
			}
		}
		
		for(int val:arr)
			System.out.print(val+",");
		
		System.out.println();
	}

}
