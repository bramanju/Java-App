package com.habitat.animal.impl;

import com.habitat.animal.interfaces.IPisces;
import com.habitat.animal.interfaces.IReptiles;

public class Turtle implements IPisces, IReptiles {
	
	public Turtle(String name){
		nm = name;
	}

	@Override
	public boolean isEating() {
		return true;
	}

	@Override
	public boolean isAlive() {
		return true;
	}

	@Override
	public String plays() {
		return "pretending to be sleep";
	}

	@Override
	public void crawling() {
		System.out.println("crawling carefully");
		
	}

	@Override
	public void swimming() {
		System.out.println("swimming for joy");		
	}
	
	private String nm;
	
	public String getName(){
		return nm;
	}
	
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Turtle){
			Turtle c = (Turtle)obj;
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
