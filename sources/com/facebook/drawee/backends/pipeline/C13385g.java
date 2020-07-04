package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.C13310j;
import com.facebook.common.internal.ImmutableList;
import com.facebook.drawee.components.C13390a;
import com.facebook.imagepipeline.p716c.C13585p;
import com.facebook.imagepipeline.p719f.C13642a;
import com.facebook.imagepipeline.p720g.C13645c;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.drawee.backends.pipeline.g */
public final class C13385g {

    /* renamed from: a */
    private Resources f35418a;

    /* renamed from: b */
    private C13390a f35419b;

    /* renamed from: c */
    private C13642a f35420c;

    /* renamed from: d */
    private Executor f35421d;

    /* renamed from: e */
    private C13585p<C13265a, C13645c> f35422e;

    /* renamed from: f */
    private ImmutableList<C13642a> f35423f;

    /* renamed from: g */
    private C13310j<Boolean> f35424g;

    /* renamed from: a */
    public final C13381d mo32715a() {
        C13381d a = m39212a(this.f35418a, this.f35419b, this.f35420c, this.f35421d, this.f35422e, this.f35423f);
        if (this.f35424g != null) {
            a.f35399d = ((Boolean) this.f35424g.mo29879b()).booleanValue();
        }
        return a;
    }

    /* renamed from: a */
    private static C13381d m39212a(Resources resources, C13390a aVar, C13642a aVar2, Executor executor, C13585p<C13265a, C13645c> pVar, ImmutableList<C13642a> immutableList) {
        C13381d dVar = new C13381d(resources, aVar, aVar2, executor, pVar, immutableList);
        return dVar;
    }

    /* renamed from: a */
    public final void mo32716a(Resources resources, C13390a aVar, C13642a aVar2, Executor executor, C13585p<C13265a, C13645c> pVar, ImmutableList<C13642a> immutableList, C13310j<Boolean> jVar) {
        this.f35418a = resources;
        this.f35419b = aVar;
        this.f35420c = aVar2;
        this.f35421d = executor;
        this.f35422e = pVar;
        this.f35423f = immutableList;
        this.f35424g = jVar;
    }
}
