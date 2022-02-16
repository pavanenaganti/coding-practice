package com.pavan.coding;

import java.util.Scanner;

public class IfElseprogram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		
		Scanner scn=new Scanner(System.in);
       System.out.print("Enter your number to checking: ");
       number=scn.nextInt();
       scn.close();
       
       if(number>0) {
    	   System.out.println("number is a +ve number");
       }
       
       else if(number<0) {
    	  System.out.println("-ve number");
       }
       
       else {
    	   System.out.println("+ve or -ve number");
       }
	}

}
