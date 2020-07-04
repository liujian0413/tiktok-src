package com.toutiao.proxyserver;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* renamed from: com.toutiao.proxyserver.w */
final class C46568w extends ProxySelector {

    /* renamed from: a */
    private static final List<Proxy> f120011a = Collections.singletonList(Proxy.NO_PROXY);

    /* renamed from: b */
    private final ProxySelector f120012b = ProxySelector.getDefault();

    /* renamed from: c */
    private final String f120013c;

    /* renamed from: d */
    private final int f120014d;

    public final List<Proxy> select(URI uri) {
        if (uri == null) {
            throw new IllegalArgumentException("URI can't be null");
        } else if (!this.f120013c.equalsIgnoreCase(uri.getHost()) || this.f120014d != uri.getPort()) {
            return this.f120012b.select(uri);
        } else {
            return f120011a;
        }
    }

    private C46568w(String str, int i) {
        this.f120013c = str;
        this.f120014d = i;
    }

    /* renamed from: a */
    static void m146345a(String str, int i) {
        ProxySelector.setDefault(new C46568w(str, i));
    }

    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f120012b.connectFailed(uri, socketAddress, iOException);
    }
}
