package com.operators;

public class Logical_and {
	public static void main(String[] args) {
		
		int a=10,b=20,c=30;
		
		System.out.println(a<b && a<c);
		System.out.println(a>b && a<c); // in logical and operatin if first condition is false then it will not check the second condition even if it is true.
		System.out.println(a<b || a<c);
		System.out.println(a>b || a<c);// in logical or operation if first condition is false then only it will check the second condition.
	}

}
