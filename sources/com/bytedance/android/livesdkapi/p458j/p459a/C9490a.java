package com.bytedance.android.livesdkapi.p458j.p459a;

import com.bytedance.android.livesdkapi.p458j.C9495b;

/* renamed from: com.bytedance.android.livesdkapi.j.a.a */
public final class C9490a implements C9492c, Cloneable {

    /* renamed from: a */
    private final String f25980a;

    /* renamed from: b */
    private final String f25981b;

    /* renamed from: a */
    public final String mo23514a() {
        return this.f25980a;
    }

    /* renamed from: b */
    public final String mo23515b() {
        return this.f25981b;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final int hashCode() {
        return C9495b.m28032a(C9495b.m28032a(17, (Object) this.f25980a), (Object) this.f25981b);
    }

    public final String toString() {
        int length = this.f25980a.length();
        if (this.f25981b != null) {
            length += this.f25981b.length() + 1;
        }
        C9491b bVar = new C9491b(length);
        bVar.mo23520a(this.f25980a);
        if (this.f25981b != null) {
            bVar.mo23520a("=");
            bVar.mo23520a(this.f25981b);
        }
        return bVar.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9492c)) {
            return false;
        }
        C9490a aVar = (C9490a) obj;
        if (!this.f25980a.equals(aVar.f25980a) || !C9495b.m28033a((Object) this.f25981b, (Object) aVar.f25981b)) {
            return false;
        }
        return true;
    }

    public C9490a(String str, String str2) {
        if (str != null) {
            this.f25980a = str;
            this.f25981b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
