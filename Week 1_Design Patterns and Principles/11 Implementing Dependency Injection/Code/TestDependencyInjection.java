package dependency;

public class TestDependencyInjection {
    public static void main(String[] args) {
        MessageSender sms = new SMSSender();
        MessageService smsService = new MessageService(sms);
        smsService.processMessage("Hello via SMS");

        MessageSender email = new EmailSender();
        MessageService emailService = new MessageService(email);
        emailService.processMessage("Hello via Email");
    }
}
