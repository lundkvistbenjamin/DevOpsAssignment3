package com.arcada.devops.BenjaminLundkvistAssignment3;

public class FriendsList {

    public static String[] getFriends(String name) {
        // Friends Lists
        String[] selmaFriends = {"Patty", "Moe", "Apu", "Troy", "Lionel", "Comic"};
        String[] hilmaFriends = {"Krusty", "Bob", "Lenny", "Carl", "Rainier", "Kent"};
        String[] homerFriends = {"Marge", "Barney", "Lenny", "Carl", "Moe", "Ned", "Abe", "Waylon"};
        String[] bartFriends = {"Milhouse", "Nelson", "Ralph", "Jimbo", "Kearney", "Dolph", "Martin", "Shauna", "Jessica"};
        String[] margeFriends = {"Homer", "Patty", "Selma", "Apu", "Maude", "Jacqueline", "Helen", "Luann", "Edna", "Ruth", "Ned", "Reverend", "Judge", "Cookie", "Agnes"};

        // Check for name and return friends list
        if (name.equalsIgnoreCase("Selma")) {
            return selmaFriends;
        } else if (name.equalsIgnoreCase("Hilma")) {
            return hilmaFriends;
        } else if (name.equalsIgnoreCase("Homer")) {
            return homerFriends;
        } else if (name.equalsIgnoreCase("Bart")) {
            return bartFriends;
        } else if (name.equalsIgnoreCase("Marge")) {
            return margeFriends;
        } else {
            return new String[0]; // Empty array for invalid names
        }
    }
}
