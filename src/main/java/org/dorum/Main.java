package src.main.java.org.dorum;

public class Main {
    public static void main(String[] args) {

        Message Viber = MessageTypes.valueOf("VIBER").sentMessage();
        Message WhatsApp = MessageTypes.valueOf("WHATSAPP").sentMessage();
        Message Telegram = MessageTypes.valueOf("TELEGRAM").sentMessage();

        Viber.sendMessage();
        WhatsApp.sendMessage();
        Telegram.sendMessage();
    }
}
