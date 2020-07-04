package com.facebook.imagepipeline.p717d;

import com.facebook.cache.p683a.C13244c;
import com.facebook.cache.p683a.C13248d;
import com.facebook.cache.p683a.C13251e;
import com.facebook.cache.p683a.C13251e.C13254b;
import com.facebook.cache.p683a.C13259i;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.d.c */
public final class C13600c implements C13605h {

    /* renamed from: a */
    private C13602e f36037a;

    public C13600c(C13602e eVar) {
        this.f36037a = eVar;
    }

    /* renamed from: a */
    public final C13259i mo33169a(C13244c cVar) {
        return m40021a(cVar, this.f36037a.mo33170a(cVar));
    }

    /* renamed from: a */
    private static C13251e m40021a(C13244c cVar, C13248d dVar) {
        return m40022a(cVar, dVar, C13601d.m40024a());
    }

    /* renamed from: a */
    private static C13251e m40022a(C13244c cVar, C13248d dVar, Executor executor) {
        C13254b bVar = new C13254b(cVar.f35086f, cVar.f35085e, cVar.f35084d);
        C13248d dVar2 = dVar;
        C13254b bVar2 = bVar;
        C13251e eVar = new C13251e(dVar2, cVar.f35087g, bVar2, cVar.f35089i, cVar.f35088h, cVar.f35090j, cVar.f35091k, executor, cVar.f35092l);
        return eVar;
    }
}
