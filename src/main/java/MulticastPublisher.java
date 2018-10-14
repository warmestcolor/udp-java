import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MulticastPublisher {
    private DatagramSocket socket;
    private InetAddress group;
    private byte[] buf;

    public void multicast(
            String multicastMessage) throws IOException {
        socket = new DatagramSocket();
        group = InetAddress.getByName(Config.ADDRESS);
        buf = multicastMessage.getBytes();

        DatagramPacket packet
                = new DatagramPacket(buf, buf.length, group, Config.IP);
        socket.send(packet);
        socket.close();
    }
}