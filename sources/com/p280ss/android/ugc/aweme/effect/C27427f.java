package com.p280ss.android.ugc.aweme.effect;

import android.app.job.JobParameters;
import bolts.C1591g;
import bolts.C1592h;

/* renamed from: com.ss.android.ugc.aweme.effect.f */
final /* synthetic */ class C27427f implements C1591g {

    /* renamed from: a */
    private final EffectCompatJobService f72344a;

    /* renamed from: b */
    private final JobParameters f72345b;

    C27427f(EffectCompatJobService effectCompatJobService, JobParameters jobParameters) {
        this.f72344a = effectCompatJobService;
        this.f72345b = jobParameters;
    }

    public final Object then(C1592h hVar) {
        return this.f72344a.mo70344a(this.f72345b, hVar);
    }
}
