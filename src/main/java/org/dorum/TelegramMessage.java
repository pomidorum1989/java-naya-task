package src.main.java.org.dorum;

public class TelegramMessage implements Message {

    @Override
    public void sendMessage() {
        System.out.println("Telegram message was sent");
    }
}
