package com.inheritance;

public class A6 extends A5 {
	int y;
	public static void main(String[] args) {
		A6 ob = new A6();
		System.out.println("x:"+ob.x+"y:"+ob.y);//0//0
		A5 ob1 = new A5();
		System.out.println("x:"+ob1.x);//0
		//CTE//System.out.println("y:"+ob1.y);
}

}
