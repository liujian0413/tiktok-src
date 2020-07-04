package com.facebook.appevents;

import com.facebook.AccessToken;
import com.facebook.C13499h;
import com.facebook.internal.C13967z;
import java.io.Serializable;

/* renamed from: com.facebook.appevents.a */
final class C13117a implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final String f34751a;

    /* renamed from: b */
    private final String f34752b;

    /* renamed from: com.facebook.appevents.a$a */
    static class C13119a implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;

        /* renamed from: a */
        private final String f34753a;

        /* renamed from: b */
        private final String f34754b;

        private Object readResolve() {
            return new C13117a(this.f34753a, this.f34754b);
        }

        private C13119a(String str, String str2) {
            this.f34753a = str;
            this.f34754b = str2;
        }
    }

    /* renamed from: a */
    public final String mo32286a() {
        return this.f34751a;
    }

    /* renamed from: b */
    public final String mo32287b() {
        return this.f34752b;
    }

    private Object writeReplace() {
        return new C13119a(this.f34751a, this.f34752b);
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f34751a == null) {
            i = 0;
        } else {
            i = this.f34751a.hashCode();
        }
        if (this.f34752b != null) {
            i2 = this.f34752b.hashCode();
        }
        return i ^ i2;
    }

    public C13117a(AccessToken accessToken) {
        this(accessToken.f34627e, C13499h.m39725k());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13117a)) {
            return false;
        }
        C13117a aVar = (C13117a) obj;
        if (!C13967z.m41248a(aVar.f34751a, this.f34751a) || !C13967z.m41248a(aVar.f34752b, this.f34752b)) {
            return false;
        }
        return true;
    }

    public C13117a(String str, String str2) {
        if (C13967z.m41249a(str)) {
            str = null;
        }
        this.f34751a = str;
        this.f34752b = str2;
    }
}
