package com.paymoney.target.determinator;

import java.util.Arrays;

public class PayMoneyTgtDetTest {
	
	public static void main(String[] args) {
		
		test1();
		test2();
	}
	
	static void test1()  {
		
		PayMoneyTargetDeterminator determinator = new PayMoneyTargetDeterminator();
		determinator.transactionsList = new Integer[] { 20, 21, 31};
		determinator.dailyTarget = 21;
		
		System.out.printf("For transactionsList %s and for daily target %d ", 
				Arrays.toString(determinator.transactionsList), determinator.dailyTarget);
		System.out.println();
				
		determinator.determineTarget();
		
	}
	
	static void test2()  {
		
		PayMoneyTargetDeterminator determinator = new PayMoneyTargetDeterminator();
		determinator.transactionsList = new Integer[] { 25, 22, 40 };
		determinator.dailyTarget = 500;
		
		System.out.printf("For transactionsList %s and for daily target %d ", 
				Arrays.toString(determinator.transactionsList), determinator.dailyTarget);
		System.out.println();
		
		determinator.determineTarget();
		
	}
}
