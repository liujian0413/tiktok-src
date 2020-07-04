package com.facebook.imagepipeline.p724k;

import android.util.Pair;
import com.facebook.cache.common.C13265a;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p716c.C13568f;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.io.Closeable;

/* renamed from: com.facebook.imagepipeline.k.g */
public final class C13740g extends C13676ag<Pair<C13265a, RequestLevel>, C13326a<C13645c>> {

    /* renamed from: c */
    private final C13568f f36471c;

    /* renamed from: a */
    private static C13326a<C13645c> m40553a(C13326a<C13645c> aVar) {
        return C13326a.m39000b(aVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Closeable mo33307a(Closeable closeable) {
        return m40553a((C13326a) closeable);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Pair<C13265a, RequestLevel> mo33308a(C13700an anVar) {
        return Pair.create(this.f36471c.mo33114a(anVar.mo33333a(), anVar.mo33337d()), anVar.mo33338e());
    }

    public C13740g(C13568f fVar, C13699am amVar) {
        super(amVar);
        this.f36471c = fVar;
    }
}
