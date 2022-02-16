package com.pavan.coding;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * b1&&b2 will return true if both b1 and b2 are true else it would return
		 * false.
		 * 
		 * b1||b2 will return false if both b1 and b2 are false else it would return
		 * true.
		 */
		
		int a=10;
		int b=20;
		int c=30;
		//logical AND (&&)
		
		System.out.println(a<b&&  b<c); //true
		System.out.println(a>b&&  b<c); //false
		System.out.println(a<b&&  b>c); //false
		System.out.println(a>b&&  b>c); //false

		
		System.out.println("case:2:: ");
		System.out.println(a<b&&  b<c); //
		System.out.println(a>b&&  b<c); 
		System.out.println(a<b&&  b>c); 
		System.out.println(a>b&&  b>c);




	}

}
