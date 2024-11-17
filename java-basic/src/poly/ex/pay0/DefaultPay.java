package poly.ex.pay0;

public class DefaultPay implements Pay, Connection {
    @Override
    public void connect() {
        System.out.println("결제 수단이 없습니다.");
    }

    @Override
    public boolean pay(int amount) {
        connect();
        return false;
    }
}
