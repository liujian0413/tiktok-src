package com.facebook.drawee.backends.pipeline.p696b;

import com.facebook.imagepipeline.p721h.C13651a;

/* renamed from: com.facebook.drawee.backends.pipeline.b.c */
public final class C13374c extends C13651a {

    /* renamed from: a */
    public String f35340a;

    /* renamed from: b */
    private final C13373b f35341b;

    public C13374c(String str, C13373b bVar) {
        this.f35341b = bVar;
        this.f35340a = str;
    }

    public final void onUltimateProducerReached(String str, String str2, boolean z) {
        if (this.f35341b != null) {
            this.f35341b.mo32681a(this.f35340a, C13375d.m39153a(str2), z);
        }
    }
}
