package com.roomofwar.service;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCharacterFactory {

	private Player player;
	private Enemy enemy;
	private CharacterFactory factory;
	private Character character;
	@Before
	public void setDataForPlayer() {
		player = new Player("Achilis", "KING", 75, 45, true, 72, Arrays.asList("arrow","sword"));
	}
	
	@Before
	public void setDataForEnemy() {
		enemy = new Enemy("Hector", "WARRIOR", 25, 27, true, 88,Arrays.asList("axe","sword"));
	}
	
	@Test
	public void checkPlayerCharacter() {
		factory =  CharacterFactory.getInstance();
		character = factory.getCharacter("player");	
		Assert.assertEquals(player, character);
	}
	
	@Test
	public void checkEnemyCharacter() {
		factory =  CharacterFactory.getInstance();
		character = factory.getCharacter("enemy");	
		Assert.assertEquals(enemy, character);
	}
	
	@Test
	public void checkPlayerCharacterWithArguments() {
		factory = CharacterFactory.getInstance();
		character = factory.getCharacter("player","Achilis", "KING", 75, 45, true, 72, Arrays.asList("arrow","sword"));	
		Assert.assertEquals(player, character);
	}
	
	@Test
	public void checkPlayerCharacterWithArgPosChange() {
		factory =  CharacterFactory.getInstance();
		character = factory.getCharacter("player","KING", "Achilis", 75, 45, true, 72, Arrays.asList("arrow","sword"));	
		Assert.assertNotEquals(player, character);
	}
	
	@Test
	public void checkEnemyWithArguments() {
		factory =  CharacterFactory.getInstance();
		character = factory.getCharacter("enemy","Hector", "WARRIOR", 25, 27, true, 88, Arrays.asList("axe","sword"));		
		Assert.assertEquals(enemy, character);
	}
	
	@Test
	public void checkEnemyCharacterWithArgPosChange() {
		factory = CharacterFactory.getInstance();
		character = factory.getCharacter("enemy","WARRIOR", "Hector", 25, 27, true, 88, Arrays.asList("axe","sword"));	
		Assert.assertNotEquals(enemy, character);
	}
	
}
