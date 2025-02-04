package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        if (item != null) {
            items.add(item);
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int totalPrice = 0;

        for (Item item : items) {
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
            totalPrice += item.getTotalPrice();
        }

        System.out.println("전체 가격 합: " + totalPrice);
    }
}
