package data;

import java.util.Scanner;

import com.pcwk.ehr.cmn.PLog;

public class Main implements PLog{

	RestaurantController controller;
	
	public Main() {
		controller = new RestaurantController();
		//System.out.println(menu());
		
		//메뉴 선택
		doActionMenu();
	}
	
	//메뉴 선택
	public void doActionMenu() {
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println(menu());
			System.out.print("Menu를 선택 하세요.>");
			String menu = scanner.nextLine().trim();
			
			switch (menu) {
			case "0": { // 식당 목록
				RestaurantResv.reservationUI();;
			}
			break;
			
			case "1": { //식당 예약
				int flag = controller.doSave();
				if(flag == 1) {
					System.out.println("예약이 완료되었습니다.");
				}
				else {
					System.out.println("예약이 정상적으로 처리되지 않았습니다. 다시 시도하세요.");
				}
			}
			
			break;
			
			case "2": { //예약 조회
				RestaurantVO outVO = controller.doSelectOne();
				if(outVO == null) {
					System.out.println("예약 조회가 정상적으로 처리되지 않았습니다.");
				}
				else {
					System.out.printf("예약 조회:%s\n",outVO);
					System.out.println("예약 조회가 완료되었습니다.");
				}
			}
			break;
			
			case "3": { //예약 수정
				int flag = controller.doUpdate();
				if(flag == 2) {
					System.out.println("예약이 정상적으로 수정되었습니다.");
				}
				else {
					System.out.println("예약 수정이 정상적으로 처리되지 않았습니다.");
				}
			}
			break;
			
			case "4": { //예약 삭제
				int flag = controller.doDelete();
				if(flag == 1) {
					System.out.println("예약이 정상적으로 취소되었습니다.");
				}
				else {
					System.out.println("예약 취소가 처리되지 않았습니다.");
				}
			}
			break;
			
			case "5": {
				
				int saveFlag = controller.writeFile();
				 if (saveFlag == 1) {
				        System.out.println("예약 정보가 파일에 성공적으로 저장되었습니다.");
				    } else {
				        System.out.println("예약 정보 정상적으로 저장되지 않았습니다.");
				    }
				//Todo : 저장기능 연결할것.
				System.out.println("┌──────────────────────────────┐");
				System.out.println("│       program exit           │");
				System.out.println("└──────────────────────────────┘");
				
				System.exit(0);
				
			}
			break;
			
			case "6": { //예약 조회(사장님)

				controller.doSelectAll();
				
			}
			break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + menu);
			}
		}
		}
	
	
	//메뉴
	public String menu() {
		StringBuilder sb = new StringBuilder(2000);
		sb.append(" +-+-+-+-+ +-+-+-+-+ +-+-+-+-+-+-+-+ \n");
		sb.append(" |M|i|n|i| |J|a|v|a| |P|r|o|j|e|c|t| \n");
		sb.append(" +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ \n");
		sb.append(" |2|0|2|4|.|1|0|.|2|3|               \n");
		sb.append(" +-+-+-+-+-+-+-+-+-+-+               \n");
		sb.append("  *** 식당 예약 프로그램 ***               \n");
		sb.append("  0. 식당&메뉴 리스트                     \n");
		sb.append("  1. 식당 예약                          \n");
		sb.append("  2. 예약 조회                          \n");
		sb.append("  3. 예약 수정                          \n");
		sb.append("  4. 예약 취소                          \n");
		sb.append("  5. 종료                              \n");
		sb.append("  6. 관리자 예약 확인                      \n");
		
		
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Main RestaurantMain = new Main();
		

	}

}
