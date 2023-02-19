 package com.jsp.ARRAYS;

public class SecondSmallestElementInArray {

	public static void main(String[] args) 
	{
		int[] a= {2,5,6,9,8,4,3,1,7};
		int s1=a[0];
		int s2=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<s1) {
				s2=s1;
				s1=a[i];
			}
			else if(a[i]<s2 || s1==s2) {
				s2=a[i];
			}
		}
		System.out.println("The second smallest element is : "+s2);

	}

}
