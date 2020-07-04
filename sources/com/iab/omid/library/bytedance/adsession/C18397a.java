package com.iab.omid.library.bytedance.adsession;

import com.iab.omid.library.bytedance.p791d.C18426d;

/* renamed from: com.iab.omid.library.bytedance.adsession.a */
public final class C18397a {

    /* renamed from: a */
    private final C18403g f49908a;

    private C18397a(C18403g gVar) {
        this.f49908a = gVar;
    }

    /* renamed from: a */
    public static C18397a m60544a(C18398b bVar) {
        C18403g gVar = (C18403g) bVar;
        C18426d.m60669a((Object) bVar, "AdSession is null");
        C18426d.m60673d(gVar);
        C18426d.m60671b(gVar);
        C18397a aVar = new C18397a(gVar);
        gVar.mo47811d().f49968a = aVar;
        return aVar;
    }

    /* renamed from: a */
    public final void mo47801a() {
        C18426d.m60671b(this.f49908a);
        C18426d.m60675f(this.f49908a);
        if (!this.f49908a.mo47814g()) {
            try {
                this.f49908a.mo47802a();
            } catch (Exception unused) {
            }
        }
        if (this.f49908a.mo47814g()) {
            this.f49908a.mo47810c();
        }
    }
}
