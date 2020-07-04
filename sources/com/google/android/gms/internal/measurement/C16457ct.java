package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.ct */
final class C16457ct extends C16454b {

    /* renamed from: c */
    private final /* synthetic */ String f46039c;

    /* renamed from: d */
    private final /* synthetic */ String f46040d;

    /* renamed from: e */
    private final /* synthetic */ Bundle f46041e;

    /* renamed from: f */
    private final /* synthetic */ C16452cr f46042f;

    C16457ct(C16452cr crVar, String str, String str2, Bundle bundle) {
        this.f46042f = crVar;
        this.f46039c = str;
        this.f46040d = str2;
        this.f46041e = bundle;
        super(crVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo42641b() throws RemoteException {
        this.f46042f.f46025j.mo42592a(this.f46039c, this.f46040d, this.f46041e);
    }
}
