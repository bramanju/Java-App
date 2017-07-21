package com.habitat.habitation.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.habitat.animal.interfaces.IAnimal;

public abstract class IAbstractHabitat<T extends IAnimal> {

	protected List<T> animals = Collections.synchronizedList(new ArrayList<T>());

	protected void addAnimal(T t) {
		animals.add(t);
	}

	protected void removeAnimal(T t) {
		animals.remove(t);
	}

	public int getAnimalsCount() {
		return animals.size();
	}

}
