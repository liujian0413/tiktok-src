package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.dh */
final class C16472dh extends C16454b {

    /* renamed from: c */
    private final /* synthetic */ Long f46086c;

    /* renamed from: d */
    private final /* synthetic */ String f46087d;

    /* renamed from: e */
    private final /* synthetic */ String f46088e;

    /* renamed from: f */
    private final /* synthetic */ Bundle f46089f;

    /* renamed from: g */
    private final /* synthetic */ boolean f46090g = true;

    /* renamed from: h */
    private final /* synthetic */ boolean f46091h;

    /* renamed from: i */
    private final /* synthetic */ C16452cr f46092i;

    C16472dh(C16452cr crVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        this.f46092i = crVar;
        this.f46086c = l;
        this.f46087d = str;
        this.f46088e = str2;
        this.f46089f = bundle;
        this.f46091h = z2;
        super(crVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo42641b() throws RemoteException {
        this.f46092i.f46025j.mo42594a(this.f46087d, this.f46088e, this.f46089f, this.f46090g, this.f46091h, this.f46086c == null ? this.f46029a : this.f46086c.longValue());
    }
}
