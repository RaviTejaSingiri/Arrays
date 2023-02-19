package com.jsp.ARRAYS;

public class BinarySearchUsingReccurrsion {

	public static void main(String[] args) 
	{
		int[] a= {2,6,8,9,10,11,15,20};
		System.out.println(search(a,10,0,a.length-1));
	}
	static int search(int[] a, int e, int first, int last)
	{
		int mid=(first+last)/2;
		if(first>last)return -1;
		if(e==a[mid])return mid;
		else if(e<a[mid])return search(a,e,first,mid-1);
		else return search(a,e,mid+1,last);
	}
}
