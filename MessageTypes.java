public enum MessageTypes {
        VIBER {
                public ViberMessage sentMessage () {
                        return new ViberMessage();
                }
        },
        WHATSUP {
                public WhatsupMessage sentMessage () {
                        return new WhatsupMessage();
                }
        },
        TELEGRAM {
                public Telegrammessage sentMessage () {
                        return new Telegrammessage();
                }
        };

        public abstract Message sentMessage();
}
