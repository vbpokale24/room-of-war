package com.roomofwar.service;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

import com.roomofwar.constants.Constants;
import com.roomofwar.constants.Constants.Role;


/** This Abstract class {@code Character} includes method which perform operation 
 *   related to character's actions.
 *  
 * 
 * @author Vaibhav53
 *
 */
/**
 * @author Vaibhav53
 *
 */
/**
 * @author Vaibhav53
 *
 */
public abstract class Character extends Human implements ActionOnCharacter, Serializable {

	
	private static final long serialVersionUID = 5488741433021303319L;
	
	private Integer experience;
	private boolean isPoisonous;
	private Integer rating;
	private List<String> weapons;

	
	/** Construct new  {@code Character} object 
	 *  
	 * 
	 * @param name    name of character
	 * @param role    role of character
	 * @param health  health of character
	 * @param experience  experience of character
	 * @param isPoisonous  boolean value 
	 * @param rating       rating of character
	 * @param weapons      list of weapon
	 */
	public Character(String name, String role, Integer health, Integer experience, boolean isPoisonous, Integer rating,
			List<String> weapons) {
		super(name, role, health);
		this.experience = experience;
		this.isPoisonous = isPoisonous;
		this.rating = rating;
		this.weapons = weapons;
	}
	

	/* See the implementation in sub classes
	 * @see com.auto1.service.ActionOnCharacter#showdetailsOfCharacter()
	 */
	@Override
	public abstract String showdetailsOfCharacter();

	
	/* Interface method implemented, having the functionality
	 *  related to the fight between two character.
	 * 
	 * @see com.auto1.service.ActionOnCharacter#fight(com.auto1.service.Character, com.auto1.service.Character, int)
	 */
	@Override
	public void fight(Character player, Character enemy, int playerWeaponNo) {
		Player playerr = null;
		Enemy enemyy = null;
		int playerPoint = 0;
		int enemyPoint = 0;
		if (player instanceof Player) {
			playerr = ((Player) player);
			playerPoint = calculatePoints(playerr);			
		}
		if (enemy instanceof Enemy) {
			enemyy = ((Enemy) enemy);
			enemyPoint = calculatePoints(enemyy);			
		}
		Integer playerWeaponPoint = weaponPoint(playerWeaponNo);
		Integer enemyWeaponPoint = weaponPoint(Constants.defualtEnemyWeapon);
		enemyPoint = enemyPoint - playerWeaponPoint;
		playerPoint = playerPoint - enemyWeaponPoint;
		increaseExperienceLevel(playerr, enemyy, playerPoint, enemyPoint);
	}
	

	/* Character experience will get increased after winning the fight
	 * 
	 * @see com.auto1.service.ActionOnCharacter#increaseExperienceLevel(com.auto1.service.Character, com.auto1.service.Character, int, int)
	 */
	@Override
	public void increaseExperienceLevel(Character player, Character enemy, int playerPoint, int enemyPoint) {
		Player playerr = null;
		Enemy enemyy = null;
		if (player instanceof Player) {
			playerr = ((Player) player);					
		}
		if (enemy instanceof Enemy) {
			enemyy = ((Enemy) enemy);
			
		}
		if (enemyPoint > playerPoint) {
			System.out.println("*** Enemy Won, Play Again ***");
			enemyy.setExperience(enemyy.getExperience()+Constants.addToExpEnemy);
		} else {
			System.out.println("*** Congratulations!! You WON. Check Your New Experience ***");
			playerr.setExperience(playerr.getExperience()+Constants.addToExpPlayer);			
		}
	}
	
	
	/* Calculate the point for character

	 * @see com.auto1.service.ActionOnCharacter#calculatePoints(com.auto1.service.Character)
	 */
	@Override
	public int calculatePoints(Character character) {
		int points = 0;
		if (character instanceof Player) {
			System.out.println();
			Player player = (Player) character;
			String role = player.getRole();
			points = rolePoints(role) + player.getHealth() * Constants.healthMulValue
					+ player.getExperience() * Constants.exprienceMulVvalue
					+ player.getRating() * Constants.ratingMulValue
					+ player.getWeapons().size() * Constants.weaponMulValue;
			player = null;
		} else {
			Enemy p = (Enemy) character;
			String role = p.getRole();
			points = rolePoints(role) + p.getHealth() * Constants.healthMulValue
					+ p.getExperience() * Constants.exprienceMulVvalue + p.getRating() * Constants.ratingMulValue
					+ p.getWeapons().size() * Constants.weaponMulValue;

		}
		return points;

	}

	/*
	 * Calculate the point against role
	 * 
	 * @param role roleName of charatcter
	 */
	private int rolePoints(String role) {		
		int rolePoint = 0;
		for (Role roll : Role.values()) {			
			if (roll.toString().equalsIgnoreCase(role)) {			
			rolePoint = roll.getvalue();
		}
		}		
		return rolePoint;
	}

	/*
	 * Calculate the weaponPoint  against weapon number
	 *  
	 */
	private Integer weaponPoint(int weaponNo) {
		Random random = new Random();
		return random.nextInt(weaponNo *Constants.randomMulFactor);		
	}
	

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public boolean isPoisonous() {
		return isPoisonous;
	}

	public void setPoisonous(boolean isPoisonous) {
		this.isPoisonous = isPoisonous;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public List<String> getWeapons() {
		return weapons;
	}

	public void setWeapons(List<String> weapons) {
		this.weapons = weapons;
	}
	
	

}
