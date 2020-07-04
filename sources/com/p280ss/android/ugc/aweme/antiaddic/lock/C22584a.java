package com.p280ss.android.ugc.aweme.antiaddic.lock;

import com.p280ss.android.ugc.aweme.antiaddic.C22554a;
import com.p280ss.android.ugc.aweme.antiaddic.C22562c;
import com.p280ss.android.ugc.aweme.antiaddic.C22566e;
import com.p280ss.android.ugc.aweme.antiaddic.p1010a.C22555a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.a */
public final class C22584a extends C22554a {

    /* renamed from: a */
    private C22555a f60153a = new C22555a() {
        /* renamed from: a */
        public final C22903bl<Long> mo59195a() {
            return SharePrefCache.inst().getLastLockedTime();
        }
    };

    /* renamed from: b */
    private C22555a f60154b = new C22555a() {
        /* renamed from: a */
        public final C22903bl<Long> mo59195a() {
            return SharePrefCache.inst().getLastUnlockTime();
        }
    };

    /* renamed from: b */
    private static long m74645b() {
        C22562c.m74570a();
        return C22562c.m74573c();
    }

    /* renamed from: a */
    private static C22903bl<Long> m74643a() {
        return SharePrefCache.inst().getTodayVideoPlayTime();
    }

    /* renamed from: a */
    private void m74644a(long j) {
        if (j >= 0 && this.f60154b.mo59197b(System.currentTimeMillis())) {
            if (this.f60153a.mo59197b(System.currentTimeMillis())) {
                m74643a().mo59871a(Long.valueOf(0));
                this.f60153a.mo59196a(System.currentTimeMillis());
            }
            long longValue = ((Long) m74643a().mo59877d()).longValue() + j;
            m74643a().mo59871a(Long.valueOf(longValue));
            if (longValue > m74645b()) {
                C22603f.m74725b();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo59194a(long j, long j2) {
        if (TimeLockRuler.isRuleValid() && TimeLockRuler.isTimeLockOn()) {
            m74644a((long) C22566e.m74601d());
        }
        return false;
    }
}
