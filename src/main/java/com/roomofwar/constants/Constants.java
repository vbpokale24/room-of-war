package com.roomofwar.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/** {@code Constants} having all the constants value for this project
 * @author Vaibhav53
 *
 */
public class Constants {

	/*
	 * Enum value for role with default value
	 */
	public enum Role {
		KING(25), WARRIOR(10), ARCHER(15);

		private int value;

		private Role(int value) {
			this.value = value;
		}
		public int getvalue() {              // Fetching the value from enum 
		      return value;
		   }
	}

	/*
	 * Multiplication factor value for calculating overall point
	 */
	public final static Integer healthMulValue = 5;
	public final static Integer exprienceMulVvalue = 20;
	public final static Integer weaponMulValue = 15;
	public final static Integer ratingMulValue = 7;
	public final static Integer poisonValue = 100;
	
	
	public final static String fileExtension = "char.ser";                         //file extension for storing file
	
	public final static Integer weaponCount = 5;									// max weapon number
	
	public final static Integer maxValue = 100;                                   // max value for character while assigning
	
	
	public final static Integer defualtValue = 60;
	public final static Integer defualtExpValue = 25;
	
	public final static Integer defualtEnemyWeapon = 2;
	
	public final static Integer addToExpEnemy = 2;
	public final static Integer addToExpPlayer = 5;
	
	public final static Integer defaultWeaponNo = 2; 
	/*
	 * Default value of enemy and Player character
	 */
	public final static String playerName = "Achilis";
	public final static String playerRoleName = "KING";
	public final static Integer playerHealth = 75;
	public final static Integer playerExperince = 45;
	public static boolean pisPoisonous = true;
	public final static Integer playerRating = 72;
	public final static List<String> playerWeaponList = Arrays.asList("arrow","sword");
	
	public final static String enemyName = "Hector";
	public final static String enemyRoleName = "WARRIOR";
	public final static Integer enemyHealth = 25;
	public final static Integer enemyExperince = 27;
	public final static boolean eisPoisonous = true;
	public final static Integer enemyRating = 88;
	public final static List<String> enemyWeaponList = Arrays.asList("axe","sword");

	//random multiplication factor 
	public final static Integer randomMulFactor = 20;
	
    /**Storing the type of character
     * 
     * @return  list of String of character Type
     */
    public final static List<String> charcterType(){
    	 List<String> characterList = new ArrayList<String>();
    	 characterList.add("player");
    	 characterList.add("enemy");    	 
    	 return Collections.unmodifiableList(characterList);
     }
}
