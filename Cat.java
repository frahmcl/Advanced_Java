package com.company;
/**
 * Created by mgreen14 on 12/27/17.
 */
public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    /**
     *
     * @param mousesKilled the number of mice killed
     * @param name the name of the cat killing the mice
     */
    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     *
     * @return the amount of mice killed
     */
    public int getMousesKilled() {
        return mousesKilled;
    }

    /**
     * add a new mouse to the heap of mice killed
     */
    public void addMouse() {
        mousesKilled++;
    }

    /**
     * Override interface talk
     * @return noise cat makes, <b>"Meow"</b>
     */
    @Override
    public String talk() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}
