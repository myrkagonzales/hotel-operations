package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {

        // Creating a room

        Room roomOne = new Room(2,150.00);

        System.out.println("BOOKING INFO");

        System.out.println("Beds: " + roomOne.getNumberOfBeds());
        System.out.println("Price: $" + roomOne.getPrice());
        System.out.println("Status: " + (roomOne.isAvailable() ? "Available" : "Not Available"));

        //Check guest into room
        roomOne.checkIn();

        System.out.println("\nAfter Check In");
        System.out.println("Occupancy: " + (roomOne.isOccupied() ? "Occupied" : "Vacant"));
        System.out.println("Condition: " + (roomOne.isDirty() ? "Needs Cleaning" : "Clean"));
        System.out.println("Availability: " + (roomOne.isAvailable() ? "Available" : "Not Available"));

        // check guest out of room
        roomOne.checkOut();

        System.out.println("\nAfter Check Out");
        System.out.println("Occupancy: " + (roomOne.isOccupied() ? "Occupied" : "Vacant"));
        System.out.println("Condition: " + (roomOne.isDirty() ? "Needs Cleaning" : "Clean"));
        System.out.println("Availability: " + (roomOne.isAvailable() ? "Available" : "Not Available"));

        // create a reservation
        Reservation reservationOne = new Reservation("King", 3, true);
        System.out.println("\nReservation Information");
        System.out.println("Room Type: " + reservationOne.getRoomType());
        System.out.println("Number of Nights: " + reservationOne.getNumberOfNights());
        System.out.println("Weekend Stay: " + (reservationOne.isWeekend() ? "Yes" : "No"));
        System.out.printf("Nightly Rate: $%.2f%n", reservationOne.getPrice());
        System.out.printf("Total Cost: $%.2f%n", reservationOne.getReservationTotal());


    }



}
