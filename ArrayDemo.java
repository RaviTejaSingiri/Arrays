package com.jsp.ARRAYS;

public class ArrayDemo {

	public static void main(String[] args) 
	{
		int[] a=new int[3];		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		int [] b;
		b=a;
		System.out.println(b[0]);//10
		a[0]=40;
		System.out.println(b[0]);//40
		System.out.println("--------------");
		for(int n:a)
		{
			System.out.println(n);
		}

	}

}
