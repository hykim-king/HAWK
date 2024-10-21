package UI;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 식당 예약");
		System.out.println("2. 예약 조회");
		System.out.println("3. 예약 수정");
		System.out.println("4. 예약 취소");
		System.out.println("5. 종료");
		System.out.println("");
		System.out.print("번호를 입력해주세요.> ");
		
		while(true) {
			int selectNum = sc.nextInt();
		
			//식당 예약 화면
			if(selectNum == 1) {
				RestaurantResv.reservationUI();
			}
		
			//예약 확인 화면
			else if(selectNum == 2) {
				CheckResv.checkResvUI();
			}
		
			//예약 수정 화면
			else if(selectNum == 3) {
				UpdateResv.updateResvUI();
			}
		
			//예약 취소 화면
			else if(selectNum == 4) {
				CancelResv.cancelResvUI();
			}
		
			//프로그램 종료
			else if(selectNum == 5) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		
			else {
				System.out.print("잘못된 입력입니다. 다시 입력해주세요.>");
			}
		}
		
	}
}
