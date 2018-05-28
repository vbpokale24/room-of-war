package com.roomofwar.service;

import java.io.Serializable;

/**Base class {@code Human} having all basic attribute 
 *   related to Human entity.
 * 
 * @author Vaibhav53
 *
 */
public abstract class Human implements Serializable {
	
	private static final long serialVersionUID = -5632531416974894318L;
	private String name;
	private String role;
	private Integer health;
	
	public Human(String name, String role, Integer health) {
		super();
		this.name = name;
		this.role = role;
		this.health = health;		
	}
		  
}
