	package com.spring.basics.springin5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5Application {

	public static void main(String[] args) {
		
		BinarySearchImpl binarySearch =new BinarySearchImpl(new QuickSortAlgo());
		int result =binarySearch.BinarySearch(new int[] {1,2,3,4}, 3);
		System.out.println(result);
		
		SpringApplication.run(SpringIn5Application.class, args);
	}

}
