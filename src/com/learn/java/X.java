package com.learn.java;

import java.util.Scanner;

public class X {
	
	private int x;
	
	public X(Scanner x) {
		System.out.println("Enter number:");
		this.x = x.nextInt();
	}

	public void x() {
		System.out.println("/*--- " + this.x + " Times table ---*/");
		for(int x = 1; x <= 12; x++) {
			System.out.println(this.x + " * " + x + " = " + this.x * x);
		}
	}
}
