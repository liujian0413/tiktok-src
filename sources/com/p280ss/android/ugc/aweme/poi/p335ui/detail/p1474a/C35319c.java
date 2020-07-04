package com.p280ss.android.ugc.aweme.poi.p335ui.detail.p1474a;

import com.p280ss.android.ugc.aweme.poi.p335ui.detail.C35321b;
import com.p280ss.android.ugc.aweme.util.C42878g;
import com.p280ss.android.ugc.aweme.util.C42878g.C42879a;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.a.c */
public final class C35319c extends C35317a {

    /* renamed from: b */
    private boolean f92591b;

    /* renamed from: c */
    private C42878g f92592c;

    /* renamed from: d */
    private C35321b f92593d;

    /* renamed from: b */
    public final boolean mo89876b() {
        return true;
    }

    /* renamed from: d */
    public final int mo89878d() {
        return 1;
    }

    /* renamed from: a */
    public final boolean mo89874a() {
        if (this.f92591b) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo89882h() {
        if (this.f92592c != null) {
            this.f92592c.mo104583a();
        }
        this.f92593d = null;
    }

    /* renamed from: c */
    public final void mo89877c() {
        C42878g gVar = new C42878g(7000, 7000, new C42879a() {
            /* renamed from: a */
            public final void mo89893a() {
                C35319c.this.mo89873a(true);
            }
        });
        this.f92592c = gVar;
        this.f92592c.mo104584b();
    }

    /* renamed from: f */
    public final void mo89880f() {
        if (this.f92592c != null && !this.f92592c.mo104588f() && !this.f92592c.mo104587e()) {
            this.f92592c.mo104585c();
        }
    }

    /* renamed from: g */
    public final void mo89881g() {
        if (this.f92593d != null && this.f92591b && !this.f92586a) {
            this.f92593d.bu_();
        }
    }

    /* renamed from: e */
    public final void mo89879e() {
        if (this.f92592c != null && this.f92592c.mo104589g() && !this.f92592c.mo104588f() && !this.f92592c.mo104587e()) {
            this.f92592c.mo104586d();
        }
        this.f92586a = false;
        mo89881g();
    }

    /* renamed from: a */
    public final void mo89873a(boolean z) {
        this.f92591b = true;
        mo89881g();
    }

    public C35319c(String str, C35321b bVar) {
        super(str);
        this.f92593d = bVar;
    }
}
