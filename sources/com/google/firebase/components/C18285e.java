package com.google.firebase.components;

import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.firebase.components.e */
public final class C18285e {

    /* renamed from: a */
    public final Class<?> f49698a;

    /* renamed from: b */
    private final int f49699b = 1;

    /* renamed from: c */
    private final int f49700c = 0;

    /* renamed from: b */
    public final boolean mo47165b() {
        if (this.f49700c == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo47164a() {
        if (this.f49699b == 1) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49698a.hashCode() ^ 1000003) * 1000003) ^ this.f49699b) * 1000003) ^ this.f49700c;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f49698a);
        sb.append(", required=");
        boolean z2 = false;
        if (this.f49699b == 1) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", direct=");
        if (this.f49700c == 0) {
            z2 = true;
        }
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static C18285e m60286a(Class<?> cls) {
        return new C18285e(cls, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18285e)) {
            return false;
        }
        C18285e eVar = (C18285e) obj;
        if (this.f49698a == eVar.f49698a && this.f49699b == eVar.f49699b && this.f49700c == eVar.f49700c) {
            return true;
        }
        return false;
    }

    private C18285e(Class<?> cls, int i, int i2) {
        this.f49698a = (Class) C15267r.m44385a(cls, (Object) "Null dependency anInterface.");
    }
}
