package com.roomofwar.util;

import org.junit.Assert;
import org.junit.Test;

public class TestGetGameStateOfGame {

	private GetStateOfGame getState;
	@Test
	public void testPlayerStatePresent() {
		getState = new GetStateOfGame();
		Assert.assertNotNull(getState.getState("Test", "player")); 
		
	}
	
	@Test
	public void testEnemyStatePresent() {
		getState = new GetStateOfGame();
		Assert.assertNotNull(getState.getState("Test", "enemy")); 
		
	}
	
	@Test
	public void testPlayerStateNotPresent() {
		getState = new GetStateOfGame();
		Assert.assertNull(getState.getState("Vaibhav", "player")); 
		
	}
	
	@Test
	public void testEnemyStateNotPresent() {
		getState = new GetStateOfGame();
		Assert.assertNull(getState.getState("Vaibhav", "enemy")); 
		
	}
	
	@Test
	public void isPlayerDataPresent() {
		getState = new GetStateOfGame();
		Assert.assertTrue(getState.checkStatePresent("Test"));
		
	}
}
