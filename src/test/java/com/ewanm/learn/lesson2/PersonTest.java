package com.ewanm.learn.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
        Person ewan = new Person("Ewan", "Isdumb");

        String name = ewan.getName();

        assertEquals( "Ewan Isdumb", name );
    }
}


