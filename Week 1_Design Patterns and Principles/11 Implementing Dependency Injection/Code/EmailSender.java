package dependency;

public class EmailSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}
