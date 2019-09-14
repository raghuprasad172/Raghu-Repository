package com.abstraction2;

public class Transaction {

	public static void main(String[] args) {
		ATM atm = new IciciAtm();//ATM because hiding the implementation
		atm.depositing(1000);//1000
		atm.checkBalance();//1000
		atm.withdrawing(500);//500
		atm.checkBalance();//500
		
	}

}
