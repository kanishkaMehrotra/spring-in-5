package com.spring.basics.springin5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	//sorting an array
	//searhc the array
	//return the result
	
@Autowired
	private SortingAlgorithm sortAlgo;
	
	
	public BinarySearchImpl(SortingAlgorithm sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}


	public int BinarySearch(int [] arr,int n)
	{
		int arr2[]=sortAlgo.sort(arr);
		System.out.println(sortAlgo);
		return 3;
	}

}
