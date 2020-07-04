package com.bytedance.ies.geckoclient;

import com.bytedance.ies.geckoclient.model.C10903d;
import com.bytedance.ies.geckoclient.p571e.C10869f;
import java.util.Map;

/* renamed from: com.bytedance.ies.geckoclient.m */
final class C10891m extends C10835a {

    /* renamed from: b */
    private C10890l f29460b;

    /* renamed from: c */
    private Map<String, C10903d> f29461c;

    /* renamed from: d */
    private C10888j f29462d;

    /* renamed from: e */
    private C10873f f29463e;

    public final void run() {
        this.f29460b.mo26266a(this.f29461c);
        String b = this.f29463e.mo26222b();
        C10869f.m31887a().mo26199a(b);
        if (C10869f.m31887a().f29403a) {
            this.f29460b.mo26265a((Iterable<C10903d>) this.f29461c.values(), this.f29463e.f29410c, this.f29463e.f29409b);
        } else {
            this.f29460b.mo26267a(this.f29461c, this.f29463e.f29410c, this.f29463e.f29409b);
        }
        C10869f.m31887a().mo26202b(b);
        this.f29462d.mo26231h();
    }

    public C10891m(C10890l lVar, Map<String, C10903d> map, C10873f fVar) {
        super(null);
        this.f29460b = lVar;
        this.f29461c = map;
        this.f29462d = fVar;
        this.f29463e = fVar;
    }
}
