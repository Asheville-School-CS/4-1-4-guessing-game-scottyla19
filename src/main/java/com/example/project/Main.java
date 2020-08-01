package com.example.project;

import java.util.Scanner;

public class Main
{


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // Choose a random number from 0-100

        int rand = (int)(Math.random() * 100) + 1;
        System.out.println("Guess an integer between 1-100.");
        int guess = scan.nextInt();

        while (guess != rand){
            if (guess < rand){
                System.out.println("Too low!");
                System.out.println("Guess an integer between 1-100.");
                guess = scan.nextInt();
            }else if (guess > rand){
                System.out.println("Too high!");
                System.out.println("Guess an integer between 1-100.");
                guess = scan.nextInt();
            }else {
                System.out.println("You got it!");
            }
        }
        System.out.println("You got it!");

        // Ask the user to guess a number from 0 to 100
        // Get the first guess using scan.nextInt();


        // Loop while the guess does not equal the random number,

        // If the guess is less than the random number, print out "Too low!"

        // If the guess is greater than the random number, print out "Too high!"

        // Get a new guess (save it into the same variable)


        // Print out something like "You got it!"


    }

}