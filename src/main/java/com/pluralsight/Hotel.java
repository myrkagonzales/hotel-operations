package com.pluralsight;

public class Hotel {

    // variables
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;

        bookedSuites = 0;
        bookedBasicRooms = 0;
    }
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
        }
    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }
    }

