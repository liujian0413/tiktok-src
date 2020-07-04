package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15349d;

/* renamed from: com.google.android.gms.internal.measurement.cv */
final class C16459cv extends C16454b {

    /* renamed from: c */
    private final /* synthetic */ Activity f46047c;

    /* renamed from: d */
    private final /* synthetic */ String f46048d;

    /* renamed from: e */
    private final /* synthetic */ String f46049e;

    /* renamed from: f */
    private final /* synthetic */ C16452cr f46050f;

    C16459cv(C16452cr crVar, Activity activity, String str, String str2) {
        this.f46050f = crVar;
        this.f46047c = activity;
        this.f46048d = str;
        this.f46049e = str2;
        super(crVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo42641b() throws RemoteException {
        this.f46050f.f46025j.mo42585a(C15349d.m44668a(this.f46047c), this.f46048d, this.f46049e, this.f46029a);
    }
}
