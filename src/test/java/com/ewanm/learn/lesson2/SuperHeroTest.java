package com.ewanm.learn.lesson2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ewanm.learn.extending.SuperHero;
import com.ewanm.learn.extending.SuperPower;

public class SuperHeroTest {

	@Test
	public void testSuperHero() {

		SuperHero stupidMan = new SuperHero( "Stupid", "Man", "Super Fast", "Kinda Dumb" );
		Person ewan = new Person( "Ewan", "Meldrum" );

		String stupidManName = stupidMan.getName();
		String superPower = stupidMan.getSuperPower();
		String superWeakness = stupidMan.getSuperWeakness();

		assertEquals("Stupid Man", stupidManName);
		assertEquals( "Super Fast", superPower );
		assertEquals( "Kinda Dumb", superWeakness );

	}
}
