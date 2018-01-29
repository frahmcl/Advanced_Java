package com.company;
/**
 * Created by mgreen14 on 12/27/17.
 */
public abstract class Person {
    private String name;

    /**
     *
     * @param name give students name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     *
     * @return students name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name give the students name to be set
     */
    public void setName(String name) {
        this.name = name;
    }


}

