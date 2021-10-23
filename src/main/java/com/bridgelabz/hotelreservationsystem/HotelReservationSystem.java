package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;

public class HotelReservationSystem {

	public static void main(String[] args) {
		System.out.println("..Welcome to Hotel Reservation System..");
	}

	public ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	public void addHotelDetails() {

		hotelList.add(new Hotel("Lakewood", 110, 90, 100, 120, 2));
		hotelList.add(new Hotel("Bridgewood", 110, 60, 120, 250, 3));
		hotelList.add(new Hotel("Ridgewood", 110, 150, 450, 300, 4));
	}
}
