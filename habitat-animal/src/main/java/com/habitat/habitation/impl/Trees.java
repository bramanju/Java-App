package com.habitat.habitation.impl;

import com.habitat.animal.interfaces.IAves;
import com.habitat.habitation.interfaces.IAbstractHabitat;

public class Trees<T extends IAves>  extends IAbstractHabitat{
	
	public void addAnimalsinMountains(T t){
		addAnimal(t);		
	}
	
	public void removeAnimalsFromMountains(T t){
		removeAnimal(t);
	}


}
