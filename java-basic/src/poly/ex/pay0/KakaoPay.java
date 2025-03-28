package poly.ex.pay0;

public class KakaoPay implements Pay, Connection {

    @Override
    public void connect() {
        System.out.println("카카오페이 시스템과 연결합니다.");
    }

    @Override
    public boolean pay(int amount) {
        connect();
        System.out.println(amount + "원 결제를 시도합니다.");

        return true;
    }
}
