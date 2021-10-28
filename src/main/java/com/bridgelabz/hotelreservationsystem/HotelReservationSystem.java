package com.bridgelabz.hotelreservationsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class HotelReservationSystem {

	public static void main(String[] args) throws ParseException {
		System.out.println("..Welcome to Hotel Reservation System..");
		findCheapHotel();

		HotelReservationSystem Lakewood = new HotelReservationSystem();
		HotelReservationSystem Bridgewood = new HotelReservationSystem();
		HotelReservationSystem Ridgewood = new HotelReservationSystem();
		Lakewood.addWeekdayWeekendRate();
		Bridgewood.addWeekdayWeekendRate();
		Ridgewood.addWeekdayWeekendRate();

		String sDate1 = "10-09-2020";
		String sDate2 = "11-09-2020";
		Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
		Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate2);
		System.out.println(sDate1 + "\t" + date1);
		System.out.println(sDate2 + "\t" + date2);

		HotelReservationSystem hotel = new HotelReservationSystem();
		hotel.addRating();
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

	public void addWeekdayWeekendRate() {
		String hotel = null;
		if (hotel == "LakeWood") {
			int weekday_rate = 110;
			int weekend_rate = 90;
			System.out.println("Rate of Regular Customers of LakeWood Hotel for Weekday & WeekendDay is: "
					+ weekday_rate + weekend_rate + "respectively");
		}

		if (hotel == "BridgeWood") {
			int weekday_rate = 150;
			int weekend_rate = 50;
			System.out.println("Rate of Regular Customers of BridgeWood Hotel for Weekday & WeekendDay is: "
					+ weekday_rate + weekend_rate + "respectively");
		}

		if (hotel == "RidgeWood") {
			int weekday_rate = 220;
			int weekend_rate = 150;
			System.out.println("Rate of Regular Customers of RidgeWood Hotel for Weekday & WeekendDay is: "
					+ weekday_rate + weekend_rate + "respectively");
		}
	}

	public void cheapestWeekdayWeekendHotel() {
		String hotel = null;
		int sum_LakeWood = 0, sum_BridgeWood = 0, sum_RidgeWood = 0;
		if (hotel == "LakeWood") {
			int weekday_rate = 110;
			int weekend_rate = 90;
			sum_LakeWood = (sum_LakeWood + weekday_rate + weekend_rate);
			System.out.println("Total Weekday and Weekend rate of LakeWood Hotel:" + sum_LakeWood);
		}
		if (hotel == "BridgeWood") {
			int weekday_rate = 150;
			int weekend_rate = 50;
			sum_BridgeWood = (sum_BridgeWood + weekday_rate + weekend_rate);
			System.out.println("Total Weekday and Weekend rate of BridgeWood Hotel:" + sum_BridgeWood);
		}
		if (hotel == "RidgeWood") {
			int weekday_rate = 220;
			int weekend_rate = 150;
			sum_RidgeWood = (sum_RidgeWood + weekday_rate + weekend_rate);
			System.out.println("Total Weekday and Weekend rate of RidgeWood Hotel:" + sum_RidgeWood);
		}
		if (sum_LakeWood <= sum_BridgeWood && sum_LakeWood < sum_RidgeWood) {
			System.out.println("LakeWood and BridgeWood with total rates $200.");
		}
		if (sum_BridgeWood <= sum_LakeWood && sum_BridgeWood < sum_RidgeWood) {
			System.out.println("LakeWood and BridgeWood with total rates $200.");
		}
		if (sum_RidgeWood < sum_LakeWood && sum_RidgeWood < sum_BridgeWood) {
			System.out.println("RidgeWood with total rates $370.");
		}
	}

	public void addRating() {
		String hotel = null;
		if (hotel == "LakeWood") {
			System.out.println("LakeWood rating is 3.");
		}
		if (hotel == "BridgeWood") {
			System.out.println("BridgeWood rating is 4.");
		}
		if (hotel == "RidgeWood") {
			System.out.println("RidgeWood rating is 5.");
		}
	}
}