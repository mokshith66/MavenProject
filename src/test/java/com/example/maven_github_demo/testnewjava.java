package com.example.maven_github_demo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class testnewjava{
@Test
	void testTotal() {
		assertEquals(225,Gradecalculator.calculateTotal(75,68,82));
	}
@Test
	void testAverage() {
		assertEquals(75.0,Gradecalculator.calculateAverage(75,68,82));
	}
@Test
	void testpass() {
		assertTrue(Gradecalculator.isPass(75.0));
		}
@Test
	void testfail() {
		assertFalse(Gradecalculator.isPass(35.0));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}