package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];

    private int itemCount;

    public void addItem(Item item) {
        if (validateItem(item)) {
            items[itemCount++] = item;
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int totalPrice = 0;

        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명: " + items[i].getName() + ", 합계: " + items[i].getTotalPrice());
            totalPrice += items[i].getTotalPrice();
        }

        System.out.println("전체 가격 합: " + totalPrice);
    }

    private boolean validateItem(Item item) {
        if (item == null || this.itemCount >= items.length) {
            System.out.println("유효하지 않은 아이템이거나 장바구니가 가득 찼습니다.");
            return false;
        }

        return true;
    }
}
