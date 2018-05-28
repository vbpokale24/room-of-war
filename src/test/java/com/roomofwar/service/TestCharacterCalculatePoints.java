package com.roomofwar.service;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCharacterCalculatePoints {

	private Player player;
	private Enemy enemy;
	

	@Before
	public void setDataForPlayer() {
		player = new Player("Vaibhav", "KING", 37, 15, true, 23, Arrays.asList("Arrow","Sword"));
	}
	
	@Before
	public void setDataForEnemy() {
		enemy = new Enemy("xxx", "WARRIOR", 23, 13, true, 29, Arrays.asList("Arrow","Sword"));
	}
	
	
	@Test
	public void calculatePlayerPoint() {
		int playerPoint = player.calculatePoints(player);
		Assert.assertEquals(701, playerPoint);
	}	
	
	@Test
	public void calculateEnemyPoint() {
		int enemyPoint = enemy.calculatePoints(enemy);
		Assert.assertEquals(618, enemyPoint);
	}	
	
	@Test
	public void checkPlayerCalculatedPointIsNotNegative() {
		int playerPoint = player.calculatePoints(player);
		Assert.assertTrue(playerPoint>0);
	}	
	
	@Test
	public void checkEnemyCalculatedPointIsNotNegative() {
		int enemyPoint = enemy.calculatePoints(enemy);
		Assert.assertTrue(enemyPoint>0);
	}	
}
