package com.technoelevate.package1;

public class From {
	public static void printMessege() {
		System.out.println("this is public");
	}

	static void defaultMessage() {
		System.out.println("this is default");
	}

	protected static void protectedMesage() {
		System.out.println("this is protected");
	}

	private static void privateMessage() {
		System.out.println("this is private");
	}

	public static void main(String[] args) {
		privateMessage();
	}
}
