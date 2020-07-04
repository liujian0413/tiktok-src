package com.p280ss.optimizer.live.sdk.base;

import com.p280ss.optimizer.live.sdk.base.C45885c.C45887a;

/* renamed from: com.ss.optimizer.live.sdk.base.d */
public class C45889d {

    /* renamed from: d */
    private static volatile C45889d f117305d;

    /* renamed from: a */
    public final C45895f f117306a = new C45895f();

    /* renamed from: b */
    public C45883a f117307b;

    /* renamed from: c */
    public C45890e f117308c;

    /* renamed from: e */
    private C45885c f117309e;

    public C45889d() {
        mo111168a(new C45887a().mo111167a());
    }

    /* renamed from: a */
    public static C45889d m143985a() {
        if (f117305d == null) {
            synchronized (C45889d.class) {
                if (f117305d == null) {
                    f117305d = new C45889d();
                }
            }
        }
        return f117305d;
    }

    /* renamed from: a */
    public final void mo111168a(C45885c cVar) {
        if (cVar != null) {
            this.f117309e = cVar;
            this.f117307b = new C45883a(this.f117309e);
            this.f117308c = new C45890e(this.f117306a, this.f117307b);
        }
    }
}
