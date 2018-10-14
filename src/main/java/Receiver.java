import java.io.IOException;

public class Receiver {
    public static void main(String[] args) throws IOException {
        System.setProperty("java.net.preferIPv4Stack", "true");
        if (args.length == 1) {
            Config.ADDRESS = args[0];
        }
        MulticastReceiver receiver = new MulticastReceiver();
        receiver.run();
    }
}
