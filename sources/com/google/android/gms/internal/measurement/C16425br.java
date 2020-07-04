package com.google.android.gms.internal.measurement;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.measurement.C16430bw;
import com.google.android.gms.stats.C16977a;

/* renamed from: com.google.android.gms.internal.measurement.br */
public final class C16425br<T extends Context & C16430bw> {

    /* renamed from: c */
    private static Boolean f45983c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f45984a = new C16439ce();

    /* renamed from: b */
    private final T f45985b;

    public C16425br(T t) {
        C15267r.m44384a(t);
        this.f45985b = t;
    }

    /* renamed from: a */
    public static boolean m53533a(Context context) {
        C15267r.m44384a(context);
        if (f45983c != null) {
            return f45983c.booleanValue();
        }
        boolean a = C16432by.m53551a(context, "com.google.android.gms.analytics.AnalyticsService");
        f45983c = Boolean.valueOf(a);
        return a;
    }

    /* renamed from: a */
    public final void mo42559a() {
        C16697t.m54864a((Context) this.f45985b).mo43216a().mo43190b("Local AnalyticsService is starting up");
    }

    /* renamed from: b */
    public final void mo42563b() {
        C16697t.m54864a((Context) this.f45985b).mo43216a().mo43190b("Local AnalyticsService is shutting down");
    }

    /* renamed from: a */
    public final int mo42558a(Intent intent, int i, int i2) {
        try {
            synchronized (C16424bq.f45980a) {
                C16977a aVar = C16424bq.f45981b;
                if (aVar != null && aVar.mo44201b()) {
                    aVar.mo44198a();
                }
            }
        } catch (SecurityException unused) {
        }
        C16416bi a = C16697t.m54864a((Context) this.f45985b).mo43216a();
        if (intent == null) {
            a.mo43200e("AnalyticsService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a.mo43188a("Local AnalyticsService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            m53532a((Runnable) new C16426bs(this, i2, a));
        }
        return 2;
    }

    /* renamed from: a */
    private final void m53532a(Runnable runnable) {
        C16697t.m54864a((Context) this.f45985b).mo43218c().mo43175a((C16404ax) new C16429bv(this, runnable));
    }

    /* renamed from: a */
    public final boolean mo42562a(JobParameters jobParameters) {
        C16416bi a = C16697t.m54864a((Context) this.f45985b).mo43216a();
        String string = jobParameters.getExtras().getString("action");
        a.mo43187a("Local AnalyticsJobService called. action", string);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            m53532a((Runnable) new C16427bt(this, a, jobParameters));
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo42561a(C16416bi biVar, JobParameters jobParameters) {
        biVar.mo43190b("AnalyticsJobService processed last dispatch request");
        ((C16430bw) this.f45985b).mo37959a(jobParameters, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo42560a(int i, C16416bi biVar) {
        if (((C16430bw) this.f45985b).mo37960a(i)) {
            biVar.mo43190b("Local AnalyticsService processed last dispatch request");
        }
    }
}
