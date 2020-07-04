package com.google.android.gms.internal.measurement;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.internal.measurement.aw */
public final class C16403aw extends C16695r {

    /* renamed from: b */
    public boolean f45896b;

    /* renamed from: c */
    public boolean f45897c;

    /* renamed from: d */
    private final AlarmManager f45898d = ((AlarmManager) mo43204h().getSystemService("alarm"));

    /* renamed from: e */
    private Integer f45899e;

    protected C16403aw(C16697t tVar) {
        super(tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42476a() {
        try {
            mo42529c();
            if (C16398ar.m53433e() > 0) {
                Context h = mo43204h();
                ActivityInfo receiverInfo = h.getPackageManager().getReceiverInfo(new ComponentName(h, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo != null && receiverInfo.enabled) {
                    mo43190b("Receiver registered for local dispatch.");
                    this.f45896b = true;
                }
            }
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: b */
    public final void mo42528b() {
        mo43214s();
        C15267r.m44391a(this.f45896b, (Object) "Receiver not registered");
        long e = C16398ar.m53433e();
        if (e > 0) {
            mo42529c();
            long b = mo43203g().mo38685b() + e;
            this.f45897c = true;
            ((Boolean) C16406az.f45905F.f45945a).booleanValue();
            if (VERSION.SDK_INT >= 24) {
                mo43190b("Scheduling upload with JobScheduler");
                Context h = mo43204h();
                ComponentName componentName = new ComponentName(h, "com.google.android.gms.analytics.AnalyticsJobService");
                int e2 = m53455e();
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                JobInfo build = new Builder(e2, componentName).setMinimumLatency(e).setOverrideDeadline(e << 1).setExtras(persistableBundle).build();
                mo43187a("Scheduling job. JobID", Integer.valueOf(e2));
                C16436cb.m53564a(h, build, "com.google.android.gms", "DispatchAlarm");
                return;
            }
            mo43190b("Scheduling upload with AlarmManager");
            this.f45898d.setInexactRepeating(2, b, e, m53454d());
        }
    }

    /* renamed from: d */
    private final PendingIntent m53454d() {
        Context h = mo43204h();
        return PendingIntent.getBroadcast(h, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(h, "com.google.android.gms.analytics.AnalyticsReceiver")), 0);
    }

    /* renamed from: c */
    public final void mo42529c() {
        this.f45897c = false;
        this.f45898d.cancel(m53454d());
        if (VERSION.SDK_INT >= 24) {
            JobScheduler jobScheduler = (JobScheduler) mo43204h().getSystemService("jobscheduler");
            int e = m53455e();
            mo43187a("Cancelling job. JobID", Integer.valueOf(e));
            jobScheduler.cancel(e);
        }
    }

    /* renamed from: e */
    private final int m53455e() {
        if (this.f45899e == null) {
            String str = "analytics";
            String valueOf = String.valueOf(mo43204h().getPackageName());
            this.f45899e = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.f45899e.intValue();
    }
}
