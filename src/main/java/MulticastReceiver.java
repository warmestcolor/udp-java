import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastReceiver extends Thread {
    protected MulticastSocket socket = null;
    protected byte[] buf = new byte[1024];

    public void run() {
        try {
            socket = new MulticastSocket(Config.IP);
            socket.setTimeToLive(250);
            InetAddress group = InetAddress.getByName(Config.ADDRESS);
            socket.joinGroup(group);
            // print
            System.out.println("Receiver Running...[" + Config.ADDRESS + ":" + Config.IP + "]");
            while (true) {
                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                socket.receive(packet);
                System.out.println("Received data from: " + packet.getAddress().toString() +
                        ":" + packet.getPort() + " with length: " +
                        packet.getLength());
                String received = new String(
                        packet.getData(), 0, packet.getLength());
                System.out.println(received);
                if ("end".equals(received)) {
                    break;
                }
            }
            socket.leaveGroup(group);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
