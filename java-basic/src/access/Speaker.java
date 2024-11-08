package access;

public class Speaker {
    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량 증가 x 최대");
        } else {
            volume += 10;
            System.out.println("음량 10증가");
        }
    }
    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량 : " + volume);
    }
}
