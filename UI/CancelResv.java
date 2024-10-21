package UI;

import java.util.Scanner;

public class CancelResv {
	public static void cancelResvUI() {
		Scanner sc = new Scanner(System.in);

		System.out.println("날짜: ");
		System.out.println("인원수: ");
		System.out.println("예약 시간: ");
		System.out.println("예약한 메뉴: ");
		System.out.println("");
		System.out.print("정말로 취소하시겠습니까? (y/n)>");

		while (true) {
			String selectNum = sc.next();

			if(selectNum.equalsIgnoreCase("y")) {
				System.out.println("예약이 성공적으로 취소되었습니다.");
				Main.main(null);
			}
		 
			else if(selectNum.equalsIgnoreCase("n")) {
				Main.main(null);
			}

			else {
				System.out.print("잘못된 입력입니다. 다시 입력해주세요.>");
			}
		}
	}
}
