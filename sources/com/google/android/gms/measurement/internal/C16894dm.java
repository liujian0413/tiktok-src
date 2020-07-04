package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.measurement.internal.C16899dr;

/* renamed from: com.google.android.gms.measurement.internal.dm */
public final class C16894dm<T extends Context & C16899dr> {

    /* renamed from: a */
    private final T f47242a;

    public C16894dm(T t) {
        C15267r.m44384a(t);
        this.f47242a = t;
    }

    /* renamed from: a */
    public final void mo43812a() {
        C16825ay.m55497a((Context) this.f47242a, (C16948m) null).mo43585q().f47495i.mo44160a("Local AppMeasurementService is starting up");
    }

    /* renamed from: b */
    public final void mo43816b() {
        C16825ay.m55497a((Context) this.f47242a, (C16948m) null).mo43585q().f47495i.mo44160a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: a */
    public final int mo43810a(Intent intent, int i, int i2) {
        C16953r q = C16825ay.m55497a((Context) this.f47242a, (C16948m) null).mo43585q();
        if (intent == null) {
            q.f47490d.mo44160a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        q.f47495i.mo44162a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m55760a((Runnable) new C16895dn(this, i2, q, intent));
        }
        return 2;
    }

    /* renamed from: a */
    private final void m55760a(Runnable runnable) {
        C16912ed a = C16912ed.m55850a((Context) this.f47242a);
        a.mo43584p().mo43645a((Runnable) new C16898dq(this, a, runnable));
    }

    /* renamed from: a */
    public final IBinder mo43811a(Intent intent) {
        if (intent == null) {
            m55761c().f47487a.mo44160a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C16828ba(C16912ed.m55850a((Context) this.f47242a));
        }
        m55761c().f47490d.mo44161a("onBind received unknown action", action);
        return null;
    }

    /* renamed from: b */
    public final boolean mo43817b(Intent intent) {
        if (intent == null) {
            m55761c().f47487a.mo44160a("onUnbind called with null intent");
            return true;
        }
        m55761c().f47495i.mo44161a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    /* renamed from: a */
    public final boolean mo43815a(JobParameters jobParameters) {
        C16953r q = C16825ay.m55497a((Context) this.f47242a, (C16948m) null).mo43585q();
        String string = jobParameters.getExtras().getString("action");
        q.f47495i.mo44161a("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            m55760a((Runnable) new C16897dp(this, q, jobParameters));
        }
        return true;
    }

    /* renamed from: c */
    public final void mo43818c(Intent intent) {
        if (intent == null) {
            m55761c().f47487a.mo44160a("onRebind called with null intent");
            return;
        }
        m55761c().f47495i.mo44161a("onRebind called. action", intent.getAction());
    }

    /* renamed from: c */
    private final C16953r m55761c() {
        return C16825ay.m55497a((Context) this.f47242a, (C16948m) null).mo43585q();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo43814a(C16953r rVar, JobParameters jobParameters) {
        rVar.f47495i.mo44160a("AppMeasurementJobService processed last upload request.");
        ((C16899dr) this.f47242a).mo43532a(jobParameters, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo43813a(int i, C16953r rVar, Intent intent) {
        if (((C16899dr) this.f47242a).mo43534a(i)) {
            rVar.f47495i.mo44161a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m55761c().f47495i.mo44160a("Completed wakeful intent.");
            ((C16899dr) this.f47242a).mo43533a(intent);
        }
    }
}
