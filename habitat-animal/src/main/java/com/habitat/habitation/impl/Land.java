package com.habitat.habitation.impl;

import com.habitat.animal.interfaces.IMammalia;
import com.habitat.habitation.interfaces.IAbstractHabitat;


public class Land<T extends IMammalia> extends IAbstractHabitat{

	public void addAnimalsInLand(T t){
		animals.add(t);	
	}
	
	public void removeAnimalsFromLand(T t){
		animals.remove(t);	
	}
	
}
