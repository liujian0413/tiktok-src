package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import android.net.Uri;
import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.drawee.backends.pipeline.p696b.C13373b;
import com.facebook.drawee.backends.pipeline.p696b.C13377f;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder.CacheLevel;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.imagepipeline.common.C13597e;
import com.facebook.imagepipeline.p716c.C13568f;
import com.facebook.imagepipeline.p717d.C13606i;
import com.facebook.imagepipeline.p719f.C13642a;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.p721h.C13653c;
import com.facebook.imagepipeline.p725l.C13783b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;

/* renamed from: com.facebook.drawee.backends.pipeline.e */
public final class C13382e extends AbstractDraweeControllerBuilder<C13382e, ImageRequest, C13326a<C13645c>, C13648f> {

    /* renamed from: n */
    private final C13606i f35408n;

    /* renamed from: o */
    private final C13385g f35409o;

    /* renamed from: p */
    private ImmutableList<C13642a> f35410p;

    /* renamed from: q */
    private C13373b f35411q;

    /* renamed from: r */
    private C13377f f35412r;

    /* renamed from: h */
    private C13265a m39204h() {
        ImageRequest imageRequest = (ImageRequest) this.f35441c;
        C13568f fVar = this.f35408n.f36041c;
        if (fVar == null || imageRequest == null) {
            return null;
        }
        if (imageRequest.mPostprocessor != null) {
            return fVar.mo33115b(imageRequest, this.f35440b);
        }
        return fVar.mo33114a(imageRequest, this.f35440b);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public C13381d mo32712a() {
        C13381d dVar;
        if (C13783b.m40665b()) {
            C13783b.m40664a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            C13386a aVar = this.f35451m;
            String e = m39249e();
            if (aVar instanceof C13381d) {
                dVar = (C13381d) aVar;
            } else {
                dVar = this.f35409o.mo32715a();
            }
            dVar.mo32694a(mo32741a((C13386a) dVar, e), e, m39204h(), this.f35440b, this.f35410p, this.f35411q);
            dVar.mo32696a(this.f35412r);
            return dVar;
        } finally {
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
    }

    /* renamed from: c */
    private static C13653c m39202c(C13386a aVar) {
        if (aVar instanceof C13381d) {
            return ((C13381d) aVar).mo32692a();
        }
        return null;
    }

    /* renamed from: a */
    public final C13382e mo32711a(String str) {
        if (str == null || str.isEmpty()) {
            return (C13382e) super.mo32748b(ImageRequest.fromUri(str));
        }
        return mo32713b(Uri.parse(str));
    }

    /* renamed from: a */
    private static RequestLevel m39201a(CacheLevel cacheLevel) {
        switch (cacheLevel) {
            case FULL_FETCH:
                return RequestLevel.FULL_FETCH;
            case DISK_CACHE:
                return RequestLevel.DISK_CACHE;
            case BITMAP_MEMORY_CACHE:
                return RequestLevel.BITMAP_MEMORY_CACHE;
            default:
                StringBuilder sb = new StringBuilder("Cache level");
                sb.append(cacheLevel);
                sb.append("is not supported. ");
                throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    public final C13382e mo32713b(Uri uri) {
        if (uri == null) {
            return (C13382e) super.mo32748b(null);
        }
        return (C13382e) super.mo32748b(ImageRequestBuilder.m40865a(uri).mo33469a(C13597e.m40011c()).mo33476b());
    }

    public C13382e(Context context, C13385g gVar, C13606i iVar, Set<C13401d> set) {
        super(context, set);
        this.f35408n = iVar;
        this.f35409o = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C13346c<C13326a<C13645c>> mo32709a(C13386a aVar, String str, ImageRequest imageRequest, Object obj, CacheLevel cacheLevel) {
        return this.f35408n.mo33174a(imageRequest, obj, m39201a(cacheLevel), m39202c(aVar));
    }
}
