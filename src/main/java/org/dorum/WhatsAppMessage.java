package src.main.java.org.dorum;

public class WhatsAppMessage implements Message {
    @Override
    public void sendMessage() {
        System.out.println("WhatsApp message was sent");
    }
}

