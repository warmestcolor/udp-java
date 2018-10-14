import java.io.IOException;

public class Sender {
    public static void main(String[] args) throws IOException {
        MulticastPublisher publisher = new MulticastPublisher();
        publisher.multicast("HELLO1!");
        publisher.multicast("HELLO2!");
        publisher.multicast("HELLO3!");
    }
}
