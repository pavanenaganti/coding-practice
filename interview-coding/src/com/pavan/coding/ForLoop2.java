package com.pavan.coding;

public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int num=1000;
           int sum=0;
			/*
			 * for(int i=1;i<=num;i++) { sum=sum+i; }
			 */
           
           for(int i=num;i>=1;--i) {
        	   sum=sum+i; //sum+=i;
           }
           
           System.out.println("sum of "+num+" natural number "+sum);
	}

}
