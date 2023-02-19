package com.jsp.ARRAYS;

public class SmallestElementInArray {

	public static void main(String[] args) 
	{
		int[] a= {2,5,3,5,9,1,6};
		int s=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<s)s=a[i];
		}
		System.out.println(s);
			

	}

}
