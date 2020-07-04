package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15349d;

final class byi extends byl<C15698g> {

    /* renamed from: a */
    private final /* synthetic */ Context f44181a;

    /* renamed from: b */
    private final /* synthetic */ zzyz f44182b;

    /* renamed from: c */
    private final /* synthetic */ String f44183c;

    /* renamed from: d */
    private final /* synthetic */ C15931oq f44184d;

    /* renamed from: e */
    private final /* synthetic */ bye f44185e;

    byi(bye bye, Context context, zzyz zzyz, String str, C15931oq oqVar) {
        this.f44185e = bye;
        this.f44181a = context;
        this.f44182b = zzyz;
        this.f44183c = str;
        this.f44184d = oqVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo41439a() {
        bye.m50265b(this.f44181a, "interstitial");
        return new C15560bb();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo41441b() throws RemoteException {
        return this.f44185e.f44162a.mo41427a(this.f44181a, this.f44182b, this.f44183c, this.f44184d, 2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo41440a(C15995r rVar) throws RemoteException {
        return rVar.mo37572b(C15349d.m44668a(this.f44181a), this.f44182b, this.f44183c, this.f44184d, 15302000);
    }
}
