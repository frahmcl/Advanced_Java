package com.company;


/**
 * @author L117student
 */
public class Student extends Person implements Talkable {
    private int age;

    /**
     *
     * @param age students age
     * @param name students name
     */
    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    /**
     *
     * @return return the student's age
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age age to set for student
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return return what the student says
     */
    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}