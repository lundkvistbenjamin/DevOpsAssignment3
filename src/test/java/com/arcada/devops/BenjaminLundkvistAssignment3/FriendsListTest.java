package com.arcada.devops.BenjaminLundkvistAssignment3;

import org.junit.Test;
import static org.junit.Assert.*;

public class FriendsListTest {
    
    /**
     * Positive test cases
     */
    
    @Test
    public void testGetFriendsSelma() {
        String[] selmaFriends = {"Patty", "Moe", "Apu", "Troy", "Lionel", "Comic"};
        assertArrayEquals(selmaFriends, FriendsList.getFriends("Selma"));
    }
    
    @Test
    public void testGetFriendsHilma() {
        String[] hilmaFriends = {"Krusty", "Bob", "Lenny", "Carl", "Rainier", "Kent"};
        assertArrayEquals(hilmaFriends, FriendsList.getFriends("Hilma"));
    }
    
    @Test
    public void testGetFriendsHomer() {
        String[] homerFriends = {"Marge", "Barney", "Lenny", "Carl", "Moe", "Ned", "Abe", "Waylon"};
        assertArrayEquals(homerFriends, FriendsList.getFriends("Homer"));
    }

    @Test
    public void testGetFriendsBart() {
        String[] bartFriends = {"Milhouse", "Nelson", "Ralph", "Jimbo", "Kearney", "Dolph", "Martin", "Shauna", "Jessica"};
        assertArrayEquals(bartFriends, FriendsList.getFriends("Bart"));
    }
    
    @Test
    public void testGetFriendsMarge() {
        String[] margeFriends = {"Homer", "Patty", "Selma", "Apu", "Maude", "Jacqueline", "Helen", "Luann", "Edna", "Ruth", "Ned", "Reverend", "Judge", "Cookie", "Agnes"};
        assertArrayEquals(margeFriends, FriendsList.getFriends("Marge"));
    }

    /**
     * Negative test cases
     */
    
    @Test
    public void testGetFriendsInvalidName() {
        String[] expectedFriends = {};
        assertArrayEquals(expectedFriends, FriendsList.getFriends("Krusty"));
    }

    @Test
    public void testGetFriendsEmptyString() {
        String[] expectedFriends = {};
        assertArrayEquals(expectedFriends, FriendsList.getFriends(""));
    }
    
    /**
     * Performance test cases
     */
    
    @Test
    public void testPerformanceGetFriendsSelma() {
        long startTime = System.nanoTime();
        String[] selmaFriends = {"Patty", "Moe", "Apu", "Troy", "Lionel", "Comic"};
        assertArrayEquals(selmaFriends, FriendsList.getFriends("Selma"));
        long endTime = System.nanoTime();
        System.out.println("Time taken to load Selma's friends: " + (endTime - startTime) + " nanoseconds");
    }
    
    @Test
    public void testPerformanceGetFriendsMarge() {
        long startTime = System.nanoTime();
        String[] margeFriends = {"Homer", "Patty", "Selma", "Apu", "Maude", "Jacqueline", "Helen", "Luann", "Edna", "Ruth", "Ned", "Reverend", "Judge", "Cookie", "Agnes"};
        assertArrayEquals(margeFriends, FriendsList.getFriends("Marge"));
        long endTime = System.nanoTime();
        System.out.println("Time taken to load Marge's friends: " + (endTime - startTime) + " nanoseconds");
    }
}
