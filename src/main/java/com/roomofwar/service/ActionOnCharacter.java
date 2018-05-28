package com.roomofwar.service;

/**{@code ActionOnCharacter} subclass should includes functionality 
 *  related to Character actions.
 * 
 * @author Vaibhav53
 *
 */
public interface ActionOnCharacter {
	
	public void fight(Character player, Character enemy, int weaponNo);
	public int calculatePoints(Character character);
	public String showdetailsOfCharacter();
	public void increaseExperienceLevel(Character player, Character enemy, int playerPoint, int enemyPoint);
}
