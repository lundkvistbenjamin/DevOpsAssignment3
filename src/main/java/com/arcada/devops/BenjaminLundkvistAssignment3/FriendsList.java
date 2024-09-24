package com.arcada.devops.BenjaminLundkvistAssignment3;

public class FriendsList {

    public static String[] getFriends(String name) {
        // Friends Lists
        String[] names = {"Selma", "Hilma", "Homer", "Bart", "Marge"};
        String[][] friends = {
            {"Patty", "Moe", "Apu", "Troy", "Lionel", "Comic"}, // Selma's friends
            {"Krusty", "Bob", "Lenny", "Carl", "Rainier", "Kent"}, // Hilma's friends
            {"Marge", "Barney", "Lenny", "Carl", "Moe", "Ned", "Abe", "Waylon"}, // Homer's friends
            {"Milhouse", "Nelson", "Ralph", "Jimbo", "Kearney", "Dolph", "Martin", "Shauna", "Jessica"}, // Bart's friends
            {"Homer", "Patty", "Selma", "Apu", "Maude", "Jacqueline", "Helen", "Luann", "Edna", "Ruth", "Ned", "Reverend", "Judge", "Cookie", "Agnes"} // Marge's friends
        };

        // Loop through names and see if there is a match
        for (int i = 0; i < names.length; i++) {
            if (name.equalsIgnoreCase(names[i])) {
                return friends[i];
            }
        }

        // If there is no match return an empty array
        return new String[0];
    }
}
