package Level3;

import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Kiosk {
    // menuItem 관리 필드맴버
    private List<MenuItem> items;

    public Kiosk(List<MenuItem> items) {
        this.items = items;
    }

    //반복문 로직
    private void displayMenu() {
        System.out.println(" ------------------------------------ ");
        System.out.println("메뉴를 선택하세요:        ");
        System.out.println(" ------------------------------------ ");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).getMenu());
        }
        System.out.println("0. 프로그램 종료");
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu(); // 메뉴 출력
            System.out.print("원하는 메뉴를 입력하세요 (0: 종료): ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                running = false;
            } else if (choice >= 1 && choice <= items.size()) {
                System.out.println(items.get(choice - 1));
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
        scanner.close();
    }
}
