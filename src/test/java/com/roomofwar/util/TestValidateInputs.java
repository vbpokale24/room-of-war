package com.roomofwar.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestValidateInputs {

	Validateinputs validateinput; 
	@Before
	public void createObject() {
		validateinput = new Validateinputs();
	}
	
	@Test
	public void testWeaponInputsForNegativeNumber() {
		Assert.assertFalse(validateinput.validateWeaponInput(-5));
	}
	
	@Test
	public void testWeaponInputsForZeroNumber() {
		Assert.assertFalse(validateinput.validateWeaponInput(0));
	}
	
	@Test
	public void testWeaponInputsForGreaterThanFive() {
		Assert.assertFalse(validateinput.validateWeaponInput(6));
	}
	
	@Test
	public void testWeaponInputsForvalidValue() {
		Assert.assertTrue(validateinput.validateWeaponInput(2));
	}
	
	@Test
	public void testValidateInputMethodForNegativeNumber() {
		Assert.assertFalse(validateinput.validateInput(-4));
	}
	
	@Test
	public void testValidateInputMethodForZero() {
		Assert.assertFalse(validateinput.validateInput(0));
	}
	
	@Test
	public void testValidateInputMethodForNoMoreThanHundred() {
		Assert.assertFalse(validateinput.validateInput(101));
	}
	
	@Test
	public void testValidateInputMethodForValidno() {
		Assert.assertTrue(validateinput.validateInput(67));
	}
}
