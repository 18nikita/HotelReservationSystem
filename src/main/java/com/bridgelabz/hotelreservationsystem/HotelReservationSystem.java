package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;

public class HotelReservationSystem {

	public static void main(String[] args) {
		System.out.println("..Welcome to Hotel Reservation System..");
		findCheapHotel();
	}

	public ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	public void addHotelDetails() {

		hotelList.add(new Hotel("Lakewood", 110, 90, 100, 80, 3));
		hotelList.add(new Hotel("Bridgewood", 160, 60, 120, 250, 4));
		hotelList.add(new Hotel("Ridgewood", 220, 150, 450, 300, 5));

	}

	public static void findCheapHotel() {

		int LakeWoodRate = 110;
		int BridgeWoodRate = 160;
		int Ridgewood = 220;

		int LakeWood_Rate = LakeWoodRate * 2;
		int BridgeWood_Rate = BridgeWoodRate * 2;
		int RidgeWood_Rate = Ridgewood * 2;

		if (LakeWood_Rate < BridgeWood_Rate && LakeWood_Rate < RidgeWood_Rate) {
			System.out.println("LakeWood");
			System.out.println(LakeWood_Rate);
		}
		if (BridgeWood_Rate < LakeWood_Rate && BridgeWood_Rate < RidgeWood_Rate) {
			System.out.println("BridgeWood");
			System.out.println(BridgeWood_Rate);
		}
		if (RidgeWood_Rate < BridgeWood_Rate && RidgeWood_Rate < LakeWood_Rate) {
			System.out.println("RidgeWood");
			System.out.println(RidgeWood_Rate);
		}
	}
}
