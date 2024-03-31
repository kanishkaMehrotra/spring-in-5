	package com.spring.basics.springin5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringIn5Application {

	public static void main(String[] args) {
		
		//what are the beans which spring needs to manage
		//what are the depeendencies 
		//where to look for beans ==>@SpringBootApplication already manages it 
		
		//BinarySearchImpl binarySearch =new BinarySearchImpl(new QuickSortAlgo());
		
		//System.out.println(result);
		
		ApplicationContext applicationContext=
		SpringApplication.run(SpringIn5Application.class, args);
		BinarySearchImpl binarySearch =applicationContext.getBean(BinarySearchImpl.class);
		int result =binarySearch.BinarySearch(new int[] {1,2,3,4}, 3);
		System.out.println(result);
		
	}

}
