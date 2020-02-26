public class Main {
    public static void main(String[] args) {

        Message Viber = MessageTypes.valueOf("VIBER").sentMessage();
        Message Whatsup = MessageTypes.valueOf("WHATSUP").sentMessage();
        Message Telegram = MessageTypes.valueOf("TELEGRAM").sentMessage();

        Viber.sendMessage();
        Whatsup.sendMessage();
        Telegram.sendMessage();
    }
}
