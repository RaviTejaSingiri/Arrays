package com.jsp.ARRAYS;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int[] a= {2,3,4,5,6,7,9,10};
		System.out.println(search(a,9));
	}
	static int search(int[] a,int e)
	{
		int first=0;
		int last=a.length-1;
		while(first<=last)
		{
			int mid=(first + last)/2;
			if(e==a[mid])return mid;
			else if(e<a[mid]) last=mid-1;
			else first=mid+1;
		}
		return -1;
				
		
	}

}
