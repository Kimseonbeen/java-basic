package poly.ex.sender;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("sns을 발송합니다: " + message);
    }
}
