package com.arcada.devops.BenjaminLundkvistAssignment3;

import java.util.Arrays;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	// Print available names
            System.out.println("Available friends lists: Selma, Hilma, Homer, Bart, Marge");
            System.out.print("Please enter a name (or type 'q' to quit): ");

            // Ask user for name
            String userInput = scanner.nextLine();

            // Check if the user wants to quit
            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Goodbye!");
                break;
            }

            // Get the friends list
            String[] friendsList = FriendsList.getFriends(userInput);
            if (friendsList.length > 0) {
                System.out.println(Arrays.toString(friendsList) + "\n");
            } else {
                System.out.println("Enter a valid name.\n");
            }
        }

        scanner.close();
    }
}

