package com.p280ss.android.ugc.aweme.antiaddic;

import com.p280ss.android.ugc.aweme.antiaddic.p1010a.C22556b;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.f */
public final class C22569f extends C22554a {

    /* renamed from: a */
    private C22556b f60129a = new C22556b();

    /* renamed from: a */
    public final boolean mo59194a(long j, long j2) {
        if (C22562c.m74575i() && this.f60129a.mo59199b(j) && j2 > C22556b.m74560a() && C22556b.m74560a() > 0) {
            this.f60129a.mo59198a(j);
            long a = ((j2 / C22556b.m74560a()) * C22556b.m74560a()) / 60000;
            C22562c.m74570a().f60111c = String.valueOf(a);
        }
        return false;
    }
}
