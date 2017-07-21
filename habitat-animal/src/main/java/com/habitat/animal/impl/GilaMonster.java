package com.habitat.animal.impl;

import com.habitat.animal.interfaces.*;

public class GilaMonster implements IReptiles, IMountainHabitable{
	
	public GilaMonster(String name){
		nm = name;
	}

	@Override
	public void crawling() {
      System.out.println("crawling in desert sand");		
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
		return "running playfully";
	}
	
	private String nm;
	
	public String getName(){
		return nm;
	}
	
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof GilaMonster){
			GilaMonster c = (GilaMonster)obj;
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
