package com.jsp.ARRAYS;

public class QuickSort {

	public static void main(String[] args) 
	{
		int[] a= {5,1,2,3,6,9,7,4};
		sort(a,0,a.length-1);
		for(int n:a)
		{
			System.out.print(n+"\t");
		}
	}
	public static void sort(int[] a,int start,int end)
	{
		if(start>=end)return;
		int pivot = a[(start+end)/2];
		int i=start;
        int j=end;
        while(i<=j)
        {
        	while(a[i]<pivot)i++;
        	while(a[j]>pivot)j--;
        	if(i<=j)
        	{
        		int temp=a[i];
        		a[i]=a[j];
        		a[j]=temp;
        		i++;
        		j--;
        	}
        }
        sort(a,start,j);
        sort(a,i,end);
	}

}
