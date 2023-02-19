package com.jsp.ARRAYS;

public class AddAllElementsInArray {

	public static void main(String[] args) 
	{
		int[] a= {2,3,4,5,6};
		int sum=0;
		for(int n:a) {
			sum+=n;
		}
		System.out.println(sum);

	}

}
