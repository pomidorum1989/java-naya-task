public class MessageFactory {

        public Message getMessage (MessageTypes type) {
            Message toSend = null;
            switch (type) {
                case VIBER:
                    toSend = new ViberMessage();
                    break;
                case WHATSUP:
                    toSend = new WhatsupMessage();
                    break;
                case TELEGRAM:
                    toSend = new Telegrammessage();
                    break;
                default:
                    throw new IllegalArgumentException("Wrong doughnut type:" + type);
            }
            return toSend;
    }
}
