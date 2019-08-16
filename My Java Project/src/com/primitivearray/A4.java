package com.primitivearray;

public class A4 {

	public static void main(String[] args) {
		//creating an array of size 5
		int [] a = new int [5];
		//storing the array with multiple of 5
		for (int i=0,j=0;i<a.length;j++)
		{
			if(j%5==0)
			{
				a[i++]=j;
			}
		}
		System.out.println("element of 1st array");
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		//creating another array
		int b[] = new int [5];
		//copying
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("elements of  2nd array");
		for(int i=0;i<b.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(b[i]);
			}
		}
		
		}
	}

	