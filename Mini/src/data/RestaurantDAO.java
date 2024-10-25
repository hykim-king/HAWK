package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.pcwk.ehr.cmn.DTO;
import com.pcwk.ehr.cmn.PLog;
import com.pcwk.ehr.cmn.WorkDiv;

public class RestaurantDAO implements WorkDiv<RestaurantVO>, PLog {
	private final String fileName = "restaurant.csv";
	private final String filePath = "restaurant.csv";
	public static List<RestaurantVO> ress = new ArrayList<RestaurantVO>();

	public RestaurantDAO() {
		super();
		int count = readFile(fileName);
	}

	public void displayList(List<RestaurantVO> list) {
		if (list.size() > 0) {
			String message = "\r\n" + "                                                                 \r\n"
					+ "ooooo        8      8          .oPYo.          o         8       \r\n"
					+ "  8          8      8          8    8          8         8       \r\n"
					+ "  8   .oPYo. 8oPYo. 8 .oPYo.   8      .oPYo.  o8P .oPYo. 8oPYo.  \r\n"
					+ "  8   .oooo8 8    8 8 8oooo8   8      .oooo8   8  8    ' 8    8  \r\n"
					+ "  8   8    8 8    8 8 8.       8    8 8    8   8  8    . 8    8  \r\n"
					+ "  8   `YooP8 `YooP' 8 `Yooo'   `YooP' `YooP8   8  `YooP' 8    8  \r\n"
					+ "::..:::.....::.....:..:.....::::.....::.....:::..::.....:..:::.. \r\n"
					+ ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: \r\n"
					+ ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: \r\n";
			System.out.println(message);
			for (RestaurantVO vo : list) {
				System.out.println(vo);
			}
		} else {
			System.out.println("회원 정보가 없습니다.");
		}
	}

	/**
	 * 1(성공)/0(실패)/2(memberID중복)
	 */
	// boolean isExistsMember
	private boolean isExistsRestaurant(RestaurantVO restaurant) {
		boolean flag = false;
		for (RestaurantVO vo : ress) {
			// param, vo의 memberID비교
			if (vo.getMemberId().equals(restaurant.getMemberId())) {
				flag = true;
				return flag;
			}
		}
		return flag;
	}

	@Override
	public int doSave(RestaurantVO param) { // 예약하기
		int flag = 0;
		if (isExistsRestaurant(param) == true) {
			flag = 2;
			return flag;
		}
		boolean check = this.ress.add(param);
		flag = check == true ? 1 : 0;
		return flag;
	}

	@Override
	public RestaurantVO doSelectOne(RestaurantVO param) {
		RestaurantVO outVO = null;
		for (RestaurantVO vo : ress) {
			if (vo.getMemberId().equals(param.getMemberId())) {
				outVO = vo;
				break;
			}
		}
		return outVO;
	}

	@Override
	public int doUpdate(RestaurantVO param) {
		int flag = doDelete(param);

		if (flag == 1) {
			flag += doSave(param);
		}

		return flag;
	}

	@Override
	public int doDelete(RestaurantVO param) {
		int flag = 0;
		flag = ress.remove(param) == true ? 1 : 0;
		return flag;
	}
	

	@Override
	public int doReservation(RestaurantVO param) {
		
		return 0;
	}

	@Override
	public List<RestaurantVO> doRetrieve(DTO param) {
		// TODO Auto-generated method stub
		return null;
	}

	public RestaurantVO stringToRestaurant(String data) {
		RestaurantVO out = null;
		StringTokenizer st = new StringTokenizer(data, ",");

		String RestaurantStr = data;
		//log.debug("RestaurantStr:{}", RestaurantStr);

		String RestaurantArr[] = RestaurantStr.split(",");

		String memberId        = RestaurantArr[0].trim(); // user01
		String restaurantName  = RestaurantArr[1].trim(); // restaurantName
		String date            = RestaurantArr[2].trim(); // 2024/10/24
		String time            = RestaurantArr[3].trim(); // 7시30분
		int numberOfPeople     = Integer.parseInt(RestaurantArr[4].trim()); // 3
		int deposit            = Integer.parseInt(RestaurantArr[5].trim()); // 30000

		out = new RestaurantVO(memberId, restaurantName, date, time, numberOfPeople, deposit);
		return out;
	}

	@Override
	public int readFile(String path) {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String data = "";
			while ((data = br.readLine()) != null) {
				RestaurantVO outVO = stringToRestaurant(data);
				ress.add(outVO);
			}
		} catch (IOException e) {
			System.out.println("IOException:" + e.getMessage());
		}
		// 회원정보 전체 조회
		displayList(ress);
		return ress.size();
	}

	@Override
	public int writeFile(String path) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (RestaurantVO vo : ress) {
				
				String data = vo.getMemberId() + "," + vo.getRestaurantName() + "," 
		                + vo.getDate() + "," + vo.getTime() + "," + vo.getNumberOfPeople() + "," + vo.getDeposit();


				bw.write(data);
				bw.newLine();
			}
			System.out.println("예약 저장 완료 " + path);
			return 1; // 성공적으로 저장되면 1 반환
		} catch (IOException e) {
			System.out.println("저장되지 않았습니다.");
			e.printStackTrace();
		}
		return 0;
	}
	
	@Override
	public RestaurantVO doSelectAll(RestaurantVO param) {
		RestaurantVO outVO = null;
		for (RestaurantVO vo : ress) {
			outVO = vo;
			System.out.println(vo);
		}
		return outVO;
	}
}