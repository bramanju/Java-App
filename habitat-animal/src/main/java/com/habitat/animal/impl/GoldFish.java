package com.habitat.animal.impl;

import com.habitat.animal.interfaces.IPisces;

public class GoldFish implements IPisces{
	
	public GoldFish(String name){
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
		return "playfully swimming";
	}

	@Override
	public void swimming() {
		System.out.println("swimming elegantly");		
	}
	
	private String nm;
	
	public String getName(){
		return nm;
	}
	
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof GoldFish){
			GoldFish c = (GoldFish)obj;
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
