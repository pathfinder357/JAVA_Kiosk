package Level5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // menuItems 리스트 관리 필드
    private String categoryName;
    private List<MenuItem> items;

    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void displayMenu() {
        System.out.println("==== " + categoryName + " ====");
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, items.get(i).toString());
        }
    }

    public MenuItem getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        } else {
            return null;
        }
    }
}

