package com.bytedance.apm.p245h;

import android.text.TextUtils;

/* renamed from: com.bytedance.apm.h.f */
public final class C6214f {

    /* renamed from: a */
    public long f18300a;

    /* renamed from: b */
    public String f18301b;

    /* renamed from: c */
    public String f18302c;

    /* renamed from: d */
    public String f18303d;

    /* renamed from: e */
    public String f18304e;

    /* renamed from: f */
    public String f18305f;

    public final int hashCode() {
        return m19294a(this.f18301b) + m19294a(this.f18302c) + m19294a(this.f18303d) + m19294a(this.f18304e) + m19294a(this.f18305f);
    }

    /* renamed from: a */
    private static int m19294a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6214f fVar = (C6214f) obj;
        if (!TextUtils.equals(this.f18301b, fVar.f18301b) || !TextUtils.equals(this.f18302c, fVar.f18302c) || !TextUtils.equals(this.f18303d, fVar.f18303d) || !TextUtils.equals(this.f18304e, fVar.f18304e) || !TextUtils.equals(this.f18305f, fVar.f18305f)) {
            return false;
        }
        return true;
    }

    public C6214f(String str, String str2, String str3, String str4, String str5) {
        this.f18301b = str;
        this.f18302c = str2;
        this.f18303d = str3;
        this.f18304e = str4;
        this.f18305f = str5;
    }

    public C6214f(long j, String str, String str2, String str3, String str4, String str5) {
        this.f18300a = j;
        this.f18301b = str;
        this.f18302c = str2;
        this.f18303d = str3;
        this.f18304e = str4;
        this.f18305f = str5;
    }
}
