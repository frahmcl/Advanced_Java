package com.company;

/**
 * The best dog class in the world
 * @author <b>L117student</b>
 * @version 1.2
 *
 */
public class Dog extends Pet implements Talkable {
    private boolean friendly;

    /**
     *
     * @param friendly  true or false if the dog friendly
     * @param name what the dog's
     *            name is
     */
    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    /**
     *
     * @return if the dog is friendly or not
     */
    public boolean isFriendly() {
        return friendly;
    }

    /**
     * Override talkable
     * @return the noise a dog makes, "Bark"
     */
    @Override
    public String talk() {
        return "Bark";
    }

    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}