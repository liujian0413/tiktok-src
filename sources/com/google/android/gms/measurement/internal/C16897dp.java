package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.dp */
final /* synthetic */ class C16897dp implements Runnable {

    /* renamed from: a */
    private final C16894dm f47248a;

    /* renamed from: b */
    private final C16953r f47249b;

    /* renamed from: c */
    private final JobParameters f47250c;

    C16897dp(C16894dm dmVar, C16953r rVar, JobParameters jobParameters) {
        this.f47248a = dmVar;
        this.f47249b = rVar;
        this.f47250c = jobParameters;
    }

    public final void run() {
        this.f47248a.mo43814a(this.f47249b, this.f47250c);
    }
}
