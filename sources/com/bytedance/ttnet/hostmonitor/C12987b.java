package com.bytedance.ttnet.hostmonitor;

import java.net.InetSocketAddress;

/* renamed from: com.bytedance.ttnet.hostmonitor.b */
public final class C12987b {

    /* renamed from: a */
    public final String f34389a;

    /* renamed from: b */
    public final int f34390b;

    /* renamed from: a */
    public final InetSocketAddress mo31519a() {
        return new InetSocketAddress(this.f34389a, this.f34390b);
    }

    public final int hashCode() {
        return (this.f34389a.hashCode() * 31) + this.f34390b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12987b bVar = (C12987b) obj;
        if (this.f34390b != bVar.f34390b || !this.f34389a.equals(bVar.f34389a)) {
            return false;
        }
        return true;
    }

    public C12987b(String str, int i) {
        this.f34389a = str;
        this.f34390b = i;
    }
}
