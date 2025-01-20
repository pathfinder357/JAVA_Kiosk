package Level5;

import java.util.Scanner;

public class Kiosk {
    private Menu burgerMenu;
    private Scanner scanner;

    public Kiosk() {
        this.burgerMenu = new Menu("[BURGERS MENU]");
        this.scanner = new Scanner(System.in);

        // 기본 메뉴 추가
        burgerMenu.addItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본 버거"));
    }

    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("=== [Main Menu] ===");
            System.out.println("1. Burgers");
            System.out.println("2. Drinks");
            System.out.println("3. Desserts");
            System.out.println("0. 종료");
            System.out.print("번호를 선택하세요: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayMenu();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }

    private void displayMenu() {
        burgerMenu.displayMenu();
        System.out.print("주문할 번호를 선택하세요 (0. 뒤로 가기): ");
        int choice = scanner.nextInt();
        //뒤로가기
        if (choice == 0) {
            return;
        }

        MenuItem selectedItem = burgerMenu.getItem(choice - 1);
        if (selectedItem != null) {
            System.out.printf("'%s'를 선택하셨습니다.\n", selectedItem.getName());
        } else {
            System.out.println("잘못된 번호입니다.");
        }
    }
}

