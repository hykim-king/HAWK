package com.pcwk.ehr.restaurant;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.List;

import com.pcwk.ehr.member.MemberVO;

public class ReservationSystem {
	
	private final String fileName = "res.csv";
	public static List<Menu> menus = new ArrayList<Menu>();
	

	public ReservationSystem() {
		super();
		
		
	}


	

	// 레스토랑 목록 출력: 사용자에게 레스토랑 목록을 보여주기 위한 메서드 작성
	public void displayRestaurants() { 
		
	}
	
	// 사용자가 레스토랑, 날짜, 시간, 인원수를 입력하여 예약을 추가하는 기능
	public void makeReservation(Restaurant restaurant, String date, String time, int numberOfPeople) {
		
	}
				
	// 예약 확인: 현재 예약된 목록을 출력
	public void displayReservations() {
		
	}
	
	// 예약 취소: 사용자가 특정 예약을 선택해 취소할 수 있는 기능
	public void cancelReservation(int reservationIndex) {
		
	}
		

	

}
