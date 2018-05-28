package com.roomofwar.main;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.roomofwar.main.SaveCharacterData;
import com.roomofwar.service.Enemy;
import com.roomofwar.service.Player;

public class TestSaveCharacterData {

	private SaveCharacterData saveCharacterData;
	private Scanner sc;
	private Player player;
	private Enemy enemy;
	@Before 
	public void setObject() {
		 sc= new Scanner("y");
		saveCharacterData =SaveCharacterData.getInstance();
		player = new Player("Achilis", "KING", 75, 45, true, 72, Arrays.asList("arrow","sword"));
		enemy = new Enemy("Hector", "WARRIOR", 25, 27, true, 88, Arrays.asList("axe","sword"));
	}
	
	@Test
	public void testSaveData() {
		saveCharacterData.saveData(sc, player, enemy, "Test1");
	}
	
	@Test
	public void testSaveDataWithNull() {
		saveCharacterData.saveData(sc, null, null, "Test1");
	}
}
