package com.facebook.imagepipeline.p724k;

import android.util.Pair;
import com.facebook.cache.common.C13265a;
import com.facebook.imagepipeline.p716c.C13568f;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.io.Closeable;

/* renamed from: com.facebook.imagepipeline.k.r */
public final class C13764r extends C13676ag<Pair<C13265a, RequestLevel>, C13647e> {

    /* renamed from: c */
    private final C13568f f36536c;

    /* renamed from: a */
    private static C13647e m40623a(C13647e eVar) {
        return C13647e.m40235a(eVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Closeable mo33307a(Closeable closeable) {
        return m40623a((C13647e) closeable);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Pair<C13265a, RequestLevel> mo33308a(C13700an anVar) {
        return Pair.create(this.f36536c.mo33116c(anVar.mo33333a(), anVar.mo33337d()), anVar.mo33338e());
    }

    public C13764r(C13568f fVar, C13699am amVar) {
        super(amVar);
        this.f36536c = fVar;
    }
}
