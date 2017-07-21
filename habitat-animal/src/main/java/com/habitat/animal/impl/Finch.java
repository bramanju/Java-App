package com.habitat.animal.impl;

import com.habitat.animal.interfaces.IAves;

public class Finch implements IAves {
	
	public Finch(String name){
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
		return "Finch is playing";
	}

	@Override
	public void fly() {
		System.out.println("Finch is Flying");		
	}
	
	private String nm;
	
	public String getName(){
		return nm;
	}
	
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Finch){
			Finch c = (Finch)obj;
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
