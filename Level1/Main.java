package Level1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        // Menu
        String Menu1 = "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거";
        String Menu2 = "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거";
        String Menu3 = "3. CheeseBurger  | W 6.9 | 포테이터 번과 비프패티, 치즈가 토핑된 치즈버거";
        String Menu4 = "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거";

        System.out.println("[SHAKESHAK MENU]");
        System.out.println(Menu1);
        System.out.println(Menu2);
        System.out.println(Menu3);
        System.out.println(Menu4);
        System.out.println("0. Exit");
        while (running) {
            System.out.println("원하는 메뉴 입력: " );
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(Menu1);
                    break;
                case 2:
                    System.out.println(Menu2);
                    break;
                case 3:
                    System.out.println(Menu3);
                    break;
                case 4:
                    System.out.println(Menu4);
                    break;
                case 0:
                    System.out.println("프로그램을 종료, 0");
                    running = false; // 반복 종료
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
        scanner.close();
    }
}
