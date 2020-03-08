package com.example.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FizzBuzzApplicationTests {

	@Test
	void contextLoads() {
		
		FizzBuzzApplication test = new FizzBuzzApplication(); 

        // assert statements
        assertEquals("fizz", test.fizzBuzz(3), "Buzz");
        
        assertEquals("buzz", test.fizzBuzz(5), "Buzz");
        
        assertEquals("fizzbuzz", test.fizzBuzz(15), "Buzz");
        
        assertEquals("fizz", test.fizzBuzz(31), "Buzz");
        
        assertEquals("fizzbuzz", test.fizzBuzz(51), "Buzz");
        
        assertEquals("buzz", test.fizzBuzz(52), "Buzz");
        
        assertEquals("fizzbuzz", test.fizzBuzz(53), "Buzz");
        
        
        
        
	}

}
