package com.habitat.habitation.impl;

import java.util.*;

import com.habitat.animal.impl.*;
import com.habitat.animal.interfaces.*;
import com.habitat.habitation.interfaces.IAbstractHabitat;

public class UrbanAreas extends IAbstractHabitat{
	
	public void addAnimalsInUrbanAreas(IAnimal animal)throws IllegalArgumentException{		
		if(animal instanceof IMammalia || animal instanceof GoldFish){
			addAnimal(animal);
			return;
		}		
		throw new IllegalArgumentException("Incompatible Object found");				
	}
	
	public void removeAnimalsFromUrbanAreas(IAnimal animal){
		removeAnimal(animal);
	}

}
