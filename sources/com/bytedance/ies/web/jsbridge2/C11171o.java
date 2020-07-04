package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;

/* renamed from: com.bytedance.ies.web.jsbridge2.o */
final class C11171o {

    /* renamed from: a */
    int f30309a;

    /* renamed from: b */
    String f30310b;

    /* renamed from: c */
    String f30311c;

    /* renamed from: d */
    String f30312d;

    /* renamed from: e */
    String f30313e;

    /* renamed from: f */
    String f30314f;

    /* renamed from: com.bytedance.ies.web.jsbridge2.o$a */
    static final class C11173a {

        /* renamed from: a */
        public String f30315a;

        /* renamed from: b */
        public String f30316b;

        /* renamed from: c */
        public String f30317c;

        /* renamed from: d */
        public String f30318d;

        /* renamed from: e */
        public String f30319e;

        private C11173a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C11171o mo27197a() {
            return new C11171o(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C11173a mo27196a(String str) {
            this.f30315a = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C11173a mo27198b(String str) {
            this.f30316b = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final C11173a mo27199c(String str) {
            this.f30317c = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final C11173a mo27200d(String str) {
            this.f30318d = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final C11173a mo27201e(String str) {
            this.f30319e = str;
            return this;
        }
    }

    private C11171o() {
        this.f30309a = 1;
    }

    /* renamed from: a */
    static C11173a m32702a() {
        return new C11173a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("methodName: ");
        sb.append(this.f30312d);
        sb.append(", params: ");
        sb.append(this.f30313e);
        sb.append(", callbackId: ");
        sb.append(this.f30314f);
        sb.append(", type: ");
        sb.append(this.f30311c);
        sb.append(", version: ");
        sb.append(this.f30310b);
        sb.append(", ");
        return sb.toString();
    }

    private C11171o(C11173a aVar) {
        this.f30309a = 1;
        this.f30310b = aVar.f30315a;
        this.f30311c = aVar.f30316b;
        this.f30312d = aVar.f30317c;
        this.f30313e = aVar.f30318d;
        this.f30314f = aVar.f30319e;
    }

    /* renamed from: a */
    static boolean m32704a(C11171o oVar) {
        if (oVar == null || oVar.f30309a != 1 || TextUtils.isEmpty(oVar.f30312d) || TextUtils.isEmpty(oVar.f30313e)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static C11171o m32703a(String str, int i) {
        C11171o oVar = new C11171o();
        oVar.f30309a = -1;
        oVar.f30314f = str;
        return oVar;
    }
}
