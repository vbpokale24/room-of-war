package com.roomofwar.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import com.roomofwar.constants.Constants;
import com.roomofwar.service.Character;

/**
 * {@code GetStateOfGame} responsible for checking the state is present or not
 *  and if its present return same.
 * @author Vaibhav53
 *
 */
public class GetStateOfGame {

	/**	 * 
	 * @param name  name of character
	 * @param type  Type of character
	 * @return      return {@code Character} object
	 */
	public com.roomofwar.service.Character getState(String name,String type) {
		com.roomofwar.service.Character character = null;
	      
	    	  String fileName = name+type;	    	  
	    	 if (isFilePresent(fileName)) {	
	    		 try( FileInputStream fileIn = new FileInputStream(fileName+Constants.fileExtension)){
	    		
		         ObjectInputStream in = new ObjectInputStream(fileIn);
		         character = (Character) in.readObject();
		         in.close();
		         fileIn.close();
			}	        
	    	
	       catch (IOException i) {
	         i.printStackTrace();	        
	      } catch (ClassNotFoundException c) {
	         System.out.println("character class not found");
	         c.printStackTrace();	         
	      }
	     
	     }
	    	 return character;
	}
	
	/**
	 * @param filename    filename to check in storage 
	 * @return            If file is present return true
	 */
	private boolean isFilePresent(String filename) {
		boolean isPresent = false;
		File file = new File(filename+Constants.fileExtension);
		if(file.exists()) {
			isPresent= true;
		}	
		return isPresent;
	}
	
	/**
	 * @param name  player name 
	 * @return      return true if data present against player in storage
	 */
	public boolean checkStatePresent(String name) {
		List<String> charcterList =Constants.charcterType();
		boolean isPresent = false;
		for(String characterType : charcterList) {
			File file = new File(name+characterType+Constants.fileExtension);
			if(file.exists()) {
				isPresent= true;
				break;
			}			
		}
		return isPresent;
	
	}
	
}
