package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Address;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.RouteDatabase;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public final class RouteSelector {
    private final Address address;
    private List<InetSocketAddress> inetSocketAddresses = Collections.emptyList();
    private InetSocketAddress lastInetSocketAddress;
    private Proxy lastProxy;
    private int nextInetSocketAddressIndex;
    private int nextProxyIndex;
    private final List<Route> postponedRoutes = new ArrayList();
    private List<Proxy> proxies = Collections.emptyList();
    private final RouteDatabase routeDatabase;

    private boolean hasNextInetSocketAddress() {
        if (this.nextInetSocketAddressIndex < this.inetSocketAddresses.size()) {
            return true;
        }
        return false;
    }

    private boolean hasNextPostponed() {
        if (!this.postponedRoutes.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean hasNextProxy() {
        if (this.nextProxyIndex < this.proxies.size()) {
            return true;
        }
        return false;
    }

    private Route nextPostponed() {
        return (Route) this.postponedRoutes.remove(0);
    }

    public final boolean hasNext() {
        if (hasNextInetSocketAddress() || hasNextProxy() || hasNextPostponed()) {
            return true;
        }
        return false;
    }

    private InetSocketAddress nextInetSocketAddress() throws IOException {
        if (hasNextInetSocketAddress()) {
            List<InetSocketAddress> list = this.inetSocketAddresses;
            int i = this.nextInetSocketAddressIndex;
            this.nextInetSocketAddressIndex = i + 1;
            return (InetSocketAddress) list.get(i);
        }
        StringBuilder sb = new StringBuilder("No route to ");
        sb.append(this.address.getUriHost());
        sb.append("; exhausted inet socket addresses: ");
        sb.append(this.inetSocketAddresses);
        throw new SocketException(sb.toString());
    }

    private Proxy nextProxy() throws IOException {
        if (hasNextProxy()) {
            List<Proxy> list = this.proxies;
            int i = this.nextProxyIndex;
            this.nextProxyIndex = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            resetNextInetSocketAddress(proxy);
            return proxy;
        }
        StringBuilder sb = new StringBuilder("No route to ");
        sb.append(this.address.getUriHost());
        sb.append("; exhausted proxy configurations: ");
        sb.append(this.proxies);
        throw new SocketException(sb.toString());
    }

    public final Route next() throws IOException {
        while (true) {
            if (!hasNextInetSocketAddress()) {
                if (hasNextProxy()) {
                    this.lastProxy = nextProxy();
                } else if (hasNextPostponed()) {
                    return nextPostponed();
                } else {
                    throw new NoSuchElementException();
                }
            }
            this.lastInetSocketAddress = nextInetSocketAddress();
            Route route = new Route(this.address, this.lastProxy, this.lastInetSocketAddress);
            if (!this.routeDatabase.shouldPostpone(route)) {
                return route;
            }
            this.postponedRoutes.add(route);
        }
    }

    static String getHostString(InetSocketAddress inetSocketAddress) {
        InetAddress address2 = inetSocketAddress.getAddress();
        if (address2 == null) {
            return inetSocketAddress.getHostName();
        }
        return address2.getHostAddress();
    }

    private void resetNextInetSocketAddress(Proxy proxy) throws IOException {
        String str;
        int i;
        this.inetSocketAddresses = new ArrayList();
        if (proxy.type() == Type.DIRECT || proxy.type() == Type.SOCKS) {
            str = this.address.getUriHost();
            i = this.address.getUriPort();
        } else {
            SocketAddress address2 = proxy.address();
            if (address2 instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address2;
                str = getHostString(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                StringBuilder sb = new StringBuilder("Proxy.address() is not an InetSocketAddress: ");
                sb.append(address2.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i <= 0 || i > 65535) {
            StringBuilder sb2 = new StringBuilder("No route to ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i);
            sb2.append("; port is out of range");
            throw new SocketException(sb2.toString());
        }
        if (proxy.type() == Type.SOCKS) {
            this.inetSocketAddresses.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            List lookup = this.address.getDns().lookup(str);
            int size = lookup.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.inetSocketAddresses.add(new InetSocketAddress((InetAddress) lookup.get(i2), i));
            }
        }
        this.nextInetSocketAddressIndex = 0;
    }

    public RouteSelector(Address address2, RouteDatabase routeDatabase2) {
        this.address = address2;
        this.routeDatabase = routeDatabase2;
        resetNextProxy(address2.url(), address2.getProxy());
    }

    private void resetNextProxy(HttpUrl httpUrl, Proxy proxy) {
        if (proxy != null) {
            this.proxies = Collections.singletonList(proxy);
        } else {
            this.proxies = new ArrayList();
            List select = this.address.getProxySelector().select(httpUrl.uri());
            if (select != null) {
                this.proxies.addAll(select);
            }
            this.proxies.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.proxies.add(Proxy.NO_PROXY);
        }
        this.nextProxyIndex = 0;
    }

    public final void connectFailed(Route route, IOException iOException) {
        if (!(route.getProxy().type() == Type.DIRECT || this.address.getProxySelector() == null)) {
            this.address.getProxySelector().connectFailed(this.address.url().uri(), route.getProxy().address(), iOException);
        }
        this.routeDatabase.failed(route);
    }
}
