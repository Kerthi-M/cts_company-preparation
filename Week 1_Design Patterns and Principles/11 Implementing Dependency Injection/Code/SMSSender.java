package dependency;

public class SMSSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}
