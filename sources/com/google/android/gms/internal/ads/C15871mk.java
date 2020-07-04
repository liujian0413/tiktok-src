package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mk */
final class C15871mk implements C15742hq<C15889nb> {

    /* renamed from: a */
    private final /* synthetic */ bdt f44653a;

    /* renamed from: b */
    private final /* synthetic */ C15851lr f44654b;

    /* renamed from: c */
    private final /* synthetic */ aes f44655c;

    /* renamed from: d */
    private final /* synthetic */ C15863mc f44656d;

    C15871mk(C15863mc mcVar, bdt bdt, C15851lr lrVar, aes aes) {
        this.f44656d = mcVar;
        this.f44653a = bdt;
        this.f44654b = lrVar;
        this.f44655c = aes;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        synchronized (this.f44656d.f44630a) {
            acd.m45781d("JS Engine is requesting an update");
            if (this.f44656d.f44637h == 0) {
                acd.m45781d("Starting reload.");
                this.f44656d.f44637h = 2;
                this.f44656d.mo41748a(this.f44653a);
            }
            this.f44654b.mo41742b("/requestReload", (C15742hq) this.f44655c.f40115a);
        }
    }
}
