package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {

        // testing the room class

        Room roomOne = new Room(2, 150);

        System.out.println(roomOne.getPrice());
        System.out.println(roomOne.isAvailable());

    }



}
