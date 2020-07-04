package org.apache.http.conn.routing;

import java.net.InetAddress;
import org.apache.http.HttpHost;

public interface RouteInfo {

    public enum LayerType {
        PLAIN,
        LAYERED
    }

    public enum TunnelType {
        PLAIN,
        TUNNELLED
    }

    int getHopCount();

    HttpHost getHopTarget(int i);

    InetAddress getLocalAddress();

    HttpHost getTargetHost();

    boolean isLayered();

    boolean isSecure();

    boolean isTunnelled();
}
