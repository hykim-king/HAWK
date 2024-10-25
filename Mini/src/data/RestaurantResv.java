package data;

import java.util.*;

// Menu 클래스 (음식 이름과 가격 포함)
class Menu {
    String name;
    int price;

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " (가격: " + price + "원)";
    }
}

// Restaurant 클래스 (음식점 이름, 주소, 메뉴 리스트 포함)
class Restaurant {
    String name;
    String address;
    List<Menu> menuList;

    public Restaurant(String name, String address, List<Menu> menuList) {
        this.name = name;
        this.address = address;
        this.menuList = menuList;
    }

    @Override
    public String toString() {
        return name + " (메뉴: " + address + ")";
    }

//    public void printMenu() {
//        System.out.println(name + "의 대표 메뉴:");
//        for (int i = 0; i < menuList.size(); i++) {
//            System.out.println((i + 1) + ": " + menuList.get(i));
//        }
//    }
}

public class RestaurantResv {

    // 카테고리별 음식점 목록을 담은 HashMap
    private static Map<Integer, Restaurant> koreanRestaurants = new HashMap<>();
    private static Map<Integer, Restaurant> chineseRestaurants = new HashMap<>();
    private static Map<Integer, Restaurant> japaneseRestaurants = new HashMap<>();
    private static Map<Integer, Restaurant> westernRestaurants = new HashMap<>();

    // 음식점 및 메뉴 데이터를 초기화하는 메소드
    public static void initRestaurants() {
        // 메뉴 리스트 생성
        List<Menu> koreanMenu = Arrays.asList();
        List<Menu> chineseMenu = Arrays.asList();
        List<Menu> japaneseMenu = Arrays.asList();
        List<Menu> westernMenu = Arrays.asList();

        // 한식 음식점 주소 대신 메뉴(가격 포함할 것(int형 아니여도됨)
        koreanRestaurants.put(1, new Restaurant("찌개가게", "된장찌개(6000원), 김치찌개(7000원), 부대찌개(10000원)", koreanMenu));
        koreanRestaurants.put(2, new Restaurant("비빔밥가게", "비빔밥(5000원), 육회비빔밥(8000원), 간장계란비빔밥(3000원)", koreanMenu));
        koreanRestaurants.put(3, new Restaurant("떡볶이가게", "떡볶이(3000원), 공중떡볶이(5000원), 튀김 떡볶이(8000원)", koreanMenu));

        // 중식 음식점 추가
        chineseRestaurants.put(1, new Restaurant("중식당A", "짜장면(5000원), 짬뽕(7000원), 탕수육(10000원)", chineseMenu));
        chineseRestaurants.put(2, new Restaurant("중식당B", "마라탕(5000원), 볶음밥(7000원), 꿔바로우(10000원)", chineseMenu));
        chineseRestaurants.put(3, new Restaurant("중식당C", "마파두부(5000원), 짬뽕(7000원), 탕수육(10000원)", chineseMenu));

        // 일식 음식점 추가
        japaneseRestaurants.put(1, new Restaurant("초밥가게", "연어초밥(12000원), 광어초밥(10000원), 계란초밥(8000원)", japaneseMenu));
        japaneseRestaurants.put(2, new Restaurant("라멘가게", "연어초밥(5000원), 광어초밥(7000원), 계란초밥(10000원)", japaneseMenu));
        japaneseRestaurants.put(3, new Restaurant("카레가게", "미소라멘(7000원), 돈코츠라멘(9000원), 사유라멘(8000원)", japaneseMenu));

        // 양식 음식점 추가
        westernRestaurants.put(1, new Restaurant("파스타가게", "해물파스타(8000원), 오일파스타(8000원), 크림파스타(9000원)", westernMenu));
        westernRestaurants.put(2, new Restaurant("스테이크가게", "기본 스테이크(15000원), 핫 스테이크(17000원),그릴 스테이크(16000원)", westernMenu));
        westernRestaurants.put(3, new Restaurant("피자가게", "페퍼로니피자(21000원), 불고기피자(23000원), 치킨피자(25000원)", westernMenu));
    }

    // 음식점 예약 UI 메소드
    public static void reservationUI() {
        Scanner sc = new Scanner(System.in);
        if (koreanRestaurants.isEmpty()) { // 음식점 목록이 비어 있을 때만 초기화
            initRestaurants(); // 음식점 목록 초기화, 중복 초기화 방지
        }

        System.out.println("1. 한식");
        System.out.println("2. 중식");
        System.out.println("3. 일식");
        System.out.println("4. 양식");
        System.out.println("5. 뒤로 가기");
        System.out.println("");
        System.out.print("번호를 입력해주세요.> ");

        while (true) {
            int selectNum = sc.nextInt();

            if (selectNum == 1) {
                printRestaurantList(koreanRestaurants, "한식");
                System.out.print("5 입력시 메인 화면으로 이동합니다.>");
            } else if (selectNum == 2) {
                printRestaurantList(chineseRestaurants, "중식");
                System.out.print("5 입력시 메인 화면으로 이동합니다.>");
            } else if (selectNum == 3) {
                printRestaurantList(japaneseRestaurants, "일식");
                System.out.print("5 입력시 메인 화면으로 이동합니다.>");
            } else if (selectNum == 4) {
                printRestaurantList(westernRestaurants, "양식");
                System.out.print("5 입력시 메인 화면으로 이동합니다.>");
            } else if (selectNum == 5) {
            	return ;
                
            } else {
                System.out.print("잘못된 입력입니다. 다시 입력해주세요.>");
            }
           
        }
    }

    // 음식점 리스트 출력 메소드
    private static void printRestaurantList(Map<Integer, Restaurant> restaurants, String category) {
        System.out.println(category + " 음식점 리스트:");
        for (Map.Entry<Integer, Restaurant> entry : restaurants.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("");
    }

   
}
