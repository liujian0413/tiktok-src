package org.apache.commons.net;

import java.net.DatagramSocket;
import java.net.SocketException;

public class DefaultDatagramSocketFactory implements DatagramSocketFactory {
    public DatagramSocket createDatagramSocket() throws SocketException {
        return new DatagramSocket();
    }
}
