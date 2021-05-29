package com.technoelevate.customexception;

public class FriendAskMeMoneyMain {

	public static void main(String[] args) throws NoMoneyException {
		
		Me m = new Me();
		m.hasMoney(70);
	}

}
