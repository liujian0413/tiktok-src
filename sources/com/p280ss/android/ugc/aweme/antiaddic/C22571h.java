package com.p280ss.android.ugc.aweme.antiaddic;

import com.p280ss.android.ugc.aweme.antiaddic.p1010a.C22557c;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.h */
public final class C22571h extends C22554a {

    /* renamed from: a */
    public C22557c f60130a = new C22557c();

    /* renamed from: b */
    private int f60131b = 60000;

    /* renamed from: a */
    public final boolean mo59194a(long j, long j2) {
        if (this.f60130a.mo59202b(j) && j2 > C22557c.m74563a() && C22557c.m74563a() > 0) {
            this.f60130a.mo59200a(j);
            long a = (C22557c.m74563a() * ((long) this.f60130a.f60104a)) / ((long) this.f60131b);
            C22562c.m74570a().f60111c = String.valueOf(a);
        }
        return false;
    }
}
