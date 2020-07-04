package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15349d;

final class byf extends byl<C15698g> {

    /* renamed from: a */
    private final /* synthetic */ Context f44170a;

    /* renamed from: b */
    private final /* synthetic */ zzyz f44171b;

    /* renamed from: c */
    private final /* synthetic */ String f44172c;

    /* renamed from: d */
    private final /* synthetic */ C15931oq f44173d;

    /* renamed from: e */
    private final /* synthetic */ bye f44174e;

    byf(bye bye, Context context, zzyz zzyz, String str, C15931oq oqVar) {
        this.f44174e = bye;
        this.f44170a = context;
        this.f44171b = zzyz;
        this.f44172c = str;
        this.f44173d = oqVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo41439a() {
        bye.m50265b(this.f44170a, "banner");
        return new C15560bb();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo41441b() throws RemoteException {
        return this.f44174e.f44162a.mo41427a(this.f44170a, this.f44171b, this.f44172c, this.f44173d, 1);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo41440a(C15995r rVar) throws RemoteException {
        return rVar.mo37568a(C15349d.m44668a(this.f44170a), this.f44171b, this.f44172c, this.f44173d, 15302000);
    }
}
