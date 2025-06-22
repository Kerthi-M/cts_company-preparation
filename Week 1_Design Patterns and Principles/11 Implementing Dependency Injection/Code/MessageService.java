package dependency;

public class MessageService {
    private MessageSender sender;

    public MessageService(MessageSender sender) {
        this.sender = sender;
    }

    public void processMessage(String message) {
        sender.sendMessage(message);
    }
}
