package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.dd */
final class C16468dd extends C16454b {

    /* renamed from: c */
    private final /* synthetic */ String f46069c;

    /* renamed from: d */
    private final /* synthetic */ String f46070d;

    /* renamed from: e */
    private final /* synthetic */ boolean f46071e;

    /* renamed from: f */
    private final /* synthetic */ C16453a f46072f;

    /* renamed from: g */
    private final /* synthetic */ C16452cr f46073g;

    C16468dd(C16452cr crVar, String str, String str2, boolean z, C16453a aVar) {
        this.f46073g = crVar;
        this.f46069c = str;
        this.f46070d = str2;
        this.f46071e = z;
        this.f46072f = aVar;
        super(crVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo42641b() throws RemoteException {
        this.f46073g.f46025j.mo42597a(this.f46069c, this.f46070d, this.f46071e, (C16443ci) this.f46072f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42640a() {
        this.f46072f.mo42616a((Bundle) null);
    }
}
