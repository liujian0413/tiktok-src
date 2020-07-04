package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.C16425br;
import com.google.android.gms.internal.measurement.C16430bw;

public final class AnalyticsService extends Service implements C16430bw {

    /* renamed from: a */
    private C16425br<AnalyticsService> f38583a;

    /* renamed from: a */
    private final C16425br<AnalyticsService> m43328a() {
        if (this.f38583a == null) {
            this.f38583a = new C16425br<>(this);
        }
        return this.f38583a;
    }

    public final void onCreate() {
        super.onCreate();
        m43328a().mo42559a();
    }

    public final void onDestroy() {
        m43328a().mo42563b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return m43328a().mo42558a(intent, i, i2);
    }

    public final IBinder onBind(Intent intent) {
        m43328a();
        return null;
    }

    /* renamed from: a */
    public final boolean mo37960a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: a */
    public final void mo37959a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }
}
