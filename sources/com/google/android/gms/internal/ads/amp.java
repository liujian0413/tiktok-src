package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14816bu;

final /* synthetic */ class amp implements aft {

    /* renamed from: a */
    private final Context f40680a;

    /* renamed from: b */
    private final bdt f40681b;

    /* renamed from: c */
    private final zzbgz f40682c;

    /* renamed from: d */
    private final C14816bu f40683d;

    /* renamed from: e */
    private final String f40684e;

    amp(Context context, bdt bdt, zzbgz zzbgz, C14816bu buVar, String str) {
        this.f40680a = context;
        this.f40681b = bdt;
        this.f40682c = zzbgz;
        this.f40683d = buVar;
        this.f40684e = str;
    }

    /* renamed from: a */
    public final agj mo37772a(Object obj) {
        Context context = this.f40680a;
        bdt bdt = this.f40681b;
        zzbgz zzbgz = this.f40682c;
        C14816bu buVar = this.f40683d;
        String str = this.f40684e;
        ami a = amo.m46434a(context, anv.m46662a(), "", false, false, bdt, zzbgz, null, null, buVar, bwl.m50206a());
        agt a2 = agt.m45839a(a);
        a.mo39761w().mo39771a((anq) new amr(a2));
        a.loadUrl(str);
        return a2;
    }
}
