package data;

import java.util.List;
import java.util.Scanner;

import com.pcwk.ehr.cmn.PLog;

public class RestaurantController implements PLog {

	private RestaurantDAO dao;

	public RestaurantController() {
		dao = new RestaurantDAO();
	}

	public void doSelectAll() { // 관리자 예약 확인
		List<RestaurantVO> outList = dao.ress; // DAO의 리스트 접근
		// 전체 예약 정보를 출력
		if (outList.isEmpty()) {
			System.out.println("예약 조회 실패! (예약 데이터가 없습니다)");
		} else {
			for (RestaurantVO vo : outList) {
  			System.out.println(vo); // 예약 정보 출력
			}
		}
	}

	/**
	 * 회원 가입
	 * 
	 * @return 1(성공)/0(실패)
	 */
	public int doSave() { // 식당 예약
		int flag = 0;
		RestaurantVO param = new RestaurantVO(); // 조회:파라메터:memberID

		// 1. Scanner
		// 2. 등록사용자 정보
		// 3. dao.doSave(param);

		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("9 입력시 메인화면으로 이동합니다.");
		System.out.print("예약자 성함을 입력하세요.> ");
		String memberId = scanner.nextLine();
		if (memberId.equals("9")) {	        
	        return 0;
	    }

		System.out.print("레스토랑 이름을 입력하세요.> ");
		String restaurantName = scanner.nextLine();

		System.out.print("예약 날짜(예: 2024/10/25)를 입력하세요.>");
		String date = scanner.nextLine();

		System.out.print("예약 시간(예: 7시30분)을 입력하세요.> ");
		String time = scanner.nextLine();

		System.out.print("예약 인원수(예: 3)를 입력하세요.> ");
		int numberOfPeople = Integer.parseInt(scanner.nextLine());

		System.out.print("예약금(30,000원)을 입금하세요.> ");
		int deposit = Integer.parseInt(scanner.nextLine());

		// user01 고정, 나머지 입력 정보로 예약 객체 생성
		RestaurantVO reservation = new RestaurantVO(memberId, restaurantName, date, time, numberOfPeople, deposit);

		// DAO를 통해 저장
		return dao.doSave(reservation);
	}

	/**
	 * 회원 단건 조회
	 * 
	 * @return MemberVO
	 */
	public RestaurantVO doSelectOne() { // 예약 조회
		RestaurantVO outVO = null;
		RestaurantVO param = new RestaurantVO(); // 조회 파라메터:memberID

		// 1. Scanner
		// 2. 조회 사용자 ID 입력
		// 3. dao.doSave(param);

		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("9 입력시 메인화면으로 이동합니다.");
		System.out.print("예약자 성함을 입력하세요.>");
		String inputData = scanner.nextLine().trim();
		if (inputData.equals("9")) {	        
	        return null;
	    }
		// log.debug("1. inputData:{}",inputData);

		param.setMemberId(inputData);
		// log.debug("2. param:{}",param);

		outVO = dao.doSelectOne(param);
		// log.debug("3. outVO:{}",outVO);

		return outVO;
	}

	public int doUpdate() { // 예약 수정
		int flag = 0;
		RestaurantVO param = new RestaurantVO(); // 조회:파라메터:memberID

		// 1. Scanner
		// 2. 등록사용자 정보
		// 3. dao.doSave(param);

		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("9 입력시 메인화면으로 이동합니다.");
		System.out.print("예약자 성함을 입력하세요.> ");
		String memberId = scanner.nextLine();
		if (memberId.equals("9")) {	        
	        return 0;
	    }
		System.out.print("수정할 레스토랑 이름을 입력하세요.> ");
		String restaurantName = scanner.nextLine();

		System.out.print("수정할 예약 날짜(예: 2024/10/25)를 입력하세요.>");
		String date = scanner.nextLine();

		System.out.print("수정할 예약 시간(예: 7시30분)을 입력하세요.> ");
		String time = scanner.nextLine();

		System.out.print("수정할 예약 인원 수(예: 3)를 입력하세요.> ");
		int numberOfPeople = Integer.parseInt(scanner.nextLine());

		System.out.print("입금하신 예약금 금액을 입력하세요.> ");
		int deposit = Integer.parseInt(scanner.nextLine());

		RestaurantVO reservation = new RestaurantVO(memberId, restaurantName, date, time, numberOfPeople, deposit);

		flag = dao.doUpdate(reservation);
		return flag;
	}

	/**
	 * 회원삭제
	 * 
	 * @return
	 * @return 1(성공)/0(실패)
	 */
	public int doDelete() { // 예약 취소
		int flag = 0;
		RestaurantVO outVO = null;
		RestaurantVO param = new RestaurantVO(); // 조회:파라메터:memberID
		// 1. Scanner
		// 2. 등록사용자 정보
		// 3. dao.doSave(param);

		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("9 입력시 메인화면으로 이동합니다.");
		System.out.print("예약자 성함을 입력하세요.>");
		String inputData = scanner.nextLine().trim();
		if (inputData.equals("9")) {	        
	        return 0;
	    }
		// log.debug("1. inputData:{}",inputData);
		param.setMemberId(inputData); // 예약자 정보 설정
		outVO = dao.doSelectOne(param);
		if (outVO == null) {
			System.out.println("해당 예약 정보를 찾을 수 없습니다.");
			return 0; // 조회 실패
		}
		System.out.println("예약 정보를 확인해 주세요:");
		System.out.println(outVO);

		System.out.print("예약을 취소하시겠습니까? (Y/N): ");
		String confirmation = scanner.nextLine().trim();

		if (confirmation.equalsIgnoreCase("Y")) {
			// 예약 취소 진행
			flag = dao.doDelete(param);

			
		}else if(confirmation.equalsIgnoreCase("N")){
			
		}
			
		// log.debug("2. param:{}",param);
		
		
		// log.debug("3. flag:{}",flag);
		return flag;
	}

	public int readFile(String path) {
		return dao.readFile(path);
	}

	public int writeFile() {
		String path = "restaurant.csv";

		return dao.writeFile(path);
	}

}
