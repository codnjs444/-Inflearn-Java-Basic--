package poly.ex.sender;

public class FaceBooksender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("페메를 발송합니다. :" + message);
    }
}
