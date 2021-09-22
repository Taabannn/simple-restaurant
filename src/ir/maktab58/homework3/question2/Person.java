package ir.maktab58.homework3.question2;

import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private int identityNum;
    private Date birthDate;

    public Person(String firstName, String lastName, int identityNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityNum = identityNum;
    }

    public void printIsAPersonMessage(){
        System.out.println(firstName + " " + lastName + " is a person.");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(int identityNum) {
        this.identityNum = identityNum;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
