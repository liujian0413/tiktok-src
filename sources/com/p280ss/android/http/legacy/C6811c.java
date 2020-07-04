package com.p280ss.android.http.legacy;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.android.http.legacy.p877d.C19574b;
import com.p280ss.android.http.legacy.p877d.C19576d;
import java.util.Locale;

/* renamed from: com.ss.android.http.legacy.c */
public final class C6811c implements Cloneable {

    /* renamed from: a */
    public final String f19411a;

    /* renamed from: b */
    protected final String f19412b;

    /* renamed from: c */
    public final int f19413c;

    /* renamed from: d */
    public final String f19414d;

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String toString() {
        return m21173a();
    }

    public final int hashCode() {
        return C19576d.m64494a(C19576d.m64493a(C19576d.m64494a(17, (Object) this.f19412b), this.f19413c), (Object) this.f19414d);
    }

    /* renamed from: a */
    private String m21173a() {
        C19574b bVar = new C19574b(32);
        bVar.mo51739a(this.f19414d);
        bVar.mo51739a("://");
        bVar.mo51739a(this.f19411a);
        if (this.f19413c != -1) {
            bVar.mo51737a(':');
            bVar.mo51739a(Integer.toString(this.f19413c));
        }
        return bVar.toString();
    }

    public C6811c(String str) {
        this(str, -1, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6811c)) {
            return false;
        }
        C6811c cVar = (C6811c) obj;
        if (!this.f19412b.equals(cVar.f19412b) || this.f19413c != cVar.f19413c || !this.f19414d.equals(cVar.f19414d)) {
            return false;
        }
        return true;
    }

    public C6811c(String str, int i, String str2) {
        if (str != null) {
            this.f19411a = str;
            this.f19412b = str.toLowerCase(Locale.ENGLISH);
            if (str2 != null) {
                this.f19414d = str2.toLowerCase(Locale.ENGLISH);
            } else {
                this.f19414d = WebKitApi.SCHEME_HTTP;
            }
            this.f19413c = i;
            return;
        }
        throw new IllegalArgumentException("Host name may not be null");
    }
}
