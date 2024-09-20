package com.tnsif.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberTestCase {
	@Test
	@DisplayName("FactorialTest")
	public void factorialTest() {
		int exp=120;
		int act=NumberFunctions.getFactorial(5);
		assertEquals(exp,act);
	}
}
