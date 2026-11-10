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


    public String getRoomType() {
        return roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }


    // reservation total
   public double getPrice() {
        double price;
        if(roomType.equalsIgnoreCase("king")) {
            price = 139;
        } else {
            price = 124;
        }
        if (weekend) {
            price = price * 1.10;
        }
        return price;
   }

   public double getReservationTotal() {
        return getPrice() * numberOfNights;
   }

}
