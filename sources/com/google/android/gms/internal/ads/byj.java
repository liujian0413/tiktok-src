package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15349d;

final class byj extends byl<C15553b> {

    /* renamed from: a */
    private final /* synthetic */ Context f44186a;

    /* renamed from: b */
    private final /* synthetic */ String f44187b;

    /* renamed from: c */
    private final /* synthetic */ C15931oq f44188c;

    /* renamed from: d */
    private final /* synthetic */ bye f44189d;

    byj(bye bye, Context context, String str, C15931oq oqVar) {
        this.f44189d = bye;
        this.f44186a = context;
        this.f44187b = str;
        this.f44188c = oqVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo41439a() {
        bye.m50265b(this.f44186a, "native_ad");
        return new C15544ax();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo41441b() throws RemoteException {
        return this.f44189d.f44163b.mo41426a(this.f44186a, this.f44187b, this.f44188c);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo41440a(C15995r rVar) throws RemoteException {
        return rVar.mo37564a(C15349d.m44668a(this.f44186a), this.f44187b, this.f44188c, 15302000);
    }
}
