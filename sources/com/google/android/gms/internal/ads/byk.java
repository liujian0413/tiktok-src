package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.C15349d;

final class byk extends byl<C15663es> {

    /* renamed from: a */
    private final /* synthetic */ FrameLayout f44190a;

    /* renamed from: b */
    private final /* synthetic */ FrameLayout f44191b;

    /* renamed from: c */
    private final /* synthetic */ Context f44192c;

    /* renamed from: d */
    private final /* synthetic */ bye f44193d;

    byk(bye bye, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f44193d = bye;
        this.f44190a = frameLayout;
        this.f44191b = frameLayout2;
        this.f44192c = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo41439a() {
        bye.m50265b(this.f44192c, "native_ad_view_delegate");
        return new C15562bd();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo41441b() throws RemoteException {
        return this.f44193d.f44165d.mo41644a(this.f44192c, this.f44190a, this.f44191b);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo41440a(C15995r rVar) throws RemoteException {
        return rVar.mo37565a(C15349d.m44668a(this.f44190a), C15349d.m44668a(this.f44191b));
    }
}
