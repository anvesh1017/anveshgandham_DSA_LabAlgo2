package com.denomination.calculator;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		System.out.println("Enter the max number of denominations required:");
		
		Scanner input = new Scanner(System.in);
		
		int arrayMaxLength = input.nextInt();
		
		Integer[] denominationsArray = new Integer[arrayMaxLength];
		
		for (int index = 0; index < arrayMaxLength; index++) {
			System.out.printf("Enter the denomination value : %d / %d ",
					(index + 1), arrayMaxLength);
			System.out.println();
			
			denominationsArray[index] = input.nextInt();
	
		}
		
		System.out.println("Enter the payable amount:");
		
		int payableAmount = input.nextInt();
		
		
		input.close();
		
		DenominationCalculator calc = new DenominationCalculator(denominationsArray, payableAmount);
		
		calc.Calculate();
	}

}
