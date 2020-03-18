package Arrays;

public class Dutch_Flag_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {0,1,0,0,0,1,2,2};
		one(arr);
		two(arr);
	}
	
	//TC: O(n) but in two traversals
	public static void one(int[] arr)
	{
		int z=0,o=0,t=0;
		
		for(int val:arr)
		{
			if(val==0)
				z++;
			else if(val==1)
				o++;
			else
				t++;
		}
		
		
		int i=0;
		
		while(i<z)
			arr[i++]=0;
		
		while(i<o)
			arr[i++]=1;
		
		while(i<t)
			arr[i++]=2;
	
	}
	
	//TC: O(n) but in one traversal
	public static void two(int[] arr)
	{
		int start=0,i=0,end=arr.length-1,pivot=1;
		
		while(i<end)
		{
			if(arr[i]==0)
			{
				swap(arr,start,i);
				start++;
			}
			else if(arr[i]==2)
			{
				swap(arr, i, end);
				end--;
			}
			
			i++;
		}
		
		
//		for(int val:arr)
//			System.out.println(val);
		
	}

	private static void swap(int[] arr, int start, int i) {
		// TODO Auto-generated method stub
		
		int temp=arr[start];
		arr[start]=arr[i];
		arr[i]=temp;
		
	}
	

}
