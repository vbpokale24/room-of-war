package com.roomofwar.main;

import java.util.Scanner;

import com.roomofwar.service.Character;
import com.roomofwar.service.CharacterFactory;
import com.roomofwar.util.GetStateOfGame;

/**{@code Main} include main method.
 *   This method responsible for taking the custom input 
 *   on command line and validate the input * 
 * 
 * @author Vaibhav53
 *
 */
public class Main {

	/** Main Method. 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			String input = null;
			sc = new Scanner(System.in);
			System.out.println("****   Please Enter your name to start the game!  ****");
			String playerName = sc.next();
			com.roomofwar.service.Character player = null;
			Character enemy = null;		
			GetStateOfGame get = new GetStateOfGame();                                                     
			boolean isPresent = get.checkStatePresent(playerName);												//checking user state is present or not		
			if (isPresent) {
				System.out.println("**** You have saved your game previously! Press y to resume the game ****");
				String decision = sc.next();
				if (decision.equals("y")) {                                                                     //fill the object with data 
					player = get.getState(playerName, "player");
					enemy = get.getState(playerName, "enemy");
					System.out.println("We have restored your character. Either use the same or create a new by selecting option");
				}

			} else {
				System.out.println("***We didn't find any history, Please start a new game ***");
				System.out.println();
			}

			do {
				System.out.println("*** Press 1 :: Create a Default PLAYER ***");
				System.out.println("*** Press 2 :: Create a Custom PLAYER ***");
				System.out.println("*** Press 3 :: See the PLAYER Desciption ***");
				System.out.println("*** Press 4 :: Create a Default ENEMY ***");
				System.out.println("*** Press 5 :: Create a Custom ENEMY ***");
				System.out.println("*** Press 6 :: See your ENEMY Desciption ***");
				System.out.println("*** Press 7 :: To start the FIGHT ***");
				int no = 0;
				if (sc.hasNextInt()) {
					no = sc.nextInt();
					switch (no) {
					case 1:
						player = CharacterFactory.getInstance().getCharacter("player");                                 
						System.out.println("    **** PLAYER has been created successfully *** ");
						break;
					case 2:
						System.out.println("**Fill the below attributes to create Player**");                   
						player = CreateCustomCharacter.createcharacter(sc, "player");
						break;
					case 3:
						if (player == null) {
							System.out.println("Please create a player first");
						} else {
							System.out.println(playerName + "'s Player Details are::" + player.showdetailsOfCharacter());
						}
						break;
					case 4:
						enemy = CharacterFactory.getInstance().getCharacter("enemy");
						System.out.println("    **** ENEMY has been created successfully *** ");
						break;
					case 5:
						System.out.println("**Fill the below attributes to create Enemy**");
						enemy = CreateCustomCharacter.createcharacter(sc, "enemy");
						break;
					case 6:
						if (enemy == null) {
							System.out.println("Please create an Enemy first");
						} else {
							System.out.println(playerName + "'s  Enemy  Details are::" + enemy.showdetailsOfCharacter());
						}
						break;
					case 7:
						 CharacterFight.getInstance().startTheFight(sc, player, enemy);
					break;
					default:
						System.out.println("Please enter a valid choice");

					}
				} else {
					System.out.println("Please enter an integer number");
					sc.next();
				}

				System.out.println("Do you want to continue,Please press 'y'");
				input = sc.next();
				if (!input.equals("y")) {
					SaveCharacterData.getInstance().saveData(sc, player, enemy, playerName);
					System.out.println("Bye! See you soon");

				}

			} while (input.equals("y"));
		} catch (Exception e) {
			System.out.println("OPPS SOmething went wrong");
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

	
}
