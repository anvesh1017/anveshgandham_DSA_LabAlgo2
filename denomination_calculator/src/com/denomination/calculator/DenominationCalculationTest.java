package com.denomination.calculator;

import java.util.Arrays;

public class DenominationCalculationTest {
	
	public static void main(String args[]) {
		test1();
		test2();
	}
	
	static void test1() {
		Integer[] denominations = {5, 1, 10};
		int payableAmount = 12;
		
		System.out.printf("Denominations given are: %s, for payable amount of: %d \r\n", Arrays.toString(denominations), payableAmount);
		
		DenominationCalculator calc = new DenominationCalculator(denominations, payableAmount);
		
		calc.Calculate();
	}
	
	static void test2() {
		Integer[] denominations = {12, 5, 123, 18};
		int payableAmount = 160;
		
		System.out.printf("Denominations given are: %s, for payable amount of: %d \r\n", Arrays.toString(denominations), payableAmount);
		
		DenominationCalculator calc = new DenominationCalculator(denominations, payableAmount);
		
		calc.Calculate();
	}

}
