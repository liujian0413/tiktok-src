package com.bytedance.android.p089a.p099b.p104d;

import com.bytedance.android.p089a.p090a.p095e.C2222b;
import com.bytedance.android.p089a.p099b.C2236a;
import com.bytedance.android.p089a.p099b.p104d.p105a.C2256a;
import com.bytedance.android.p089a.p099b.p104d.p106b.C2258a;
import com.bytedance.android.p089a.p099b.p104d.p107c.C2259a;
import java.util.List;

/* renamed from: com.bytedance.android.a.b.d.a */
public final class C2255a implements C2257b {

    /* renamed from: a */
    private C2236a f7528a;

    /* renamed from: b */
    private int f7529b;

    /* renamed from: c */
    private C2257b f7530c = m9675b(this.f7529b);

    /* renamed from: b */
    public final List<C2222b> mo8000b() {
        return this.f7530c.mo8000b();
    }

    /* renamed from: c */
    public final List<C2222b> mo8002c() {
        return this.f7530c.mo8002c();
    }

    /* renamed from: d */
    public final void mo8004d() {
        this.f7530c.mo8004d();
    }

    /* renamed from: a */
    public final void mo7997a() {
        this.f7530c.mo7997a();
    }

    /* renamed from: a */
    public final List<C2222b> mo7996a(List<C2222b> list) {
        return this.f7530c.mo7996a(list);
    }

    /* renamed from: b */
    public final void mo8001b(C2222b bVar) {
        this.f7530c.mo8001b(bVar);
    }

    /* renamed from: c */
    public final void mo8003c(C2222b bVar) {
        this.f7530c.mo8003c(bVar);
    }

    public C2255a(C2236a aVar) {
        this.f7528a = aVar;
        this.f7529b = aVar.f7488a.f7520d;
    }

    /* renamed from: a */
    public final boolean mo7999a(C2222b bVar) {
        return this.f7530c.mo7999a(bVar);
    }

    /* renamed from: b */
    private static C2257b m9675b(int i) {
        switch (i) {
            case 0:
                return new C2259a();
            case 1:
                return new C2256a();
            case 2:
                return new C2258a();
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final void mo7998a(int i) {
        if (i != this.f7529b || this.f7530c == null) {
            C2257b b = m9675b(i);
            if (b != null) {
                C2257b bVar = this.f7530c;
                List list = null;
                if (bVar != null) {
                    list = bVar.mo8000b();
                    bVar.mo7997a();
                    bVar.mo8004d();
                }
                this.f7530c = b;
                if (list != null) {
                    this.f7530c.mo7996a(list);
                }
            }
        }
    }
}
