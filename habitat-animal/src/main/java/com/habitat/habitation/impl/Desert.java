package com.habitat.habitation.impl;

import com.habitat.animal.interfaces.*;
import com.habitat.habitation.interfaces.IAbstractHabitat;

public class Desert<T extends IReptiles> extends IAbstractHabitat {
	
	public void addAnimalsinDesert(T t){
		addAnimal(t);		
	}
	
	public void removeAnimalsinDesert(T t){
		removeAnimal(t);
	}

}
