public class Main {
    public static void main(String[] args) {
        MessageFactory factory = new MessageFactory();

        Message Viber = factory.getMessage(MessageTypes.VIBER);
        Message Whatsup = factory.getMessage(MessageTypes.WHATSUP);
        Message Telegram = factory.getMessage(MessageTypes.TELEGRAM);

        Viber.sendMessage();
        Whatsup.sendMessage();
        Telegram.sendMessage();
    }
}
