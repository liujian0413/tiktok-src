package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bc */
final class C16410bc implements C16397aq<C16411bd> {

    /* renamed from: a */
    private final C16697t f45947a;

    /* renamed from: b */
    private final C16411bd f45948b = new C16411bd();

    public C16410bc(C16697t tVar) {
        this.f45947a = tVar;
    }

    /* renamed from: a */
    public final void mo42517a(String str, String str2) {
        if ("ga_appName".equals(str)) {
            this.f45948b.f45949a = str2;
        } else if ("ga_appVersion".equals(str)) {
            this.f45948b.f45950b = str2;
        } else if ("ga_logLevel".equals(str)) {
            this.f45948b.f45951c = str2;
        } else {
            this.f45947a.mo43216a().mo43198d("String xml configuration name not recognized", str);
        }
    }

    /* renamed from: a */
    public final void mo42518a(String str, boolean z) {
        if ("ga_dryRun".equals(str)) {
            this.f45948b.f45953e = z ? 1 : 0;
            return;
        }
        this.f45947a.mo43216a().mo43198d("Bool xml configuration name not recognized", str);
    }

    /* renamed from: a */
    public final void mo42516a(String str, int i) {
        if ("ga_dispatchPeriod".equals(str)) {
            this.f45948b.f45952d = i;
        } else {
            this.f45947a.mo43216a().mo43198d("Int xml configuration name not recognized", str);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C16395ao mo42515a() {
        return this.f45948b;
    }
}
