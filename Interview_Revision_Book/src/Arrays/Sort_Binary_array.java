package Arrays;

public class Sort_Binary_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {0,0,0,1,1,0,1,0,1,1};
		one(arr);
		two(arr);
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+",");
		
		System.out.println();
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
		
	}

}
