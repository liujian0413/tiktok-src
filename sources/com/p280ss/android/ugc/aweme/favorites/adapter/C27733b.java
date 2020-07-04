package com.p280ss.android.ugc.aweme.favorites.adapter;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.b */
public final class C27733b {

    /* renamed from: a */
    public final int f73161a;

    /* renamed from: b */
    public final Object f73162b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27733b) {
                C27733b bVar = (C27733b) obj;
                if (!(this.f73161a == bVar.f73161a) || !C7573i.m23585a(this.f73162b, bVar.f73162b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f73161a) * 31;
        Object obj = this.f73162b;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypePoiStruct(type=");
        sb.append(this.f73161a);
        sb.append(", data=");
        sb.append(this.f73162b);
        sb.append(")");
        return sb.toString();
    }

    public C27733b(int i, Object obj) {
        this.f73161a = i;
        this.f73162b = obj;
    }
}
