package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.dg */
final class C16471dg extends C16454b {

    /* renamed from: c */
    private final /* synthetic */ String f46083c;

    /* renamed from: d */
    private final /* synthetic */ C16453a f46084d;

    /* renamed from: e */
    private final /* synthetic */ C16452cr f46085e;

    C16471dg(C16452cr crVar, String str, C16453a aVar) {
        this.f46085e = crVar;
        this.f46083c = str;
        this.f46084d = aVar;
        super(crVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo42641b() throws RemoteException {
        this.f46085e.f46025j.mo42591a(this.f46083c, (C16443ci) this.f46084d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42640a() {
        this.f46084d.mo42616a((Bundle) null);
    }
}
