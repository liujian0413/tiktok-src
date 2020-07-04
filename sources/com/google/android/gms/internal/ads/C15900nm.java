package com.google.android.gms.internal.ads;

import android.content.Context;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.nm */
public final class C15900nm {

    /* renamed from: a */
    private static final adv<C15851lr> f44693a = new C15901nn();

    /* renamed from: b */
    private static final adv<C15851lr> f44694b = new C15902no();

    /* renamed from: c */
    private final C15863mc f44695c;

    public C15900nm(Context context, zzbgz zzbgz, String str) {
        C15863mc mcVar = new C15863mc(context, zzbgz, str, f44693a, f44694b);
        this.f44695c = mcVar;
    }

    /* renamed from: a */
    public final <I, O> C15892ne<I, O> mo41772a(String str, C15895nh<I> nhVar, C15894ng<O> ngVar) {
        return new C15903np(this.f44695c, str, nhVar, ngVar);
    }
}
