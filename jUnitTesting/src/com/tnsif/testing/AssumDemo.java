package com.tnsif.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumDemo {
	@Test
	public void testAssumption() {
		int a=5, s=25;
		Assumptions.assumeFalse(s==a*a);
		System.out.println("Will be Displayed");
	}
	@Test
	public void assumingthat() {
		int a=7, b=5;
		Assumptions.assumingThat(a!=b, ()->System.out.println("Will be Displayed"));
		
	}


}
