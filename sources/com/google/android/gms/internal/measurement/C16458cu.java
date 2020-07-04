package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.cu */
final class C16458cu extends C16454b {

    /* renamed from: c */
    private final /* synthetic */ String f46043c;

    /* renamed from: d */
    private final /* synthetic */ String f46044d;

    /* renamed from: e */
    private final /* synthetic */ C16453a f46045e;

    /* renamed from: f */
    private final /* synthetic */ C16452cr f46046f;

    C16458cu(C16452cr crVar, String str, String str2, C16453a aVar) {
        this.f46046f = crVar;
        this.f46043c = str;
        this.f46044d = str2;
        this.f46045e = aVar;
        super(crVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo42641b() throws RemoteException {
        this.f46046f.f46025j.mo42596a(this.f46043c, this.f46044d, (C16443ci) this.f46045e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42640a() {
        this.f46045e.mo42616a((Bundle) null);
    }
}
