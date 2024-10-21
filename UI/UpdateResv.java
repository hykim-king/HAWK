package UI;

import java.util.Scanner;

public class UpdateResv {
	public static void updateResvUI() {
Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 날짜");
		System.out.println("2. 인원수");
		System.out.println("3. 시간");
		System.out.println("4. 메뉴");
		System.out.println("5. 뒤로 가기");
		System.out.println("");
		System.out.print("수정할 항목의 번호를 입력하세요.> ");
		
		while(true) {
			int selectNum = sc.nextInt();
		
			if(selectNum == 1) {
				System.out.println("수정할 날짜 화면 출력");
			}
		
			else if(selectNum == 2) {
				System.out.println("수정할 인원수 화면 출력");
			}
		
			else if(selectNum == 3) {
				System.out.println("수정할 시간 화면 출력");
			}
		
			else if(selectNum == 4) {
				System.out.println("수정할 메뉴 화면 출력");
			}
		
			else if(selectNum == 5) {
				Main.main(null);
			}
		
			else {
				System.out.print("잘못된 입력입니다. 다시 입력해주세요.>");
			}
		}
	}

}
