package com.tnsif.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Firsttest {
	//@Disabled()
	@DisplayName("My Test 1")
	@Test
	void display() {
		System.out.println("My Fisrt Test");
	}
	@RepeatedTest(4)
	@DisplayName("My Test 2")
	@Test
	void Hello() {
		System.out.println("greet");
	}
}