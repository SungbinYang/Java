package access;

public class Speaker {
    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }

    public void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대음량이다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    public void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    public void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}
