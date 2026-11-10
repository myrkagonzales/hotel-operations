package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {

        // testing the room class

        Room roomOne = new Room(2, 150, false, false);

        System.out.println(roomOne.getNumberOfBeds());
        System.out.println(roomOne.getPrice());
        System.out.println(roomOne.isDirty());
        System.out.println(roomOne.isAvailable());


    }



}
