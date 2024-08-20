package com.inJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	List<String>todos=Arrays.asList("AWS","AZURE","MYSQL");
	
	@Test
	void test() {
		boolean tmp=todos.contains("AWS");
		assertEquals(true, tmp);
		assertEquals(2, todos.size(),"Error message");
		
	}

}
