package com.p280ss.android.ttplatformsdk.p911b;

import android.text.TextUtils;

/* renamed from: com.ss.android.ttplatformsdk.b.a */
public final class C20426a {

    /* renamed from: a */
    public String f55156a;

    /* renamed from: b */
    public String f55157b;

    /* renamed from: c */
    public String f55158c;

    /* renamed from: d */
    public String f55159d;

    /* renamed from: e */
    public String f55160e;

    /* renamed from: f */
    public String f55161f;

    /* renamed from: g */
    public String f55162g;

    /* renamed from: h */
    public String f55163h;

    /* renamed from: i */
    public String f55164i;

    /* renamed from: j */
    public int f55165j;

    /* renamed from: k */
    public int f55166k;

    /* renamed from: com.ss.android.ttplatformsdk.b.a$a */
    public static class C20428a {

        /* renamed from: a */
        public C20426a f55167a = new C20426a();

        /* renamed from: b */
        public final C20428a mo54973b(String str) {
            this.f55167a.f55161f = str;
            return this;
        }

        /* renamed from: c */
        public final C20428a mo54974c(String str) {
            this.f55167a.f55162g = str;
            return this;
        }

        /* renamed from: d */
        public final C20428a mo54975d(String str) {
            this.f55167a.f55163h = str;
            return this;
        }

        /* renamed from: e */
        public final C20428a mo54976e(String str) {
            this.f55167a.f55164i = str;
            return this;
        }

        /* renamed from: a */
        public final C20428a mo54972a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f55167a.f55157b = str;
                return this;
            }
            throw new IllegalArgumentException("titleBarTitleText is empty");
        }
    }

    private C20426a() {
    }
}
