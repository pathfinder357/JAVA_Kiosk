package Level2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<MenuItem>();
       
        MenuItem menu1 = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menu2 = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menu3 = new MenuItem("CheeseBurger", 6.9, "포테이터 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem menu4 = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
       
        menuItems.add(menu1);
        menuItems.add(menu2);
        menuItems.add(menu3);
        menuItems.add(menu4);


        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("원하는 메뉴 입력: " );
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(menuItems.get(0));
                    break;
                case 2:
                    System.out.println(menuItems.get(1));
                    break;
                case 3:
                    System.out.println(menuItems.get(2));
                    break;
                case 4:
                    System.out.println(menuItems.get(3));
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
