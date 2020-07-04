package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15349d;

final class byh extends byl<C15698g> {

    /* renamed from: a */
    private final /* synthetic */ Context f44177a;

    /* renamed from: b */
    private final /* synthetic */ zzyz f44178b;

    /* renamed from: c */
    private final /* synthetic */ String f44179c;

    /* renamed from: d */
    private final /* synthetic */ bye f44180d;

    byh(bye bye, Context context, zzyz zzyz, String str) {
        this.f44180d = bye;
        this.f44177a = context;
        this.f44178b = zzyz;
        this.f44179c = str;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo41439a() {
        bye.m50265b(this.f44177a, "search");
        return new C15560bb();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo41441b() throws RemoteException {
        return this.f44180d.f44162a.mo41427a(this.f44177a, this.f44178b, this.f44179c, null, 3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo41440a(C15995r rVar) throws RemoteException {
        return rVar.mo37567a(C15349d.m44668a(this.f44177a), this.f44178b, this.f44179c, 15302000);
    }
}
