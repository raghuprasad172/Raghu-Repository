package com.polymorphism;

public class P2 extends P1 {
	void bulletPrakash()
	{
		System.out.println("from P2 of bulletPrakash");
	}
	 void klRahul()
	{
		System.out.println("from P2 of klRahul");
	}

	public static void main(String[] args) {
		//P1.klRahul();//from P1 of klRahul
		//P2.klRahul();//from P1 of klRahul
		//P1 ob1 = new P1();
		//ob1.klRahul();//from P1 of klRahul
		//ob1.bulletPrakash();//from P2 of bulletPrakash
		//P1 ob2 = new P1();
		//ob2.klRahul();//from P1 of klRahul
		//ob2.bulletPrakash();//from P1 of bulletPrakash
		P1 ob3 = new P2();
		ob3.klRahul();//from P2 of klRahul
		ob3.bulletPrakash();//from P1 of bulletPrakash
		
				
				
	}

}
