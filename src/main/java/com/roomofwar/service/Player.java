package com.roomofwar.service;

import java.io.Serializable;
import java.util.List;

/** Subclass of {@code Character} included functionality 
 * for details of character.
 *  
 * @author Vaibhav53
 *
 */
public class Player extends Character implements Serializable{
	
	
	private static final long serialVersionUID = 8277447931690881566L;
	
	private String name  ;
	private String role ;
	private Integer health ;
	private Integer experience;
	private Integer rating;
	private List<String> weapons; 
	private boolean isPoisonous ;

	

	/** Constructs object for Player 
	 * 
	 * @param name
	 * @param role
	 * @param health
	 * @param experience
	 * @param isPoisonous
	 * @param rating
	 * @param weapons
	 */
	public Player(String name, String role, Integer health, Integer experience, boolean isPoisonous, Integer rating,
			List<String> weapons) {
		super(name, role, health, experience, isPoisonous, rating, weapons);
		this.name = name;
		this.role = role;
		this.health = health;
		this.experience = experience;
		this.isPoisonous = isPoisonous;
		this.rating = rating;
		this.weapons = weapons;
	}
	

	/* return the player object information
	 * @see com.auto1.service.Character#showdetailsOfCharacter()
	 */
	@Override
	public String showdetailsOfCharacter() {
		return toString();
		
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", role=" + role + ", health=" + health + ", experience=" + experience
				+ ", rating=" + rating + ", weapons=" + weapons + ", isPoisonous=" + isPoisonous + "]";
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

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public Integer getHealth() {
		return health;
	}


	public void setHealth(Integer health) {
		this.health = health;
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((experience == null) ? 0 : experience.hashCode());
		result = prime * result + ((health == null) ? 0 : health.hashCode());
		result = prime * result + (isPoisonous ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((weapons == null) ? 0 : weapons.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (experience == null) {
			if (other.experience != null)
				return false;
		} else if (!experience.equals(other.experience))
			return false;
		if (health == null) {
			if (other.health != null)
				return false;
		} else if (!health.equals(other.health))
			return false;
		if (isPoisonous != other.isPoisonous)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (weapons == null) {
			if (other.weapons != null)
				return false;
		} else if (!weapons.equals(other.weapons))
			return false;
		return true;
	}
	
	


}
