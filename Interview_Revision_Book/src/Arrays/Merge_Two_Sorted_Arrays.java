package Arrays;

public class Merge_Two_Sorted_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {1,5,7,10};
		int[] arr2= {3,9,11};
		
		one(arr1, arr2);
	}

	//TC: O(n+m) SC: O(n+m)
	public static void one(int[] arr1,int[] arr2)
	{
		int[] arr=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j<arr2.length)
		{
			while(i<arr1.length && arr1[i]<arr2[j])
				arr[k++]=arr1[i++];
			
			while(i<arr1.length && j<arr2.length && arr2[j]<arr1[i])
				arr[k++]=arr2[j++];
		}
		
		while(i<arr1.length)
			arr[k++]=arr1[i++];
		
		while(j<arr2.length)
			arr[k++]=arr2[j++];
		
		for(int val:arr)
			System.out.println(val);
	}
	
	//Try doing Inplace too
	public static void two(int[] arr1,int[] arr2)
	{
		
	}
	
}
