package com.pluralsight;

public class Room {

    // created private variables
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    // Created constructor because each class requires one
    // when creating a room, what information must already exist?
    // left side: "this.... = the objects variable right side - constructors parameters
    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    // adding getters
    // We want the room to return a value when being asked
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    // derived getters; only a room is available if it is clean and not occupied
    public boolean isAvailable() {
        return !occupied && !dirty;
    }

    // created methods for checkIn
    public void checkIn() {
        occupied =  true;
        dirty = true;
    }
    // created method for checkOut
    public void checkOut() {
        occupied = false;
    }

    // created method for cleanRoom
    public void cleanRoom() {
        dirty = false;
    }
}
