package com.habitat.animal.impl;

import com.habitat.animal.interfaces.IMammalia;

public class Cat implements IMammalia {	

	public Cat(String name){
		this.nm = name;
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
		return "licking and cuddling";
	}

	@Override
	public void walks() {
		System.out.println("walking gently");		
	}
	
	private String nm;
	
	public String getName(){
		return nm;
	}
	
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Cat){
			Cat c = (Cat)obj;
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
