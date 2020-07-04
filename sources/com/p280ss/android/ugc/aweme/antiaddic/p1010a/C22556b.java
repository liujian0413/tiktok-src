package com.p280ss.android.ugc.aweme.antiaddic.p1010a;

import com.p280ss.android.ugc.aweme.antiaddic.C22562c;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.a.b */
public final class C22556b {

    /* renamed from: a */
    public int f60102a;

    /* renamed from: b */
    private long f60103b = System.currentTimeMillis();

    /* renamed from: a */
    public static long m74560a() {
        return C22562c.m74570a().mo59206d();
    }

    /* renamed from: a */
    public final void mo59198a(long j) {
        this.f60103b = j;
        this.f60102a++;
    }

    /* renamed from: b */
    public final boolean mo59199b(long j) {
        long a = m74560a();
        if (a >= 0 && j - this.f60103b > a) {
            return true;
        }
        return false;
    }
}
