package com.bridgelabz.hotelreservationsystem;

public class Hotel {
	private String name;
	private int weekDayRate;
	private int weekendDayRate;
	private int rewardweekDayRate;
	private int rewardWeekendDayRate;
	private int rating;

	public Hotel(String name, int weekDayRate, int weekendDayRate, int rewardweekDayRate, int rewardWeekendDayRate, int rating) {
		this.name = name;
		this.weekDayRate = weekDayRate;
		this.weekendDayRate = weekendDayRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeekDayRate() {
		return weekDayRate;
	}

	public void setWeekDayRate(int weekDayRate) {
		this.weekDayRate = weekDayRate;
	}

	public int getWeekendDayRate() {
		return weekendDayRate;
	}

	public void setWeekendDayRate(int weekendDayRate) {
		this.weekendDayRate = weekendDayRate;
	}

	public int getRewardweekDayRate() {
		return rewardweekDayRate;
	}

	public void setRewardweekDayRate(int rewardweekDayRate) {
		this.rewardweekDayRate = rewardweekDayRate;
	}

	public int getRewardWeekendDayRate() {
		return rewardWeekendDayRate;
	}

	public void setRewardWeekendDayRate(int rewardWeekendDayRate) {
		this.rewardWeekendDayRate = rewardWeekendDayRate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
