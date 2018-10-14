import ipmulticast.IGMP;
import ipmulticast.IGMPHandler;
import ipmulticast.VirtualInterface;

import java.net.Inet4Address;
import java.net.InetAddress;

public class Tester2 {

    public static void main(String[] args) throws Exception {
        IGMP igmp = IGMP.getInstance();
        Inet4Address src = (Inet4Address) Inet4Address.getByName("233.233.233.233");
        Inet4Address dest = (Inet4Address) Inet4Address.getByName("233.233.233.233");
        Inet4Address group = (Inet4Address) Inet4Address.getByName("233.233.233.233");
        int type = 2;
        int code = 2;
        byte[] data = "dadada".getBytes();
        igmp.start(new IGMPHandler() {
            @Override
            public void process(Inet4Address src, Inet4Address dest, int type, int code, Inet4Address group, byte[] data, VirtualInterface vif) {
                System.out.println(
                        "src:" + src.getHostAddress()
                                + "dest:" + dest.getHostAddress()
                                + "type:" + type
                                + "code:" + code
                                + "group:" + group
                                + "data:" + new String(data)
                );
            }
        });
        igmp.send(src, dest, type, code, group, data);

    }
}
