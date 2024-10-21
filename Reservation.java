package com.pcwk.ehr.restaurant;

import java.util.Objects;

public class Reservation {
	
	private Restaurant restaurant; // 예약 레스토랑
	private String date; // 예약 날짜
	private String time; // 예약 시간
	private int numberOfPeople; // 예약 인원수
	
	public Reservation() {
		super();
	}
	
	public Reservation(Restaurant restaurant, String date, String time, int numberOfPeople) {
		super();
		this.restaurant = restaurant;
		this.date = date;
		this.time = time;
		this.numberOfPeople = numberOfPeople;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	@Override
	public String toString() {
		return "Reservation [restaurant=" + restaurant + ", date=" + date + ", time=" + time + ", numberOfPeople="
				+ numberOfPeople + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(date, numberOfPeople, restaurant, time);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		return Objects.equals(date, other.date) && numberOfPeople == other.numberOfPeople
				&& Objects.equals(restaurant, other.restaurant) && Objects.equals(time, other.time);
	}

	
}
