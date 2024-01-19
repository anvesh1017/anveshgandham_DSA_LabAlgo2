package com.denomination.calculator;
import java.util.Arrays;

import com.merge.sort.*;

public class DenominationCalculator {
	
	private Integer[] denominations;
	private int payableAmount;
	
	
	public DenominationCalculator(Integer[] denominations, int payableAmount) {
		this.denominations = denominations;
		this.payableAmount = payableAmount;
	}
	
	private void performSort() {
		
		MergeSort sortAlgo = new MergeSort(denominations);
		
		sortAlgo.mergeSort();
		
		System.out.printf("Sorted Array: %s  \r\n",Arrays.toString(denominations));
	}
	
	public void Calculate() {
		performSort();
		
		int denominationIndex = 0;
		int workingAmount = payableAmount;
		
		int currentTotal = 0;
		
		while(denominationIndex < denominations.length) {
			
			int currentDenomination = denominations[denominationIndex];
			
			int noOfDenominations = workingAmount/currentDenomination;
			
			int balanceAmount = workingAmount % currentDenomination;
			
			if(noOfDenominations > 0) {
				currentTotal = currentTotal + (currentDenomination * noOfDenominations);
				System.out.printf("Number of denominations required for %d is/are %d, \r\n",currentDenomination, noOfDenominations);
				int remBalance = payableAmount - currentTotal;
				System.out.printf("Remaining Balance is %d, Current Total is %d, \r\n", remBalance, currentTotal);
			}
			workingAmount = balanceAmount;
			if(workingAmount == 0) {
				break;
			}						
			
			
			denominationIndex+=1;
			
		}
		
		if(workingAmount != 0) {
			System.out.println("Cannot provide exact denomination for the given set of denominations");
		}
	}

}
