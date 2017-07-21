package com.habitat.habitation.impl;

import com.habitat.animal.interfaces.IPisces;
import com.habitat.habitation.interfaces.IAbstractHabitat;

public class FreshWater<T extends IPisces> extends IAbstractHabitat{
	
	
	public void addAnimalsInFreshWater(T t){
		addAnimal(t);
	}
	
	public void removeAnimalsFromFreshWater(T t){
		removeAnimal(t);
	}

}
