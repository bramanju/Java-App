package com.habitat.habitation.impl;

import com.habitat.animal.interfaces.*;
import com.habitat.habitation.interfaces.IAbstractHabitat;

public class Mountains<T extends IMountainHabitable> extends IAbstractHabitat{

	public void addAnimalsinMountains(T t){
		addAnimal(t);		
	}
	
	public void removeAnimalsFromMountains(T t){
		removeAnimal(t);
	}

}
