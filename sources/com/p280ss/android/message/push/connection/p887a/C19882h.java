package com.p280ss.android.message.push.connection.p887a;

import java.net.InetSocketAddress;

/* renamed from: com.ss.android.message.push.connection.a.h */
public final class C19882h {

    /* renamed from: a */
    public final InetSocketAddress f53939a;

    /* renamed from: b */
    final int f53940b = 60000;

    public final int hashCode() {
        return this.f53939a.hashCode() ^ this.f53940b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19882h)) {
            return false;
        }
        C19882h hVar = (C19882h) obj;
        if (!this.f53939a.equals(hVar.f53939a) || this.f53940b != hVar.f53940b) {
            return false;
        }
        return true;
    }

    C19882h(InetSocketAddress inetSocketAddress, int i) {
        this.f53939a = inetSocketAddress;
    }
}
