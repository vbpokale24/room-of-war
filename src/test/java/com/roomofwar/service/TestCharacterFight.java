package com.roomofwar.service;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCharacterFight {
	private Player player;
	private Enemy enemy;
	private Enemy enemyToWin;
	private Player expectedPlayer;
	private Enemy expectedEnemy;
	
	@Before
	public void setDataForPlayer() {
		player = new Player("Vaibhav", "KING", 37, 15, true, 23, Arrays.asList("Arrow","Sword"));
	}
	
	@Before
	public void setDataForExpectedPlayer() {
		expectedPlayer = new Player("Vaibhav", "KING", 37, 20, true, 23, Arrays.asList("Arrow","Sword"));
	}

	@Before
	public void setDataForEnemy() {
		enemy = new Enemy("Hector", "WARRIOR", 13, 10, true, 5, Arrays.asList("sword","axe"));
	}
	
	@Before
	public void setDataForEnemyToWin() {
		enemyToWin = new Enemy("Hector", "WARRIOR", 23, 34, true, 89, Arrays.asList("sword","axe"));
	}
	@Before
	public void setDataForExpectedEnemy() {
		expectedEnemy = new Enemy("Hector", "WARRIOR", 23, 36, true, 29, Arrays.asList("sword","axe"));
	}
	
	@Test
	public void fightPlayerWin() {
		player.fight(player, enemy, 3);	
		Assert.assertEquals(player, expectedPlayer);		
	}
	
	@Test
	public void checkExperienceAfterEnemyWin() {
		enemy.fight(player, enemyToWin, 3);		
		Assert.assertEquals(enemyToWin.getExperience(), expectedEnemy.getExperience());		
	}
	
	@Test
	public void testExpAfterPlayerWin() {
		player.fight(player, enemy, 3);	
		Assert.assertEquals(player.getExperience(), expectedPlayer.getExperience());		
	}	
	
	
}
