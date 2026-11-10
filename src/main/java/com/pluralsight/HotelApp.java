package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {

        // Creating a room

        Room roomOne = new Room(2,150.00);

        System.out.println("BOOKING INFO");

        System.out.println("Beds: " + roomOne.getNumberOfBeds());
        System.out.println("Price: $" + roomOne.getPrice());
        System.out.println("Available: " + roomOne.isAvailable());

        //Check guest into room
        roomOne.checkIn();

        System.out.println("\nAfter Check In");
        System.out.println("Occupied: " + roomOne.isOccupied());
        System.out.println("Dirty: " + roomOne.isDirty());
        System.out.println("Available: " + roomOne.isAvailable());

        // check guest out of room
        roomOne.checkOut();

        System.out.println("\nAfter Check Out");
        System.out.println("Occupied: " + roomOne.isOccupied());
        System.out.println("Dirty: " + roomOne.isDirty());
        System.out.println("Available: " + roomOne.isAvailable());

        // create a reservation
        Reservation reservationOne = new Reservation("king", 3, true);
        System.out.println("\nReservation Information");
        System.out.println("Room Type: " + reservationOne.getRoomType());

        System.out.println("Nights: " + reservationOne.getNumberOfNights());

        System.out.println("Weekend: " + reservationOne.isWeekend());
        System.out.println("Nightly Rate: $" + reservationOne.getPrice());
        System.out.println("Reservation Total: $" + reservationOne.getReservationTotal());


    }



}
