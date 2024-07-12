package src.main.java.org.dorum;

public enum MessageTypes {
        VIBER {
                public ViberMessage sentMessage () {
                        return new ViberMessage();
                }
        },
        WHATSAPP {
                public WhatsAppMessage sentMessage () {
                        return new WhatsAppMessage();
                }
        },
        TELEGRAM {
                public TelegramMessage sentMessage () {
                        return new TelegramMessage();
                }
        };

        public abstract Message sentMessage();
}
