package com.google.android.gms.analytics;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C16425br;
import com.google.android.gms.internal.measurement.C16430bw;

public final class AnalyticsJobService extends JobService implements C16430bw {

    /* renamed from: a */
    private C16425br<AnalyticsJobService> f38581a;

    /* renamed from: a */
    private final C16425br<AnalyticsJobService> m43325a() {
        if (this.f38581a == null) {
            this.f38581a = new C16425br<>(this);
        }
        return this.f38581a;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final void onCreate() {
        super.onCreate();
        m43325a().mo42559a();
    }

    public final void onDestroy() {
        m43325a().mo42563b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return m43325a().mo42558a(intent, i, i2);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return m43325a().mo42562a(jobParameters);
    }

    /* renamed from: a */
    public final boolean mo37960a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: a */
    public final void mo37959a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
