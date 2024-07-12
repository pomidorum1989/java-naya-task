package src.main.java.org.dorum;

public class ViberMessage  implements Message {
    @Override
    public void sendMessage() {
        System.out.println("Viber message was sent");
    }
}

