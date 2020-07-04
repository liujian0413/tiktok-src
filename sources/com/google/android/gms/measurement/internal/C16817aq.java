package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.aq */
final class C16817aq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16825ay f46964a;

    /* renamed from: b */
    private final /* synthetic */ long f46965b;

    /* renamed from: c */
    private final /* synthetic */ Bundle f46966c;

    /* renamed from: d */
    private final /* synthetic */ Context f46967d;

    /* renamed from: e */
    private final /* synthetic */ C16953r f46968e;

    /* renamed from: f */
    private final /* synthetic */ PendingResult f46969f;

    C16817aq(C16815ao aoVar, C16825ay ayVar, long j, Bundle bundle, Context context, C16953r rVar, PendingResult pendingResult) {
        this.f46964a = ayVar;
        this.f46965b = j;
        this.f46966c = bundle;
        this.f46967d = context;
        this.f46968e = rVar;
        this.f46969f = pendingResult;
    }

    public final void run() {
        long a = this.f46964a.mo43658b().f46922h.mo43614a();
        long j = this.f46965b;
        if (a > 0 && (j >= a || j <= 0)) {
            j = a - 1;
        }
        if (j > 0) {
            this.f46966c.putLong("click_timestamp", j);
        }
        this.f46966c.putString("_cis", "referrer broadcast");
        C16825ay.m55497a(this.f46967d, (C16948m) null).mo43661e().mo43731a("auto", "_cmp", this.f46966c);
        this.f46968e.f47495i.mo44160a("Install campaign recorded");
        if (this.f46969f != null) {
            this.f46969f.finish();
        }
    }
}
