package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15349d;

/* renamed from: com.google.android.gms.internal.measurement.dq */
final class C16481dq extends C16454b {

    /* renamed from: c */
    private final /* synthetic */ Activity f46112c;

    /* renamed from: d */
    private final /* synthetic */ C16453a f46113d;

    /* renamed from: e */
    private final /* synthetic */ C16455c f46114e;

    C16481dq(C16455c cVar, Activity activity, C16453a aVar) {
        this.f46114e = cVar;
        this.f46112c = activity;
        this.f46113d = aVar;
        super(C16452cr.this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo42641b() throws RemoteException {
        C16452cr.this.f46025j.mo42583a(C15349d.m44668a(this.f46112c), (C16443ci) this.f46113d, this.f46030b);
    }
}
