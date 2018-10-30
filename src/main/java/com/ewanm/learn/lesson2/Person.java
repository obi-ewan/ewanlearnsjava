package com.ewanm.learn.lesson2;

import com.ewanm.learn.lesson3.PersonName;

public class Person {

    public Person( String firstName, String lastName) {
        personName.setFullName(firstName, lastName);


    }

    private PersonName personName = new PersonName();

    public String getName() { return  personName.getFullName(); }

}
