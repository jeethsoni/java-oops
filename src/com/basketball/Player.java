package com.basketball;

/**
 * Represents a basketball player with a name, age, and height.
 * This class is immutable and final, ensuring that a player's properties cannot be altered once created.
 * It uses composition by including an object to represent the player's height.
 */
public final class Player {
    private final String name;
    private final Height height;
    private final int age;

    /**
     * Constructs a new object with the specified name, age, and height.
     * The height is represented by the class, which takes feet and inches as parameters.
     *
     * @param name   the player's name
     * @param age    the player's age
     * @param feet   the height in feet
     * @param inches the additional height in inches
     */
    public Player(String name, int age, int feet, int inches) {
        this.name = name;
        height = new Height(feet, inches);
        this.age = age;
    }

    /**
     * Returns the name of the player.
     *
     * @return the player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the height of the player.
     *
     * @return a object representing the player's height
     */
    public Height getHeight() {
        return height;
    }

    /**
     * Returns the age of the player.
     *
     * @return the player's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns a string representation of the player.
     * The string includes the player's name, age, and height.
     *
     * @return a formatted string with the player's details
     */
    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age + " " + height;
    }
}
