package com.p280ss.android.ugc.aweme.p313im.service.p326f;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.im.service.f.a */
public abstract class C7102a {

    /* renamed from: e */
    public String f19941e;

    /* renamed from: f */
    public Object f19942f;

    /* renamed from: g */
    public String f19943g;

    /* renamed from: h */
    public String f19944h;

    /* renamed from: i */
    public long f19945i;

    /* renamed from: j */
    public int f19946j;

    /* renamed from: k */
    public int f19947k;

    /* renamed from: l */
    public int f19948l;

    /* renamed from: m */
    public HashMap<String, String> f19949m;

    /* renamed from: n */
    public boolean f19950n;

    /* renamed from: o */
    public boolean f19951o;

    /* renamed from: p */
    public C32013b f19952p = mo18114a();

    /* renamed from: a */
    public abstract C32013b mo18114a();

    /* renamed from: b */
    public abstract int mo18115b();

    public abstract String bf_();

    public int bg_() {
        return 0;
    }

    /* renamed from: d */
    public abstract void mo18120d();

    public C7102a() {
        mo18120d();
    }

    /* renamed from: h */
    public final boolean mo18371h() {
        if (mo18115b() == 0 || mo18115b() == 20) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo18368a(long j) {
        if (j < 10000000000L) {
            this.f19945i = j * 1000;
        } else {
            this.f19945i = j;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7102a) || !TextUtils.equals(this.f19941e, ((C7102a) obj).f19941e)) {
            return false;
        }
        return true;
    }
}
