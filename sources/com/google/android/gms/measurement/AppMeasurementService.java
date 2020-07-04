package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C16894dm;
import com.google.android.gms.measurement.internal.C16899dr;

public final class AppMeasurementService extends Service implements C16899dr {

    /* renamed from: a */
    private C16894dm<AppMeasurementService> f46895a;

    /* renamed from: a */
    private final C16894dm<AppMeasurementService> m55340a() {
        if (this.f46895a == null) {
            this.f46895a = new C16894dm<>(this);
        }
        return this.f46895a;
    }

    public final void onCreate() {
        super.onCreate();
        m55340a().mo43812a();
    }

    public final void onDestroy() {
        m55340a().mo43816b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return m55340a().mo43810a(intent, i, i2);
    }

    public final IBinder onBind(Intent intent) {
        return m55340a().mo43811a(intent);
    }

    public final boolean onUnbind(Intent intent) {
        return m55340a().mo43817b(intent);
    }

    public final void onRebind(Intent intent) {
        m55340a().mo43818c(intent);
    }

    /* renamed from: a */
    public final boolean mo43534a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: a */
    public final void mo43532a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo43533a(Intent intent) {
        AppMeasurementReceiver.m2900a(intent);
    }
}
