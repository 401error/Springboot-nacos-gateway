package com.read_account.demo.Util;




import org.springframework.stereotype.Component;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;


@Component
public class Localhostip {


    public String getip() throws SocketException {

        String ip ="";
        Enumeration<NetworkInterface> nifs = NetworkInterface.getNetworkInterfaces();
        while (nifs.hasMoreElements()) {
            NetworkInterface nif = nifs.nextElement();
            if (nif.getName().equals( "wlan1")) {

                // 获得与该网络接口绑定的 IP 地址，一般只有一个
                Enumeration<InetAddress> addresses = nif.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress addr = addresses.nextElement();

                    if(addr instanceof Inet4Address) {
                        ip = addr.getHostAddress();
                    }
                    break;
                }

            }

        }


        return ip;

    }
}