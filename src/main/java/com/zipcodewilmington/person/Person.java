package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person { // E
    private String name;
    private int age;
    private int distanceMoved;

    public Person() {
        this("", Integer.MAX_VALUE);
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String sing() {
        return "La la laaa!";
    }

    public String fIfIKnow() {
        return "¯\\_(ツ)_/¯";
    }

    public int getDistanceMoved() {
        return distanceMoved;
    }

    public void walk() {
        this.distanceMoved += 2;
    }

    public void run() {
        this.distanceMoved += 5;
    }

    public boolean didAMarathon() {
        return this.distanceMoved > 26;
    }

}
