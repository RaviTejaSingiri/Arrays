package com.jsp.ARRAYS;

public class SelectionSort {

	public static void main(String[] args) 
	{
		int[] a= {5,4,2,8,1,3,6,9,7};
		sort(a);
		for(int n:a)  
		{
			System.out.print(n+" ");
		}

	}
	static void sort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index])index=j;
			}
			if(i!=index)
			{
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}
	}

}
