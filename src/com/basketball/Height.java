package com.basketball;

/**
 *  This class is immutable and final, ensuring that a Height's properties cannot be altered once created.
 * Represents a height measurement in feet and inches.
 */
public final class Height {
    private final int feet;
    private final int inches;

    /**
     * Constructs an object with the specified feet and inches.
     * If the provided inches value is greater than 12, the constructor normalizes the values by converting
     * the extra inches into additional feet.
     * @param feet   the number of feet
     * @param inches the number of inches; if greater than 12, it will be normalized
     */
    public Height(int feet, int inches) {
        if (inches > 12) {
            int totalInches = (12 * feet) + inches;
            feet = totalInches / 12;
            inches = totalInches % 12;
        }
        this.feet = feet;
        this.inches = inches;
    }

    /**
     * Converts the height measurement to inches.
     *
     * @return the total height in inches
     */
    public int toInches(){
        return (12 * feet) + inches;
    }

    /**
     * Returns a string representation of the height.
     *
     * @return a string in the format "Height: X'Y''", where X is the feet and Y is the inches
     */
    @Override
    public String toString() {
        return "Height: " + feet + "'" + inches + "''";
    }
}
