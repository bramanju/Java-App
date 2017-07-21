package com.habitat.animal.impl;

import com.habitat.animal.interfaces.IMammalia;

public class Dog implements IMammalia {
	
	public Dog(String name){
		nm = name;
	}

	@Override
	public boolean isEating() {
		return false;
	}

	@Override
	public boolean isAlive() {
		return true;
	}

	@Override
	public String plays() {
		return "cuddling and wagging tail";
	}

	@Override
	public void walks() {
		System.out.println("Dog is walking");		
	}
	private String nm;
	
	public String getName(){
		return nm;
	}
	
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Dog){
			Dog c = (Dog)obj;
			if(nm.equals(c.getName())){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return nm.hashCode();
	}

	@Override
	public String toString(){
		return nm;
	}


}
