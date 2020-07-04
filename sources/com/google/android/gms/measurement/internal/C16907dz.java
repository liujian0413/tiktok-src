package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.C15322e;
import com.google.android.gms.internal.measurement.C16436cb;

/* renamed from: com.google.android.gms.measurement.internal.dz */
public final class C16907dz extends C16911ec {

    /* renamed from: b */
    private final AlarmManager f47268b = ((AlarmManager) mo43581m().getSystemService("alarm"));

    /* renamed from: c */
    private final C16939fc f47269c;

    /* renamed from: d */
    private Integer f47270d;

    protected C16907dz(C16912ed edVar) {
        super(edVar);
        this.f47269c = new C16909ea(this, edVar.f47278a, edVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo43637d() {
        this.f47268b.cancel(m55821w());
        if (VERSION.SDK_INT >= 24) {
            m55819u();
        }
        return false;
    }

    /* renamed from: u */
    private final void m55819u() {
        JobScheduler jobScheduler = (JobScheduler) mo43581m().getSystemService("jobscheduler");
        int v = m55820v();
        mo43585q().f47495i.mo44161a("Cancelling job. JobID", Integer.valueOf(v));
        jobScheduler.cancel(v);
    }

    /* renamed from: a */
    public final void mo43837a(long j) {
        mo43843j();
        Context m = mo43581m();
        if (!C16815ao.m55432a(m)) {
            mo43585q().f47494h.mo44160a("Receiver not registered/enabled");
        }
        if (!C16922em.m55960a(m, false)) {
            mo43585q().f47494h.mo44160a("Service not registered/enabled");
        }
        mo43838e();
        long b = mo43580l().mo38685b() + j;
        if (j < Math.max(0, ((Long) C16942h.f47385F.mo44132a()).longValue()) && !this.f47269c.mo44127b()) {
            mo43585q().f47495i.mo44160a("Scheduling upload with DelayedRunnable");
            this.f47269c.mo44126a(j);
        }
        if (VERSION.SDK_INT >= 24) {
            mo43585q().f47495i.mo44160a("Scheduling upload with JobScheduler");
            Context m2 = mo43581m();
            ComponentName componentName = new ComponentName(m2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int v = m55820v();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            JobInfo build = new Builder(v, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
            mo43585q().f47495i.mo44161a("Scheduling job. JobID", Integer.valueOf(v));
            C16436cb.m53564a(m2, build, "com.google.android.gms", "UploadAlarm");
            return;
        }
        mo43585q().f47495i.mo44160a("Scheduling upload with AlarmManager");
        this.f47268b.setInexactRepeating(2, b, Math.max(((Long) C16942h.f47380A.mo44132a()).longValue(), j), m55821w());
    }

    /* renamed from: v */
    private final int m55820v() {
        if (this.f47270d == null) {
            String str = "measurement";
            String valueOf = String.valueOf(mo43581m().getPackageName());
            this.f47270d = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.f47270d.intValue();
    }

    /* renamed from: e */
    public final void mo43838e() {
        mo43843j();
        this.f47268b.cancel(m55821w());
        this.f47269c.mo44128c();
        if (VERSION.SDK_INT >= 24) {
            m55819u();
        }
    }

    /* renamed from: w */
    private final PendingIntent m55821w() {
        Context m = mo43581m();
        return PendingIntent.getBroadcast(m, 0, new Intent().setClassName(m, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C16919ej mo43639f() {
        return super.mo43639f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C16927er mo43641g() {
        return super.mo43641g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C16933ex mo43643h() {
        return super.mo43643h();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo43566a() {
        super.mo43566a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo43569b() {
        super.mo43569b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43571c() {
        super.mo43571c();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C16827b mo43579k() {
        return super.mo43579k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15322e mo43580l() {
        return super.mo43580l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43581m() {
        return super.mo43581m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C16951p mo43582n() {
        return super.mo43582n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C16922em mo43583o() {
        return super.mo43583o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C16820at mo43584p() {
        return super.mo43584p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C16953r mo43585q() {
        return super.mo43585q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16806af mo43586r() {
        return super.mo43586r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C16930eu mo43587s() {
        return super.mo43587s();
    }
}
