package com.ewanm.learn.lesson3;

public class PersonName {

    private String firstName;
    private String getFirstName() { return this.firstName; }
    private void setFirstName(String firstName) { this.firstName = firstName; }

    private String lastName;
    private String getLastName() { return this.lastName; }
    private void setLastName(String lastName) { this.lastName = lastName; }

    private String fullName;
    public String getFullName() { return this.fullName; }
    public void setFullName(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);

        this.fullName = getFirstName() + " " + getLastName();
    }
}
