package com.facebook.imagepipeline.p717d;

import android.net.Uri;
import bolts.C1591g;
import bolts.C1592h;
import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.C13303f;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.C13308h;
import com.facebook.common.internal.C13310j;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.datasource.C13347d;
import com.facebook.datasource.C13357h;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.p716c.C13561e;
import com.facebook.imagepipeline.p716c.C13568f;
import com.facebook.imagepipeline.p716c.C13585p;
import com.facebook.imagepipeline.p718e.C13641d;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p721h.C13652b;
import com.facebook.imagepipeline.p721h.C13653c;
import com.facebook.imagepipeline.p724k.C13699am;
import com.facebook.imagepipeline.p724k.C13711at;
import com.facebook.imagepipeline.p724k.C13723ay;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.CacheChoice;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.facebook.imagepipeline.d.i */
public final class C13606i {

    /* renamed from: e */
    private static final CancellationException f36038e = new CancellationException("Prefetching is not enabled");

    /* renamed from: a */
    public final C13585p<C13265a, C13645c> f36039a;

    /* renamed from: b */
    public final C13561e f36040b;

    /* renamed from: c */
    public final C13568f f36041c;

    /* renamed from: d */
    public final C13310j<Boolean> f36042d;

    /* renamed from: f */
    private final C13626o f36043f;

    /* renamed from: g */
    private final C13653c f36044g;

    /* renamed from: h */
    private final C13310j<Boolean> f36045h;

    /* renamed from: i */
    private final C13585p<C13265a, PooledByteBuffer> f36046i;

    /* renamed from: j */
    private final C13561e f36047j;

    /* renamed from: k */
    private final C13723ay f36048k;

    /* renamed from: l */
    private final C13310j<Boolean> f36049l;

    /* renamed from: m */
    private AtomicLong f36050m = new AtomicLong();

    /* renamed from: a */
    public final void mo33176a(Uri uri) {
        C13308h g = m40043g(uri);
        this.f36039a.mo33127a(g);
        this.f36046i.mo33127a(g);
    }

    /* renamed from: a */
    public final void mo33175a() {
        C136082 r0 = new C13308h<C13265a>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo32572a(Object obj) {
                return true;
            }
        };
        this.f36039a.mo33127a((C13308h<K>) r0);
        this.f36046i.mo33127a((C13308h<K>) r0);
    }

    /* renamed from: a */
    public final boolean mo33177a(ImageRequest imageRequest) {
        if (imageRequest == null) {
            return false;
        }
        C13326a a = this.f36039a.mo33128a(this.f36041c.mo33114a(imageRequest, null));
        try {
            return C13326a.m38999a(a);
        } finally {
            C13326a.m39001c(a);
        }
    }

    /* renamed from: c */
    public final void mo33183c() {
        this.f36048k.mo33345a();
    }

    /* renamed from: e */
    public final boolean mo33189e() {
        return this.f36048k.mo33349c();
    }

    /* renamed from: f */
    private String m40041f() {
        return String.valueOf(this.f36050m.getAndIncrement());
    }

    /* renamed from: g */
    private void m40044g() {
        this.f36047j.mo33100a();
        this.f36040b.mo33100a();
    }

    /* renamed from: d */
    public final void mo33186d() {
        this.f36048k.mo33347b();
    }

    /* renamed from: b */
    public final void mo33180b() {
        mo33175a();
        m40044g();
    }

    /* renamed from: f */
    private void m40042f(Uri uri) {
        m40038b(ImageRequest.fromUri(uri));
    }

    /* renamed from: g */
    private C13308h<C13265a> m40043g(final Uri uri) {
        return new C13308h<C13265a>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public boolean mo32572a(C13265a aVar) {
                return aVar.mo32490a(uri);
            }
        };
    }

    /* renamed from: c */
    public final boolean mo33184c(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f36039a.mo33135c(m40043g(uri));
    }

    /* renamed from: e */
    public final C13346c<Boolean> mo33188e(Uri uri) {
        return m40040d(ImageRequest.fromUri(uri));
    }

    /* renamed from: b */
    private void m40038b(ImageRequest imageRequest) {
        C13265a c = this.f36041c.mo33116c(imageRequest, null);
        this.f36047j.mo33107g(c);
        this.f36040b.mo33107g(c);
    }

    /* renamed from: d */
    public final boolean mo33187d(Uri uri) {
        if (m40037a(uri, CacheChoice.SMALL) || m40037a(uri, CacheChoice.DEFAULT)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m40039c(ImageRequest imageRequest) {
        C13265a c = this.f36041c.mo33116c(imageRequest, null);
        switch (imageRequest.mCacheChoice) {
            case DEFAULT:
                return this.f36047j.mo33105e(c);
            case SMALL:
                return this.f36040b.mo33105e(c);
            default:
                return false;
        }
    }

    /* renamed from: d */
    private C13346c<Boolean> m40040d(ImageRequest imageRequest) {
        final C13265a c = this.f36041c.mo33116c(imageRequest, null);
        final C13357h h = C13357h.m39111h();
        this.f36047j.mo33104d(c).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) new C1591g<Boolean, C1592h<Boolean>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C1592h<Boolean> then(C1592h<Boolean> hVar) throws Exception {
                if (hVar.mo6887c() || hVar.mo6889d() || !((Boolean) hVar.mo6890e()).booleanValue()) {
                    return C13606i.this.f36040b.mo33104d(c);
                }
                return C1592h.m7851a(Boolean.valueOf(true));
            }
        }).mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<Boolean, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<Boolean> hVar) throws Exception {
                boolean z;
                C13357h hVar2 = h;
                if (hVar.mo6887c() || hVar.mo6889d() || !((Boolean) hVar.mo6890e()).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                hVar2.mo32658b(Boolean.valueOf(z));
                return null;
            }
        });
        return h;
    }

    /* renamed from: b */
    public final void mo33181b(Uri uri) {
        mo33176a(uri);
        m40042f(uri);
    }

    /* renamed from: b */
    public final C13346c<C13326a<PooledByteBuffer>> mo33178b(ImageRequest imageRequest, Object obj) {
        return m40035a(imageRequest, (Object) null, (C13653c) null);
    }

    /* renamed from: d */
    public final C13346c<Void> mo33185d(ImageRequest imageRequest, Object obj) {
        return mo33173a(imageRequest, obj, Priority.MEDIUM);
    }

    /* renamed from: a */
    public final C13346c<C13326a<C13645c>> mo33172a(ImageRequest imageRequest, Object obj) {
        return mo33179b(imageRequest, obj, RequestLevel.FULL_FETCH);
    }

    /* renamed from: a */
    private boolean m40037a(Uri uri, CacheChoice cacheChoice) {
        return m40039c(ImageRequestBuilder.m40865a(uri).mo33471a(cacheChoice).mo33476b());
    }

    /* renamed from: c */
    public final C13346c<Void> mo33182c(ImageRequest imageRequest, Object obj) {
        C13699am amVar;
        if (!((Boolean) this.f36045h.mo29879b()).booleanValue()) {
            return C13347d.m39076a(f36038e);
        }
        try {
            if (((Boolean) this.f36049l.mo29879b()).booleanValue()) {
                amVar = this.f36043f.mo33239b(imageRequest);
            } else {
                amVar = this.f36043f.mo33241d(imageRequest);
            }
            return m40033a(amVar, imageRequest, RequestLevel.FULL_FETCH, obj, Priority.MEDIUM);
        } catch (Exception e) {
            return C13347d.m39076a(e);
        }
    }

    /* renamed from: a */
    private C13653c m40036a(ImageRequest imageRequest, C13653c cVar) {
        if (cVar == null) {
            if (imageRequest.mRequestListener == null) {
                return this.f36044g;
            }
            return new C13652b(this.f36044g, imageRequest.mRequestListener);
        } else if (imageRequest.mRequestListener == null) {
            return new C13652b(this.f36044g, cVar);
        } else {
            return new C13652b(this.f36044g, cVar, imageRequest.mRequestListener);
        }
    }

    /* renamed from: a */
    public final C13310j<C13346c<C13326a<C13645c>>> mo33171a(final ImageRequest imageRequest, final Object obj, final RequestLevel requestLevel) {
        return new C13310j<C13346c<C13326a<C13645c>>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C13346c<C13326a<C13645c>> mo29879b() {
                return C13606i.this.mo33179b(imageRequest, obj, requestLevel);
            }

            public final String toString() {
                return C13303f.m38930a((Object) this).mo32569a("uri", (Object) imageRequest.mSourceUri).toString();
            }
        };
    }

    /* renamed from: b */
    public final C13346c<C13326a<C13645c>> mo33179b(ImageRequest imageRequest, Object obj, RequestLevel requestLevel) {
        return mo33174a(imageRequest, obj, requestLevel, null);
    }

    /* renamed from: a */
    private C13346c<C13326a<PooledByteBuffer>> m40035a(ImageRequest imageRequest, Object obj, C13653c cVar) {
        C13307g.m38940a(imageRequest.mSourceUri);
        try {
            C13699am a = this.f36043f.mo33238a(imageRequest);
            if (imageRequest.mResizeOptions != null) {
                imageRequest = ImageRequestBuilder.m40866a(imageRequest).mo33468a((C13596d) null).mo33476b();
            }
            return m40034a(a, imageRequest, RequestLevel.FULL_FETCH, obj, (C13653c) null);
        } catch (Exception e) {
            return C13347d.m39076a(e);
        }
    }

    /* renamed from: a */
    public final C13346c<Void> mo33173a(ImageRequest imageRequest, Object obj, Priority priority) {
        if (!((Boolean) this.f36045h.mo29879b()).booleanValue()) {
            return C13347d.m39076a(f36038e);
        }
        try {
            return m40033a(this.f36043f.mo33239b(imageRequest), imageRequest, RequestLevel.FULL_FETCH, obj, priority);
        } catch (Exception e) {
            return C13347d.m39076a(e);
        }
    }

    /* renamed from: a */
    public final C13346c<C13326a<C13645c>> mo33174a(ImageRequest imageRequest, Object obj, RequestLevel requestLevel, C13653c cVar) {
        try {
            return m40034a(this.f36043f.mo33240c(imageRequest), imageRequest, requestLevel, obj, cVar);
        } catch (Exception e) {
            return C13347d.m39076a(e);
        }
    }

    /* renamed from: a */
    private C13346c<Void> m40033a(C13699am<Void> amVar, ImageRequest imageRequest, RequestLevel requestLevel, Object obj, Priority priority) {
        C13653c a = m40036a(imageRequest, (C13653c) null);
        try {
            ImageRequest imageRequest2 = imageRequest;
            C13711at atVar = new C13711at(imageRequest2, m40041f(), a, obj, RequestLevel.getMax(imageRequest.mLowestPermittedRequestLevel, requestLevel), true, false, priority);
            return C13641d.m40215a(amVar, atVar, a);
        } catch (Exception e) {
            return C13347d.m39076a(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> com.facebook.datasource.C13346c<com.facebook.common.references.C13326a<T>> m40034a(com.facebook.imagepipeline.p724k.C13699am<com.facebook.common.references.C13326a<T>> r11, com.facebook.imagepipeline.request.ImageRequest r12, com.facebook.imagepipeline.request.ImageRequest.RequestLevel r13, java.lang.Object r14, com.facebook.imagepipeline.p721h.C13653c r15) {
        /*
            r10 = this;
            boolean r0 = com.facebook.imagepipeline.p725l.C13783b.m40665b()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "ImagePipeline#submitFetchRequest"
            com.facebook.imagepipeline.p725l.C13783b.m40664a(r0)
        L_0x000b:
            com.facebook.imagepipeline.h.c r15 = r10.m40036a(r12, r15)
            com.facebook.imagepipeline.request.ImageRequest$RequestLevel r0 = r12.mLowestPermittedRequestLevel     // Catch:{ Exception -> 0x0047 }
            com.facebook.imagepipeline.request.ImageRequest$RequestLevel r6 = com.facebook.imagepipeline.request.ImageRequest.RequestLevel.getMax(r0, r13)     // Catch:{ Exception -> 0x0047 }
            com.facebook.imagepipeline.k.at r13 = new com.facebook.imagepipeline.k.at     // Catch:{ Exception -> 0x0047 }
            java.lang.String r3 = r10.m40041f()     // Catch:{ Exception -> 0x0047 }
            r7 = 0
            boolean r0 = r12.mProgressiveRenderingEnabled     // Catch:{ Exception -> 0x0047 }
            if (r0 != 0) goto L_0x002c
            android.net.Uri r0 = r12.mSourceUri     // Catch:{ Exception -> 0x0047 }
            boolean r0 = com.facebook.common.util.C13337d.m39034b(r0)     // Catch:{ Exception -> 0x0047 }
            if (r0 != 0) goto L_0x0029
            goto L_0x002c
        L_0x0029:
            r0 = 0
            r8 = 0
            goto L_0x002e
        L_0x002c:
            r0 = 1
            r8 = 1
        L_0x002e:
            com.facebook.imagepipeline.common.Priority r9 = r12.mRequestPriority     // Catch:{ Exception -> 0x0047 }
            r1 = r13
            r2 = r12
            r4 = r15
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0047 }
            com.facebook.datasource.c r11 = com.facebook.imagepipeline.p718e.C13640c.m40208a(r11, r13, r15)     // Catch:{ Exception -> 0x0047 }
            boolean r12 = com.facebook.imagepipeline.p725l.C13783b.m40665b()
            if (r12 == 0) goto L_0x0044
            com.facebook.imagepipeline.p725l.C13783b.m40663a()
        L_0x0044:
            return r11
        L_0x0045:
            r11 = move-exception
            goto L_0x0056
        L_0x0047:
            r11 = move-exception
            com.facebook.datasource.c r11 = com.facebook.datasource.C13347d.m39076a(r11)     // Catch:{ all -> 0x0045 }
            boolean r12 = com.facebook.imagepipeline.p725l.C13783b.m40665b()
            if (r12 == 0) goto L_0x0055
            com.facebook.imagepipeline.p725l.C13783b.m40663a()
        L_0x0055:
            return r11
        L_0x0056:
            boolean r12 = com.facebook.imagepipeline.p725l.C13783b.m40665b()
            if (r12 == 0) goto L_0x005f
            com.facebook.imagepipeline.p725l.C13783b.m40663a()
        L_0x005f:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p717d.C13606i.m40034a(com.facebook.imagepipeline.k.am, com.facebook.imagepipeline.request.ImageRequest, com.facebook.imagepipeline.request.ImageRequest$RequestLevel, java.lang.Object, com.facebook.imagepipeline.h.c):com.facebook.datasource.c");
    }

    public C13606i(C13626o oVar, Set<C13653c> set, C13310j<Boolean> jVar, C13585p<C13265a, C13645c> pVar, C13585p<C13265a, PooledByteBuffer> pVar2, C13561e eVar, C13561e eVar2, C13568f fVar, C13723ay ayVar, C13310j<Boolean> jVar2, C13310j<Boolean> jVar3) {
        this.f36043f = oVar;
        this.f36044g = new C13652b(set);
        this.f36045h = jVar;
        this.f36039a = pVar;
        this.f36046i = pVar2;
        this.f36047j = eVar;
        this.f36040b = eVar2;
        this.f36041c = fVar;
        this.f36048k = ayVar;
        this.f36049l = jVar2;
        this.f36042d = jVar3;
    }
}
