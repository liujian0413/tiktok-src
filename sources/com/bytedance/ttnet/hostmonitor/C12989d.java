package com.bytedance.ttnet.hostmonitor;

/* renamed from: com.bytedance.ttnet.hostmonitor.d */
final class C12989d {

    /* renamed from: a */
    public boolean f34398a;

    /* renamed from: b */
    public ConnectionType f34399b;

    public C12989d() {
        this.f34398a = true;
        this.f34399b = ConnectionType.NONE;
    }

    public final int hashCode() {
        return ((this.f34398a ? 1 : 0) * true) + this.f34399b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12989d dVar = (C12989d) obj;
        if (this.f34398a == dVar.f34398a && this.f34399b == dVar.f34399b) {
            return true;
        }
        return false;
    }

    public C12989d(boolean z, ConnectionType connectionType) {
        this.f34398a = z;
        this.f34399b = connectionType;
    }
}
