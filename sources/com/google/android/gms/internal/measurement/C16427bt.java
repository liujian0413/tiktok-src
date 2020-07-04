package com.google.android.gms.internal.measurement;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.internal.measurement.bt */
final /* synthetic */ class C16427bt implements Runnable {

    /* renamed from: a */
    private final C16425br f45989a;

    /* renamed from: b */
    private final C16416bi f45990b;

    /* renamed from: c */
    private final JobParameters f45991c;

    C16427bt(C16425br brVar, C16416bi biVar, JobParameters jobParameters) {
        this.f45989a = brVar;
        this.f45990b = biVar;
        this.f45991c = jobParameters;
    }

    public final void run() {
        this.f45989a.mo42561a(this.f45990b, this.f45991c);
    }
}
