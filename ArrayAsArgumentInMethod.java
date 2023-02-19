package com.jsp.ARRAYS;

public class ArrayAsArgumentInMethod {

	public static void main(String[] args) 
	{
		int[] a= {2,3,4,5,6};
		m1(a);
		

	}
	static void m1(int[] a) {
		for(int n:a)
		{
			System.out.println(n);
		}
	}

}
