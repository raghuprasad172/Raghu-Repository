package com.primitivearray;

public class A3 {

	public static void main(String[] args) {
		int [] a = new int [10];
		//storing the array with the multiple of 3
		for (int i=0,j=10; i<a.length; j++)
		{
			if (j%3==0)
				a[i++]=j;
		}
		//displaying the array
		for (int i=0; i<a.length; i++)
			System.out.println(" Element at "+i+" th position "+a[i]);
	}
}
			
