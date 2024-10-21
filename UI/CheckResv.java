package UI;

import java.util.Scanner;

public class CheckResv {
	public static void checkResvUI() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("날짜: ");
		System.out.println("인원수: ");
		System.out.println("예약 시간: ");
		System.out.println("예약한 메뉴: ");
		System.out.println();
		System.out.println("1. 뒤로 가기");
		System.out.println();
		System.out.print("번호를 입력해주세요.> ");
		
		while(true) {
			int selectNum = sc.nextInt();
		
			if(selectNum == 1) {
				Main.main(null);
			}
		
			else {
				System.out.print("잘못된 입력입니다. 다시 입력해주세요.>");
			}
		}
	}
}
