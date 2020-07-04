package com.bytedance.frameworks.core.apm;

import com.bytedance.apm.p245h.C6214f;
import com.bytedance.frameworks.core.apm.p257a.p259b.C6359c;

/* renamed from: com.bytedance.frameworks.core.apm.a */
public final class C6348a {

    /* renamed from: a */
    public long f18618a;

    /* renamed from: b */
    private C6359c f18619b = C6360b.m19768a().f18643b;

    /* renamed from: c */
    private C6214f f18620c;

    /* renamed from: com.bytedance.frameworks.core.apm.a$a */
    static class C6349a {

        /* renamed from: a */
        public static final C6348a f18621a = new C6348a();
    }

    /* renamed from: a */
    public static C6348a m19690a() {
        return C6349a.f18621a;
    }

    protected C6348a() {
    }

    /* renamed from: b */
    private void m19691b() {
        if (this.f18620c != null) {
            C6214f f = this.f18619b.mo15260f();
            if (f == null || !f.equals(this.f18620c)) {
                this.f18618a = this.f18619b.mo15265a(this.f18620c);
            } else {
                this.f18618a = f.f18300a;
            }
        }
    }

    /* renamed from: a */
    public final C6214f mo15234a(long j) {
        return this.f18619b.mo15266b(j);
    }

    /* renamed from: a */
    public final void mo15235a(C6214f fVar) {
        this.f18620c = fVar;
        m19691b();
    }
}
