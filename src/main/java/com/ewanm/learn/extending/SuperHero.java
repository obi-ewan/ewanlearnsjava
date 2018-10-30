package com.ewanm.learn.extending;

import com.ewanm.learn.lesson2.Person;

public class SuperHero extends Person {

	public SuperHero ( String firstName, String lastName, String superPower, String superWeakness ) {
		super( firstName, lastName );
		this.superPower = new SuperPower( superPower );
		this.superWeakness = new SuperWeakness( superWeakness );
	}

	private SuperPower superPower;
	private SuperWeakness superWeakness;


	public String getSuperPower() {
		return superPower.getName();
	}

	public String getSuperWeakness() {
		return superWeakness.getName();
	}

}
