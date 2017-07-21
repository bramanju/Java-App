package com.habitat.animal.test;

import org.junit.Test;
import static org.junit.Assert.*;

import com.habitat.animal.impl.*;
import com.habitat.animal.interfaces.*;
import com.habitat.habitation.impl.*;
import com.habitat.habitation.interfaces.*;

public class TestDesertHabitat {
	
	Desert desert = null;
	Land land = null;
	Trees trees = null;
	FreshWater freshWater = null;
	Mountains mountains = null;
	UrbanAreas urbanAreas = null;
	
	protected void setUp() throws Exception {}
	protected void tearDown() throws Exception {}

	@Test
	public void testReptiles() {
		desert = new Desert();
		desert.addAnimalsinDesert(new GilaMonster("Monster1"));
		desert.addAnimalsinDesert(new Turtle("Turtle1"));		
		assertEquals(2,desert.getAnimalsCount());		
	}
	
	@Test
	public void testMammalia() {
		land = new Land();
		land.addAnimalsInLand(new Dog("Dog1"));
		land.addAnimalsInLand(new Cat("Cat1"));
		assertEquals(2,land.getAnimalsCount());		
	}

	@Test
	public void testAves() {
		trees = new Trees();
		trees.addAnimalsinMountains(new Eagle("Eagle1"));
		trees.addAnimalsinMountains(new Finch("Finch1"));		
		assertEquals(2,trees.getAnimalsCount());		
	}
	
	@Test
	public void testFreshWater() {
		freshWater = new FreshWater();
		freshWater.addAnimalsInFreshWater(new GoldFish("GoldFish1"));
		freshWater.addAnimalsInFreshWater(new Trout("Trout1"));
		assertEquals(2,freshWater.getAnimalsCount());		
	}
	
	@Test
	public void testMountainHabitable() {
		mountains = new Mountains();
		mountains.addAnimalsinMountains(new Eagle("MountainEagle"));
		mountains.addAnimalsinMountains(new GilaMonster("Mountain Lizard"));
		assertEquals(2,mountains.getAnimalsCount());		
	}
	
	@Test
    public void testUrbanAreasPositive() {
		urbanAreas = new UrbanAreas();
		urbanAreas.addAnimalsInUrbanAreas(new Cat("Cat1"));
		urbanAreas.addAnimalsInUrbanAreas(new Dog("Dog1"));
		assertEquals(2,urbanAreas.getAnimalsCount());		
    }

	
	@Test(expected = IllegalArgumentException.class)
    public void testNegativeUrbanAreasNegative() {
		urbanAreas = new UrbanAreas();
		urbanAreas.addAnimalsInUrbanAreas(new Cat("Cat1"));
		urbanAreas.addAnimalsInUrbanAreas(new Dog("Dog1"));
		urbanAreas.addAnimalsInUrbanAreas(new Trout("Sea Trout"));
		assertEquals(2,urbanAreas.getAnimalsCount());
    }

	
}
