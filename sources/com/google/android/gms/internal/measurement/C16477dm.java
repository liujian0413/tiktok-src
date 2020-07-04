package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15349d;

/* renamed from: com.google.android.gms.internal.measurement.dm */
final class C16477dm extends C16454b {

    /* renamed from: c */
    private final /* synthetic */ Activity f46105c;

    /* renamed from: d */
    private final /* synthetic */ C16455c f46106d;

    C16477dm(C16455c cVar, Activity activity) {
        this.f46106d = cVar;
        this.f46105c = activity;
        super(C16452cr.this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo42641b() throws RemoteException {
        C16452cr.this.f46025j.mo42612e(C15349d.m44668a(this.f46105c), this.f46030b);
    }
}
