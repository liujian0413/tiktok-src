package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.df */
final class C16470df extends C16454b {

    /* renamed from: c */
    private final /* synthetic */ Bundle f46080c;

    /* renamed from: d */
    private final /* synthetic */ C16453a f46081d;

    /* renamed from: e */
    private final /* synthetic */ C16452cr f46082e;

    C16470df(C16452cr crVar, Bundle bundle, C16453a aVar) {
        this.f46082e = crVar;
        this.f46080c = bundle;
        this.f46081d = aVar;
        super(crVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo42641b() throws RemoteException {
        this.f46082e.f46025j.mo42580a(this.f46080c, (C16443ci) this.f46081d, this.f46029a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42640a() {
        this.f46081d.mo42616a((Bundle) null);
    }
}
