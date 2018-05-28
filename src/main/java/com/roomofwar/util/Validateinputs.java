package com.roomofwar.util;

import com.roomofwar.constants.Constants;

/**
 * {@code Validateinputs} includes method which validate the 
 *    user input
 * @author Vaibhav53
 *
 */
public class Validateinputs {

	/**	 * 
	 * @param choicenumber  integer number 
	 * @return              valid return true else false
	 */
	public boolean validateWeaponInput(int choicenumber) {
		if (choicenumber > 0 && choicenumber <= Constants.weaponCount) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * @param choicenumber
	 * @return  valid return true else false
	 */
	public boolean validateInput(int choicenumber) {
		if (choicenumber > 0 && choicenumber <= Constants.maxValue) {
			return true;
		} else {
			return false;
		}
	}
	
}
