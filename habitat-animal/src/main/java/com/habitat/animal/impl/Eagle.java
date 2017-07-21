package com.habitat.animal.impl;

import com.habitat.animal.interfaces.*;

public class Eagle implements IAves,IMountainHabitable {
	
	public Eagle(String name){
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
		return "Eagle playing friendly";
	}

	@Override
	public void fly() {
		System.out.println("Eagle is flying");
	}
	
	private String nm;
	
	public String getName(){
		return nm;
	}
	
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Eagle){
			Eagle c = (Eagle)obj;
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
