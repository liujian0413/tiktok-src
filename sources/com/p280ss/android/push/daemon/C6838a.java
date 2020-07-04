package com.p280ss.android.push.daemon;

import com.p280ss.android.push.daemon.C6839b.C6841b;

/* renamed from: com.ss.android.push.daemon.a */
public final class C6838a implements C6841b, C6842e {

    /* renamed from: a */
    private C6839b f19468a;

    /* renamed from: b */
    private C6841b f19469b;

    /* renamed from: c */
    private final String f19470c = "d_permit";

    /* renamed from: d */
    private final String f19471d = "permitted";

    /* renamed from: a */
    public final void mo16702a() {
        if (this.f19469b != null) {
            this.f19469b.mo16702a();
        }
    }

    public C6838a(C6839b bVar) {
        this.f19468a = bVar;
        if (bVar != null) {
            this.f19469b = this.f19468a.f19474c;
            this.f19468a.f19474c = this;
        }
    }
}
