package UI;

import java.util.Scanner;

public class RestaurantResv {
	
	public static void reservationUI() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 한식");
		System.out.println("2. 중식");
		System.out.println("3. 일식");
		System.out.println("4. 양식");
		System.out.println("5. 뒤로 가기");
		System.out.println("");
		System.out.print("번호를 입력해주세요.> ");
		
		while(true) {
			int selectNum = sc.nextInt();
		
			//카테고리:한식
			if(selectNum == 1) {
				System.out.println("한식음식점 리스트 출력");
				System.out.println("");
				System.out.print("예약하실 식당 번호를 입력해주세요.> ");
				int resFoodNum = sc.nextInt();
				System.out.print("인원 수를 입력하세요.>");
				int resPeople = sc.nextInt();
				System.out.print("예약할 시간을 입력하세요.>");
				int time = sc.nextInt();
				System.out.print("예약할 음식을 입력하세요.>");
				int food = sc.nextInt();
				System.out.println("예약이 완료되었습니다.");
				Main.main(null);
			}
		
			//카테고리:중식
			else if(selectNum == 2) {
				System.out.println("중식음식점 리스트 출력");
				System.out.println("");
				System.out.print("예약하실 식당 번호를 입력해주세요.> ");
				int resFoodNum = sc.nextInt();
				System.out.print("인원 수를 입력하세요.>");
				int resPeople = sc.nextInt();
				System.out.print("예약할 시간을 입력하세요.>");
				int time = sc.nextInt();
				System.out.print("예약할 음식을 입력하세요.>");
				int food = sc.nextInt();
				System.out.println("예약이 완료되었습니다.");
				Main.main(null);
			}
		
			//카테고리:일식
			else if(selectNum == 3) {
				System.out.println("일식음식점 리스트 출력");
				System.out.println("");
				System.out.print("예약하실 식당 번호를 입력해주세요.> ");
				int resFoodNum = sc.nextInt();
				System.out.print("인원 수를 입력하세요.>");
				int resPeople = sc.nextInt();
				System.out.print("예약할 시간을 입력하세요.>");
				int time = sc.nextInt();
				System.out.print("예약할 음식을 입력하세요.>");
				int food = sc.nextInt();
				System.out.println("예약이 완료되었습니다.");
				Main.main(null);
			}
		
			//카테고리:양식
			else if(selectNum == 4) {
				System.out.println("양식음식점 리스트 출력");
				System.out.println("");
				System.out.print("예약하실 식당 번호를 입력해주세요.> ");
				int resFoodNum = sc.nextInt();
				System.out.print("인원 수를 입력하세요.>");
				int resPeople = sc.nextInt();
				System.out.print("예약할 시간을 입력하세요.>");
				int time = sc.nextInt();
				System.out.print("예약할 음식을 입력하세요.>");
				int food = sc.nextInt();
				System.out.println("예약이 완료되었습니다.");
				Main.main(null);
			}
		
			//메인 화면으로 돌아간다.
			else if(selectNum == 5) {
				Main.main(null);
			}
		
			else {
				System.out.print("잘못된 입력입니다. 다시 입력해주세요.>");
			}
		}
	}
}
