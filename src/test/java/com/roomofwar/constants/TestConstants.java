package com.roomofwar.constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestConstants {
	
	private Map<Integer, Integer> map ;
	List<String> characterList;
	
	@Before 
	public void setCharacterList() {
		 characterList = new ArrayList<String>();
    	 characterList.add("player");
    	 characterList.add("enemy");    	
	}
	
	@Test
	public void testCharacterTypeWithSize() {
		Assert.assertTrue((characterList.size()==Constants.charcterType().size()));
	}
	
	@Test
	public void testCharacterTypeWithValue() {
		Assert.assertEquals(characterList, Constants.charcterType());
	}
}
