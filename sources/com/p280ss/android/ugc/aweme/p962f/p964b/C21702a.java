package com.p280ss.android.ugc.aweme.p962f.p964b;

import com.p280ss.android.ugc.aweme.app.C22903bl;

/* renamed from: com.ss.android.ugc.aweme.f.b.a */
public abstract class C21702a {

    /* renamed from: a */
    private long f58122a;

    /* renamed from: b */
    private int f58123b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C22903bl<Long> mo57969a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C22903bl<Integer> mo57971b();

    /* renamed from: a */
    public final void mo57970a(long j) {
        mo57969a().mo59871a(Long.valueOf(j));
        mo57971b().mo59871a(Integer.valueOf(((Integer) mo57971b().mo59877d()).intValue() + 1));
    }

    /* renamed from: b */
    public final boolean mo57972b(long j) {
        if (j - ((Long) mo57969a().mo59877d()).longValue() <= this.f58122a * 1000 || ((Integer) mo57971b().mo59877d()).intValue() >= this.f58123b) {
            return false;
        }
        return true;
    }
}
