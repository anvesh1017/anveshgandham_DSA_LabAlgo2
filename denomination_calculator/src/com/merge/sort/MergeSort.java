package com.merge.sort;

import java.util.Arrays;

import com.array.merger.*;

public class MergeSort {
	
	private Integer[] inputArray;
	
	public MergeSort(Integer[] inputArray) {
		
		this.inputArray = inputArray;
	}
	
	public void mergeSort() {
		mergeInternal(0, (inputArray.length -1));
	}
	
	private void mergeInternal(int startIndex, int endIndex) {
		
		
		if(startIndex < endIndex) {
			int midPointIndex = (startIndex + endIndex)/2;
			
//			System.out.printf("Start Index: %d, End Index: %d \r\n", startIndex, endIndex);
			mergeInternal(startIndex, midPointIndex);
			 
			mergeInternal((midPointIndex+1), endIndex);
			
			ArraySlicerAndMerger slicerAndMerge = new ArraySlicerAndMerger(inputArray);
			
			slicerAndMerge.sliceAndMerge(startIndex, midPointIndex, endIndex);
			
		}
	}

}
