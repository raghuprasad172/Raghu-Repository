package com.abstraction2;

public class MainClass1 {

	public static void main(String[] args) {
		//In1 ob = new In1();//can't instantiate an interface
							//interface does'nt have a constructor
		In1 ob2;//can create a reference variable of interface
		//ImC ob3 = new ImC();//ImC is a concrete class so we can create an object of ImC
		In1 ob3 = new ImC();//execution based on object created not the ref variable used
							//we are trying to hide the code
							//up-casting 
		ob3.test();
//WebDriver driver = new RemoteWebdDriver();		
//(interface) (ref variable) = new (Implementation();)

	}

}
