package data;

import java.util.Objects;

import com.pcwk.ehr.cmn.DTO;

public class RestaurantVO extends DTO {

	private String memberId; // 아이디
	private String restaurantName; // 레스토랑 이름
	private String date; // 예약 날짜
	private String time; // 예약 시간
	private int numberOfPeople; // 예약 인원수
	private int deposit; // 예약금


	public RestaurantVO() {
		super();
	}


	public RestaurantVO(String memberId, String restaurantName, String date, String time, int numberOfPeople,
			int deposit) {
		super();
		this.memberId = memberId;
		this.restaurantName = restaurantName;
		this.date = date;
		this.time = time;
		this.numberOfPeople = numberOfPeople;
		this.deposit = deposit;
	}


	public String getMemberId() {
		return memberId;
	}


	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}


	public String getRestaurantName() {
		return restaurantName;
	}


	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
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


	public int getDeposit() {
		return deposit;
	}


	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}


	@Override
	public int hashCode() {
		return Objects.hash(memberId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RestaurantVO other = (RestaurantVO) obj;
		return Objects.equals(memberId, other.memberId);
	}


	@Override
	public String toString() {
		
		return "RestaurantVO [memberId=" + memberId + ", restaurantName=" + restaurantName + ", date=" + date
				+ ", time=" + time + ", numberOfPeople=" + numberOfPeople + ", deposit=" + deposit + "]";
	}


	
	

}