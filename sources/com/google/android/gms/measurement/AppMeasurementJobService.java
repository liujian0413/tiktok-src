package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C16894dm;
import com.google.android.gms.measurement.internal.C16899dr;

public final class AppMeasurementJobService extends JobService implements C16899dr {

    /* renamed from: a */
    private C16894dm<AppMeasurementJobService> f46893a;

    /* renamed from: a */
    private final C16894dm<AppMeasurementJobService> m55334a() {
        if (this.f46893a == null) {
            this.f46893a = new C16894dm<>(this);
        }
        return this.f46893a;
    }

    /* renamed from: a */
    public final void mo43533a(Intent intent) {
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final void onCreate() {
        super.onCreate();
        m55334a().mo43812a();
    }

    public final void onDestroy() {
        m55334a().mo43816b();
        super.onDestroy();
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return m55334a().mo43815a(jobParameters);
    }

    public final boolean onUnbind(Intent intent) {
        return m55334a().mo43817b(intent);
    }

    public final void onRebind(Intent intent) {
        m55334a().mo43818c(intent);
    }

    /* renamed from: a */
    public final boolean mo43534a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo43532a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
