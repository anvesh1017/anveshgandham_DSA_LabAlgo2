package com.merge.sort;

import java.util.Arrays;

public class MergeSortTest {

	public static void main(String args[]) {
		test();
	}
	
	static void test() {
		Integer[] inputArray = {30, 12, 19, 40};
		
		MergeSort sorter = new MergeSort(inputArray);
		
		sorter.mergeSort();
		
		System.out.println(Arrays.toString(inputArray));
	}
}
