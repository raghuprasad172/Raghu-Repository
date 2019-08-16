package com.primitivearray;

public class A2 {

	public static void main(String[] args) {
		int[] a = new int[10];
		//storing the array with multiple of 8
			for (int i=0,j=50;i<a.length;j++)
				{
				if(j%8==0)	
				a[i++]=j;
				}
			//displaying the array
			for(int i=0;i<a.length;i++)
			{
				System.out.println(" Element at "+i+" th position "+a[i]);
			}
		}
	
	}


