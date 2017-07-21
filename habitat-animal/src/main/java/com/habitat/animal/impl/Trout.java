package com.habitat.animal.impl;

import com.habitat.animal.interfaces.IPisces;

public class Trout implements IPisces {
	
	public Trout(String name){
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
		return "playfully biting";
	}

	@Override
	public void swimming() {
		System.out.println("swimming fastly and violently");		
	}
	
	private String nm;
	
	public String getName(){
		return nm;
	}
	
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Trout){
			Trout c = (Trout)obj;
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
