package thread.executor.test;

public class OrderServiceTestMain {
    public static void main(String[] args) {
        String orderNo = "Order#1234";
        OrderService orderService = new OrderService();

        orderService.order(orderNo);
    }
}
