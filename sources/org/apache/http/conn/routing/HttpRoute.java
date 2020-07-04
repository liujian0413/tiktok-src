package org.apache.http.conn.routing;

import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.RouteInfo.LayerType;
import org.apache.http.conn.routing.RouteInfo.TunnelType;

public final class HttpRoute implements Cloneable, RouteInfo {
    private static final HttpHost[] EMPTY_HTTP_HOST_ARRAY = new HttpHost[0];
    private final LayerType layered;
    private final InetAddress localAddress;
    private final HttpHost[] proxyChain;
    private final boolean secure;
    private final HttpHost targetHost;
    private final TunnelType tunnelled;

    public final InetAddress getLocalAddress() {
        return this.localAddress;
    }

    public final HttpHost getTargetHost() {
        return this.targetHost;
    }

    public final boolean isSecure() {
        return this.secure;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final int getHopCount() {
        return this.proxyChain.length + 1;
    }

    public final HttpHost getProxyHost() {
        if (this.proxyChain.length == 0) {
            return null;
        }
        return this.proxyChain[0];
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

    public final int hashCode() {
        int hashCode = this.targetHost.hashCode();
        if (this.localAddress != null) {
            hashCode ^= this.localAddress.hashCode();
        }
        int length = hashCode ^ this.proxyChain.length;
        for (HttpHost hashCode2 : this.proxyChain) {
            length ^= hashCode2.hashCode();
        }
        if (this.secure) {
            length ^= 286331153;
        }
        return (length ^ this.tunnelled.hashCode()) ^ this.layered.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getHopCount() * 30) + 50);
        sb.append("HttpRoute[");
        if (this.localAddress != null) {
            sb.append(this.localAddress);
            sb.append("->");
        }
        sb.append('{');
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
        for (HttpHost append : this.proxyChain) {
            sb.append(append);
            sb.append("->");
        }
        sb.append(this.targetHost);
        sb.append(']');
        return sb.toString();
    }

    public HttpRoute(HttpHost httpHost) {
        this((InetAddress) null, httpHost, EMPTY_HTTP_HOST_ARRAY, false, TunnelType.PLAIN, LayerType.PLAIN);
    }

    private static HttpHost[] toChain(HttpHost httpHost) {
        if (httpHost == null) {
            return EMPTY_HTTP_HOST_ARRAY;
        }
        return new HttpHost[]{httpHost};
    }

    private static HttpHost[] toChain(HttpHost[] httpHostArr) {
        if (httpHostArr == null || httpHostArr.length <= 0) {
            return EMPTY_HTTP_HOST_ARRAY;
        }
        int length = httpHostArr.length;
        int i = 0;
        while (i < length) {
            if (httpHostArr[i] != null) {
                i++;
            } else {
                throw new IllegalArgumentException("Proxy chain may not contain null elements.");
            }
        }
        HttpHost[] httpHostArr2 = new HttpHost[httpHostArr.length];
        System.arraycopy(httpHostArr, 0, httpHostArr2, 0, httpHostArr.length);
        return httpHostArr2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        int i = 0;
        if (!(obj instanceof HttpRoute)) {
            return false;
        }
        HttpRoute httpRoute = (HttpRoute) obj;
        boolean equals = this.targetHost.equals(httpRoute.targetHost);
        if (this.localAddress == httpRoute.localAddress || (this.localAddress != null && this.localAddress.equals(httpRoute.localAddress))) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = equals & z;
        if (this.proxyChain == httpRoute.proxyChain || this.proxyChain.length == httpRoute.proxyChain.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z4 & z2;
        if (!(this.secure == httpRoute.secure && this.tunnelled == httpRoute.tunnelled && this.layered == httpRoute.layered)) {
            z3 = false;
        }
        boolean z6 = z3 & z5;
        if (z6 && this.proxyChain != null) {
            while (z6 && i < this.proxyChain.length) {
                z6 = this.proxyChain[i].equals(httpRoute.proxyChain[i]);
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
                sb.append(" exceeds route length ");
                sb.append(hopCount);
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

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, boolean z) {
        this(inetAddress, httpHost, EMPTY_HTTP_HOST_ARRAY, z, TunnelType.PLAIN, LayerType.PLAIN);
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, HttpHost httpHost2, boolean z) {
        TunnelType tunnelType;
        LayerType layerType;
        HttpHost[] chain = toChain(httpHost2);
        if (z) {
            tunnelType = TunnelType.TUNNELLED;
        } else {
            tunnelType = TunnelType.PLAIN;
        }
        TunnelType tunnelType2 = tunnelType;
        if (z) {
            layerType = LayerType.LAYERED;
        } else {
            layerType = LayerType.PLAIN;
        }
        LayerType layerType2 = layerType;
        this(inetAddress, httpHost, chain, z, tunnelType2, layerType2);
        if (httpHost2 == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        }
    }

    private HttpRoute(InetAddress inetAddress, HttpHost httpHost, HttpHost[] httpHostArr, boolean z, TunnelType tunnelType, LayerType layerType) {
        if (httpHost == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        } else if (httpHostArr == null) {
            throw new IllegalArgumentException("Proxies may not be null.");
        } else if (tunnelType == TunnelType.TUNNELLED && httpHostArr.length == 0) {
            throw new IllegalArgumentException("Proxy required if tunnelled.");
        } else {
            if (tunnelType == null) {
                tunnelType = TunnelType.PLAIN;
            }
            if (layerType == null) {
                layerType = LayerType.PLAIN;
            }
            this.targetHost = httpHost;
            this.localAddress = inetAddress;
            this.proxyChain = httpHostArr;
            this.secure = z;
            this.tunnelled = tunnelType;
            this.layered = layerType;
        }
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, HttpHost[] httpHostArr, boolean z, TunnelType tunnelType, LayerType layerType) {
        this(inetAddress, httpHost, toChain(httpHostArr), z, tunnelType, layerType);
    }
}
