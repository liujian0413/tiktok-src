package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15349d;

final class byg extends byl<C16019rx> {

    /* renamed from: a */
    private final /* synthetic */ Activity f44175a;

    /* renamed from: b */
    private final /* synthetic */ bye f44176b;

    byg(bye bye, Activity activity) {
        this.f44176b = bye;
        this.f44175a = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo41439a() {
        bye.m50265b(this.f44175a, "ad_overlay");
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo41441b() throws RemoteException {
        return this.f44176b.f44168g.mo41962a(this.f44175a);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo41440a(C15995r rVar) throws RemoteException {
        return rVar.mo37575c(C15349d.m44668a(this.f44175a));
    }
}
