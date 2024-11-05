package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        int totalPrice = 0;

        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;

        ProductOrder[] productOrders = {productOrder1, productOrder2, productOrder3};

        for (ProductOrder productOrder : productOrders) {
            totalPrice += productOrder.price * productOrder.quantity; // 위의 객체부분에 일일이 다 했었는데 이렇게 반복문에 넣을 수 있었지..
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
        }

        System.out.println("총 결제 금액: " + totalPrice);
    }
}
