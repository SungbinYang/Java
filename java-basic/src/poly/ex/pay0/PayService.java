package poly.ex.pay0;

public class PayService {

    public void processPay(String option, int amount) {
        startPay(option, amount);

        Pay selectedPay = select(option);

        if (selectedPay.pay(amount)) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }

    private void startPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option = " + option + ", amount = " + amount);
    }

    // 이 부분을 강의에서는 PayStore에 담아두고 해당 클래스를 abstract로 두고 해당 메서드를 static으로 둔다.
    private Pay select(String option) {
        return switch (option) {
            case "kakao" -> new KakaoPay();
            case "naver" -> new NaverPay();
            default -> new DefaultPay(); // 이 부분을 생각 못하고 예외처리를 하려고 했음.
        };
    }
}
