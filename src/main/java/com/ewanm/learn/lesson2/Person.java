package com.ewanm.learn.lesson2;

import com.ewanm.learn.lesson3.PersonName;

class Person {
    private PersonName personName = new PersonName();

    public String getName() { return  personName.getFullName(); }

    public void setName(String firstName, String lastName) {
        personName.setFullName(firstName, lastName);
    }
}
