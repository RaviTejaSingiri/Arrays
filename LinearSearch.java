package com.jsp.ARRAYS;

public class LinearSearch {

	public static void main(String[] args) 
	{
		int[] a= {2,6,3,8,9,7,5,1,6};
		System.out.println(search(a,5));
		System.out.println(search(a,16));

	}
	static int search(int[] a,int e)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==e)return i;
		}
		return -1;
		
	}

}
