package com.spring.basics.springin5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgo implements SortingAlgorithm {

	public int[] sort(int []nums)
	{
		return nums;
	}
}
