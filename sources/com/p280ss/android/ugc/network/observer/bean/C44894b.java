package com.p280ss.android.ugc.network.observer.bean;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.network.observer.bean.b */
public final class C44894b {

    /* renamed from: a */
    public final String f115440a;

    /* renamed from: b */
    public final int f115441b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44894b) {
                C44894b bVar = (C44894b) obj;
                if (C7573i.m23585a((Object) this.f115440a, (Object) bVar.f115440a)) {
                    if (this.f115441b == bVar.f115441b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f115440a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f115441b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IPPort(ip=");
        sb.append(this.f115440a);
        sb.append(", port=");
        sb.append(this.f115441b);
        sb.append(")");
        return sb.toString();
    }

    public C44894b(String str, int i) {
        C7573i.m23587b(str, "ip");
        this.f115440a = str;
        this.f115441b = i;
    }
}
