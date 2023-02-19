package com.jsp.ARRAYS;

public class InsertionSort {

	public static void main(String[] args) 
	{
		int[] a= {4,2,1,5,8,3,5,6,9};
		sort(a);
		for(int n:a) {
			System.out.print(n+" ");
		}
       
	}
	static void sort(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0&&a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
	

}
