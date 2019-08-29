package com.inheritance;

public class P2 extends P1
{
	int j=20;
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println("from iib of P2");
	}
	P2()
	{
		System.out.println("from P2()");
	}
	public static void main(String[] args) {
		System.out.println("from main of P2");
		P2 ob1 = new P2();
		System.out.println(new P2());
		System.out.println("i: "+ob1.i+"j" +ob1.j);
		
	}

}
