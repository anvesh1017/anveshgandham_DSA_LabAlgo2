package com.paymoney.target.determinator;
import java.util.Scanner;

public class PayMoneyTargetDeterminator {
	
	Integer[] transactionsList;
	
	Integer dailyTarget;
	
	Scanner input;
	
	public PayMoneyTargetDeterminator() {
		
		input = new Scanner(System.in);
	}
	

	private void collectTransactionList() {
		
		System.out.println("Transactions list : ");
		
		System.out.println("Enter the size of the transactions list: ");
		Integer transactionListSize = input.nextInt();
		
		transactionsList = new Integer[transactionListSize];
		
		for (int index = 0; index < transactionListSize; index++) {
			System.out.printf("Enter the transaction value : %d / %d ",
					(index + 1), transactionListSize);
			System.out.println();
			
			transactionsList[index] = input.nextInt();
	
		}
		
	}
	
	
	private void collectDailyTarget() {
		
		System.out.println("");
		System.out.println("Enter the value for daily target : ");
		dailyTarget = input.nextInt();
	}
	
	public void determine() {
		
		collectTransactionList();
		
		collectDailyTarget();
		
		determineTarget();
		
	}
	
	void determineTarget() {
		
		int currentSumOfTransactionValues = 0;
		
		boolean dailyTargetAchieved = false;
		
		int counter = 0;
		
		
		for (int index = 0; index < transactionsList.length; index++) {
			
			counter+=1; 
						
			int transactionValue = transactionsList[index];
			
			currentSumOfTransactionValues = currentSumOfTransactionValues + transactionValue;
			
			System.out.printf("Current sum of transaction values : %d", 
					currentSumOfTransactionValues);
			System.out.println();
			
			if(currentSumOfTransactionValues >= dailyTarget) {
				
				dailyTargetAchieved = true;
				break;
			}
			
		}
		
		if(dailyTargetAchieved) {
			
			System.out.printf("Daily target of %d achieved after %d transactions",
					dailyTarget, counter);
			System.out.println();
			
		} else {
			
			System.out.printf("Daily target of %d not achieved", dailyTarget);
			System.out.println();
		}
		
	}

}
