package com.bytedance.frameworks.baselib.network.http.util;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.util.Locale;

/* renamed from: com.bytedance.frameworks.baselib.network.http.util.b */
public final class C10182b implements Cloneable {

    /* renamed from: a */
    public final String f27715a;

    /* renamed from: b */
    protected final String f27716b;

    /* renamed from: c */
    public final int f27717c;

    /* renamed from: d */
    public final String f27718d;

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String toString() {
        return m30249a();
    }

    public final int hashCode() {
        return C10185e.m30253a(C10185e.m30252a(C10185e.m30253a(17, (Object) this.f27716b), this.f27717c), (Object) this.f27718d);
    }

    /* renamed from: a */
    private String m30249a() {
        C10181a aVar = new C10181a(32);
        aVar.mo24879a(this.f27718d);
        aVar.mo24879a("://");
        aVar.mo24879a(this.f27715a);
        if (this.f27717c != -1) {
            aVar.mo24878a(':');
            aVar.mo24879a(Integer.toString(this.f27717c));
        }
        return aVar.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10182b)) {
            return false;
        }
        C10182b bVar = (C10182b) obj;
        if (!this.f27716b.equals(bVar.f27716b) || this.f27717c != bVar.f27717c || !this.f27718d.equals(bVar.f27718d)) {
            return false;
        }
        return true;
    }

    public C10182b(String str, int i, String str2) {
        if (str != null) {
            this.f27715a = str;
            this.f27716b = str.toLowerCase(Locale.ENGLISH);
            if (str2 != null) {
                this.f27718d = str2.toLowerCase(Locale.ENGLISH);
            } else {
                this.f27718d = WebKitApi.SCHEME_HTTP;
            }
            this.f27717c = i;
            return;
        }
        throw new IllegalArgumentException("Host name may not be null");
    }
}
