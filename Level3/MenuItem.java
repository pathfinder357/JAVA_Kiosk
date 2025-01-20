package Level3;

public class MenuItem {
    private String menu;
    private double price;
    private String description;

    public MenuItem(String menu, double price, String description) {
        this.menu = menu;
        this.price = price;
        this.description = description;
    }
    public String getMenu() {
        return menu;
    }
    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    //출력을 했더니 이 클래스의 주소값이 나와서 찾아봤더니 toString을 꼭 처리햇어야했다.
    @Override
    public String toString() {
        return menu + " | W " + price + " | " + description;
    }
}
