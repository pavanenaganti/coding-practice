package com.pavan.coding;

public class IfElseprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 100;
		int num2 = 200;
		int num3 = 300;

		/*
		 * //using if else
		 * 
		 * if(num1>=num2&&num1>=num3) { System.out.println("num1 is big number"); }
		 * 
		 * else if (num2>=num1&&num2>=num3) { System.out.println("num2 is big number");
		 * }
		 * 
		 * else { System.out.println("num3 is big number"); }
		 */

		// using nested if

		if (num1 >= num2) {
			if (num1 >= num3) {
				System.out.println("num1 is big number");
			} 
			else {
				System.out.println("num3 is big number");
			}

		}
		else {
			if(num2>=num3) {
				System.out.println("num2 is big number");
			}
			else {
				System.out.println("num3 is big number");
			}
			
		}
		

	}

}
