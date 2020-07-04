package com.p280ss.android.http.legacy.p296a;

import com.p280ss.android.http.legacy.C19572d;
import com.p280ss.android.http.legacy.p877d.C19574b;
import com.p280ss.android.http.legacy.p877d.C19576d;

/* renamed from: com.ss.android.http.legacy.a.e */
public final class C19565e implements C19572d, Cloneable {

    /* renamed from: a */
    private final String f52939a;

    /* renamed from: b */
    private final String f52940b;

    /* renamed from: a */
    public final String mo51722a() {
        return this.f52939a;
    }

    /* renamed from: b */
    public final String mo51723b() {
        return this.f52940b;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final int hashCode() {
        return C19576d.m64494a(C19576d.m64494a(17, (Object) this.f52939a), (Object) this.f52940b);
    }

    public final String toString() {
        int length = this.f52939a.length();
        if (this.f52940b != null) {
            length += this.f52940b.length() + 1;
        }
        C19574b bVar = new C19574b(length);
        bVar.mo51739a(this.f52939a);
        if (this.f52940b != null) {
            bVar.mo51739a("=");
            bVar.mo51739a(this.f52940b);
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
        if (!(obj instanceof C19572d)) {
            return false;
        }
        C19565e eVar = (C19565e) obj;
        if (!this.f52939a.equals(eVar.f52939a) || !C19576d.m64495a((Object) this.f52940b, (Object) eVar.f52940b)) {
            return false;
        }
        return true;
    }

    public C19565e(String str, String str2) {
        if (str != null) {
            this.f52939a = str;
            this.f52940b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
