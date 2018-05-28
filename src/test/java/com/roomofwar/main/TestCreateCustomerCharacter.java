package com.roomofwar.main;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;



public class TestCreateCustomerCharacter {

	private Scanner sc;
	
	@Test
	public void testInputForValidArg() {
		sc = new Scanner("15");
		int output = CreateCustomCharacter.validateValue(sc);
		Assert.assertTrue(output==15);
		
	}
	@Test
	public void testInputForStringArg() {
		sc = new Scanner("String");	
		int output = CreateCustomCharacter.validateValue(sc);
		Assert.assertTrue(output==60);		
	}
	
	@Test
	public void testInputGrtThanHundArg() {
		sc = new Scanner("102");	
		int output = CreateCustomCharacter.validateValue(sc);
		Assert.assertTrue(output==60);		
	}
	
	@Test
	public void testInputForNegativeArg() {
		sc = new Scanner("-102");	
		int output = CreateCustomCharacter.validateValue(sc);
		Assert.assertTrue(output==60);		
	}
}
