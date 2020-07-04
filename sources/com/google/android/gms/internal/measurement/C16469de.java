package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.C15349d;

/* renamed from: com.google.android.gms.internal.measurement.de */
final class C16469de extends C16454b {

    /* renamed from: c */
    private final /* synthetic */ int f46074c = 5;

    /* renamed from: d */
    private final /* synthetic */ String f46075d;

    /* renamed from: e */
    private final /* synthetic */ Object f46076e;

    /* renamed from: f */
    private final /* synthetic */ Object f46077f;

    /* renamed from: g */
    private final /* synthetic */ Object f46078g;

    /* renamed from: h */
    private final /* synthetic */ C16452cr f46079h;

    C16469de(C16452cr crVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f46079h = crVar;
        this.f46075d = str;
        this.f46076e = obj;
        this.f46077f = obj2;
        this.f46078g = obj3;
        super(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo42641b() throws RemoteException {
        this.f46079h.f46025j.mo42577a(this.f46074c, this.f46075d, C15349d.m44668a(this.f46076e), C15349d.m44668a(this.f46077f), C15349d.m44668a(this.f46078g));
    }
}
