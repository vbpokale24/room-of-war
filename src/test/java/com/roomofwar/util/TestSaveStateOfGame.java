package com.roomofwar.util;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import com.roomofwar.customexception.DataNullException;
import com.roomofwar.service.Character;
import com.roomofwar.service.Enemy;
import com.roomofwar.service.Player;

public class TestSaveStateOfGame {

	private Player player;
	private Enemy enemy;
	private SaveStateOfGame saveStateOfGame;
	private java.util.Map<String, Character> characterMap;
	
	
	@Before
	public void setDataForPlayer() {
		player = new Player("Achilis", "KING", 12, 10, true, 100, Arrays.asList("arrow","bow"));
	}
	
	@Before
	public void setDataForEnemy() {
		enemy = new Enemy("Hector", "WARRIOR", 13, 10, true, 89, Arrays.asList("sword","axe"));
	}
	
	
	@Before
	public void setMapWithCharacter() {		
		characterMap = new HashMap<String, Character>();
		characterMap.put("player", new Player("Achilis", "KING", 12, 10, true, 100, Arrays.asList("arrow","bow")));
		characterMap.put("enemy", new Enemy("Hector", "WARRIOR", 13, 10, true, 89, Arrays.asList("sword","axe")));
	}
	

	@Test(expected = DataNullException.class)	
	public void testNullDataChecked() throws Exception {
		saveStateOfGame = new SaveStateOfGame();
		saveStateOfGame.saveState(null, "player", "Test1");		
	}
	
	@Test
	public void testIsStateSavedForPlayer() throws Exception {
		saveStateOfGame = new SaveStateOfGame();
		saveStateOfGame.saveState(player, "player", "Test1");		
	}
	
	@Test
	public void testIsStateSavedForEnemy() throws Exception {
		saveStateOfGame = new SaveStateOfGame();
		saveStateOfGame.saveState(enemy, "enemy", "Test1");		
	}
	
	@Test(expected =  Exception.class)
	public void testNullDataCheckedForMapChar() throws Exception {
		saveStateOfGame = new SaveStateOfGame();		
		saveStateOfGame.saveState(null, "Test1");		
	}
	@Test
	public void testDataCheckedForMapChar() throws Exception {
		saveStateOfGame = new SaveStateOfGame();		
		saveStateOfGame.saveState(characterMap, "Test1");		
	}
}
