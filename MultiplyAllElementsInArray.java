package com.jsp.ARRAYS;

public class MultiplyAllElementsInArray {

	public static void main(String[] args) 
	{
		int[] a= {2,3,5,6,8};
		int multiply=1;
		for(int n:a) {
			multiply*=n;
		}
		System.out.println(multiply);

	}

}
