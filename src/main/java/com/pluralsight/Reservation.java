package com.pluralsight;

public class Reservation {

    // what does a reservation know?
    // room type, number of nights, weekends

    // variables of reservation
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    // created a constructor
    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    // reservation total
    public Double getReservationTotal() {
        double pricePerNight = 0.0;

        // IF the room type is a king bed
        if(this.roomType.equalsIgnoreCase("king")) {
            // if its a weekend, it will cost more; otherwise standard weekday price
            pricePerNight = this.weekend ? 150.0 : 139.0;

        } else {
            // lets assume any other room type e.g "queen" has these rates
            pricePerNight = this.weekend ? 125.0 : 115.0;
        }
        return pricePerNight * numberOfNights;
    }

}
