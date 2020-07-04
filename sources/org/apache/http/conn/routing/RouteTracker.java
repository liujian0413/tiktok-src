package org.apache.http.conn.routing;

import com.taobao.android.dexposed.ClassUtils;
import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.RouteInfo.LayerType;
import org.apache.http.conn.routing.RouteInfo.TunnelType;

public final class RouteTracker implements Cloneable, RouteInfo {
    private boolean connected;
    private LayerType layered;
    private final InetAddress localAddress;
    private HttpHost[] proxyChain;
    private boolean secure;
    private final HttpHost targetHost;
    private TunnelType tunnelled;

    public final InetAddress getLocalAddress() {
        return this.localAddress;
    }

    public final HttpHost getTargetHost() {
        return this.targetHost;
    }

    public final boolean isConnected() {
        return this.connected;
    }

    public final boolean isSecure() {
        return this.secure;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final boolean isLayered() {
        if (this.layered == LayerType.LAYERED) {
            return true;
        }
        return false;
    }

    public final boolean isTunnelled() {
        if (this.tunnelled == TunnelType.TUNNELLED) {
            return true;
        }
        return false;
    }

    public final int getHopCount() {
        if (!this.connected) {
            return 0;
        }
        if (this.proxyChain == null) {
            return 1;
        }
        return 1 + this.proxyChain.length;
    }

    public final HttpRoute toRoute() {
        if (!this.connected) {
            return null;
        }
        HttpRoute httpRoute = new HttpRoute(this.targetHost, this.localAddress, this.proxyChain, this.secure, this.tunnelled, this.layered);
        return httpRoute;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.targetHost.hashCode();
        if (this.localAddress != null) {
            hashCode ^= this.localAddress.hashCode();
        }
        if (this.proxyChain != null) {
            i ^= this.proxyChain.length;
            for (HttpHost hashCode2 : this.proxyChain) {
                i ^= hashCode2.hashCode();
            }
        }
        if (this.connected) {
            i ^= 286331153;
        }
        if (this.secure) {
            i ^= 572662306;
        }
        return (i ^ this.tunnelled.hashCode()) ^ this.layered.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getHopCount() * 30) + 50);
        sb.append("RouteTracker[");
        if (this.localAddress != null) {
            sb.append(this.localAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.connected) {
            sb.append('c');
        }
        if (this.tunnelled == TunnelType.TUNNELLED) {
            sb.append('t');
        }
        if (this.layered == LayerType.LAYERED) {
            sb.append('l');
        }
        if (this.secure) {
            sb.append('s');
        }
        sb.append("}->");
        if (this.proxyChain != null) {
            for (HttpHost append : this.proxyChain) {
                sb.append(append);
                sb.append("->");
            }
        }
        sb.append(this.targetHost);
        sb.append(']');
        return sb.toString();
    }

    public RouteTracker(HttpRoute httpRoute) {
        this(httpRoute.getTargetHost(), httpRoute.getLocalAddress());
    }

    public final void connectTarget(boolean z) {
        if (!this.connected) {
            this.connected = true;
            this.secure = z;
            return;
        }
        throw new IllegalStateException("Already connected.");
    }

    public final void layerProtocol(boolean z) {
        if (this.connected) {
            this.layered = LayerType.LAYERED;
            this.secure = z;
            return;
        }
        throw new IllegalStateException("No layered protocol unless connected.");
    }

    public final void tunnelTarget(boolean z) {
        if (!this.connected) {
            throw new IllegalStateException("No tunnel unless connected.");
        } else if (this.proxyChain != null) {
            this.tunnelled = TunnelType.TUNNELLED;
            this.secure = z;
        } else {
            throw new IllegalStateException("No tunnel without proxy.");
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        int i = 0;
        if (!(obj instanceof RouteTracker)) {
            return false;
        }
        RouteTracker routeTracker = (RouteTracker) obj;
        boolean equals = this.targetHost.equals(routeTracker.targetHost);
        if (this.localAddress == routeTracker.localAddress || (this.localAddress != null && this.localAddress.equals(routeTracker.localAddress))) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = equals & z;
        if (this.proxyChain == routeTracker.proxyChain || !(this.proxyChain == null || routeTracker.proxyChain == null || this.proxyChain.length != routeTracker.proxyChain.length)) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z4 & z2;
        if (!(this.connected == routeTracker.connected && this.secure == routeTracker.secure && this.tunnelled == routeTracker.tunnelled && this.layered == routeTracker.layered)) {
            z3 = false;
        }
        boolean z6 = z3 & z5;
        if (z6 && this.proxyChain != null) {
            while (z6 && i < this.proxyChain.length) {
                z6 = this.proxyChain[i].equals(routeTracker.proxyChain[i]);
                i++;
            }
        }
        return z6;
    }

    public final HttpHost getHopTarget(int i) {
        if (i >= 0) {
            int hopCount = getHopCount();
            if (i >= hopCount) {
                StringBuilder sb = new StringBuilder("Hop index ");
                sb.append(i);
                sb.append(" exceeds tracked route length ");
                sb.append(hopCount);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                throw new IllegalArgumentException(sb.toString());
            } else if (i < hopCount - 1) {
                return this.proxyChain[i];
            } else {
                return this.targetHost;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Hop index must not be negative: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public RouteTracker(HttpHost httpHost, InetAddress inetAddress) {
        if (httpHost != null) {
            this.targetHost = httpHost;
            this.localAddress = inetAddress;
            this.tunnelled = TunnelType.PLAIN;
            this.layered = LayerType.PLAIN;
            return;
        }
        throw new IllegalArgumentException("Target host may not be null.");
    }

    public final void connectProxy(HttpHost httpHost, boolean z) {
        if (httpHost == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        } else if (!this.connected) {
            this.connected = true;
            this.proxyChain = new HttpHost[]{httpHost};
            this.secure = z;
        } else {
            throw new IllegalStateException("Already connected.");
        }
    }

    public final void tunnelProxy(HttpHost httpHost, boolean z) {
        if (httpHost == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        } else if (!this.connected) {
            throw new IllegalStateException("No tunnel unless connected.");
        } else if (this.proxyChain != null) {
            HttpHost[] httpHostArr = new HttpHost[(this.proxyChain.length + 1)];
            System.arraycopy(this.proxyChain, 0, httpHostArr, 0, this.proxyChain.length);
            httpHostArr[httpHostArr.length - 1] = httpHost;
            this.proxyChain = httpHostArr;
            this.secure = z;
        } else {
            throw new IllegalStateException("No proxy tunnel without proxy.");
        }
    }
}
