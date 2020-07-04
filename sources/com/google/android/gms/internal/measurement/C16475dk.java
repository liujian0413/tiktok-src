package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15349d;

/* renamed from: com.google.android.gms.internal.measurement.dk */
final class C16475dk extends C16454b {

    /* renamed from: c */
    private final /* synthetic */ Activity f46100c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f46101d;

    /* renamed from: e */
    private final /* synthetic */ C16455c f46102e;

    C16475dk(C16455c cVar, Activity activity, Bundle bundle) {
        this.f46102e = cVar;
        this.f46100c = activity;
        this.f46101d = bundle;
        super(C16452cr.this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo42641b() throws RemoteException {
        C16452cr.this.f46025j.mo42582a(C15349d.m44668a(this.f46100c), this.f46101d, this.f46030b);
    }
}
