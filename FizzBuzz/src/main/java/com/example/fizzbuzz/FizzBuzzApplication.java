package com.example.fizzbuzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzBuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);

		int range = 100;
		FizzBuzzApplication fizzBuzzObj = new FizzBuzzApplication();
		for (int i = 1; i <= range; i++) 
		{
			System.out.println(fizzBuzzObj.fizzBuzz(i));
		}


	}

	public String fizzBuzz(int i) 
	{

		if ((((i % 3) == 0) ||  (Integer.toString(i).indexOf("3")!= -1)) && 
				(((i % 5) == 0) || (Integer.toString(i).indexOf("5")!= -1)))
			return "fizzbuzz";
		else if (((i % 3) == 0) || (Integer.toString(i).indexOf("3")!= -1))  
			return "fizz";
		else if (((i % 5) == 0) || (Integer.toString(i).indexOf("5")!= -1)) 
			return "buzz";
		else
			return i + ""; 

	}

}
