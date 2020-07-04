package com.p280ss.android.ttve.common;

/* renamed from: com.ss.android.ttve.common.i */
public final class C20452i {

    /* renamed from: a */
    public int f55236a = 720;

    /* renamed from: b */
    public int f55237b = 1280;

    public final int hashCode() {
        return (this.f55236a * 65537) + 1 + this.f55237b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f55236a);
        sb.append("x");
        sb.append(this.f55237b);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20452i)) {
            return false;
        }
        C20452i iVar = (C20452i) obj;
        if (this.f55236a == iVar.f55236a && this.f55237b == iVar.f55237b) {
            return true;
        }
        return false;
    }
}
