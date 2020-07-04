package com.p280ss.android.ugc.aweme.antiaddic.relieveaweme;

import com.p280ss.android.ugc.aweme.antiaddic.C22554a;
import com.p280ss.android.ugc.aweme.antiaddic.C22562c;
import com.p280ss.android.ugc.aweme.antiaddic.p1010a.C22555a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.relieveaweme.a */
public final class C22660a extends C22554a {

    /* renamed from: a */
    private C22555a f60319a = new C22555a() {
        /* renamed from: a */
        public final C22903bl<Long> mo59195a() {
            return SharePrefCache.inst().getLastGetRelieveAwemeTime();
        }
    };

    /* renamed from: a */
    public final boolean mo59194a(long j, long j2) {
        if (!C22562c.m74574h() || !C22562c.m74570a().mo59205a(j, j2) || !this.f60319a.mo59197b(j)) {
            return false;
        }
        this.f60319a.mo59196a(j);
        C22562c.m74570a().f60109a = true;
        return true;
    }
}
