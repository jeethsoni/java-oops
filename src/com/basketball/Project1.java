package com.basketball;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * The entry point for basketball project application
 * This program reads players name, age, height from the console.
 * It calculates the average age of all players and determines the tallest players among those whose age is less than average age.
 */
public class Project1 {

    /**
     * Main method to run the Basketball Project application.
     * The program continuously prompts the user to enter a player's name, age, and height (in feet and inches) until an empty line is entered.
     * It then calculates the average age and identifies the tallest player (in inches) among those whose age is less than or equal to the average.
     * Finally, it prints the average age and the details of the tallest eligible player.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String [] args){

        // Scanner Class
        Scanner scanner = new Scanner(System.in);

        double totalAge = 0;
        int playerCount;
        ArrayList<Player> playerList = new ArrayList<>();
        double avgAge;
        int maximum = 0;
        String tallestPlayer = " ";


        // Stores player in arraylist and computes average age of all players
        while(true){
            System.out.print("Enter player's name, age, and height in feet and inches: ");
            String input = scanner.nextLine();

            // exit the loop if there is no input
            if(input.isEmpty()) {
                break;
            }

            // Store user's input in list and parse it
            String[] values = input.split(" ");
            String name = values[0];
            int age = Integer.parseInt(values[1]);
            int feet = Integer.parseInt(values[2]);
            int inches = Integer.parseInt(values[3]);

            // Initialize Player object and add it to arraylist
            Player player = new Player(name, age, feet, inches);
            playerList.add(player);

            // add all players age
            totalAge += player.getAge();

        }
            // calculate average age of all the players
            playerCount = playerList.size();
            avgAge = totalAge / playerCount;

        // print message if no input entered
        if (playerList.isEmpty()){
            System.out.println("No data entered");
            return;
        }

        // Find the tallest players who age is less than average age
        for (Player value : playerList) {
            if (value.getAge() <= avgAge && maximum <= value.getHeight().toInches()){
                maximum = value.getHeight().toInches();
                tallestPlayer = value.toString();

            }

        }
        // print the tallest player and average age
        System.out.printf("Average age of all the players is %.2f%n", avgAge);
        System.out.println("The tallest basketball player is: ");
        System.out.println(tallestPlayer);



    }


}