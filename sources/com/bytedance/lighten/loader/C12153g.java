package com.bytedance.lighten.loader;

import com.bytedance.lighten.core.p612c.C12108f;
import com.bytedance.lighten.core.p612c.C12109g;
import com.facebook.cache.common.C13265a;
import com.facebook.cache.common.C13270f;
import com.facebook.imagepipeline.request.C13841a;

/* renamed from: com.bytedance.lighten.loader.g */
final class C12153g extends C13841a {

    /* renamed from: a */
    private C12109g f32388a;

    /* renamed from: b */
    private C12108f f32389b;

    public final String getName() {
        return this.f32388a.mo29807a();
    }

    public final C13265a getPostprocessorCacheKey() {
        return new C13270f(this.f32388a.mo29807a());
    }

    public C12153g(C12109g gVar) {
        this.f32388a = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.common.references.C13326a<android.graphics.Bitmap> process(android.graphics.Bitmap r4, final com.facebook.imagepipeline.p715b.C13551f r5) {
        /*
            r3 = this;
            com.bytedance.lighten.core.c.f r0 = r3.f32389b
            if (r0 != 0) goto L_0x000b
            com.bytedance.lighten.loader.g$1 r0 = new com.bytedance.lighten.loader.g$1
            r0.<init>(r5)
            r3.f32389b = r0
        L_0x000b:
            r5 = 0
            com.bytedance.lighten.core.c.g r0 = r3.f32388a     // Catch:{ all -> 0x0029 }
            com.bytedance.lighten.core.c.f r1 = r3.f32389b     // Catch:{ all -> 0x0029 }
            com.bytedance.lighten.core.c.b r4 = r0.mo29806a(r4, r1)     // Catch:{ all -> 0x0029 }
            com.bytedance.lighten.loader.w r4 = (com.bytedance.lighten.loader.C12189w) r4     // Catch:{ all -> 0x0029 }
            com.facebook.common.references.a<android.graphics.Bitmap> r5 = r4.f32434a     // Catch:{ all -> 0x0024 }
            com.facebook.common.references.a r5 = com.facebook.common.references.C13326a.m39000b(r5)     // Catch:{ all -> 0x0024 }
            if (r4 == 0) goto L_0x0023
            com.facebook.common.references.a<android.graphics.Bitmap> r4 = r4.f32434a
            com.facebook.common.references.C13326a.m39001c(r4)
        L_0x0023:
            return r5
        L_0x0024:
            r5 = move-exception
            r2 = r5
            r5 = r4
            r4 = r2
            goto L_0x002a
        L_0x0029:
            r4 = move-exception
        L_0x002a:
            if (r5 == 0) goto L_0x0031
            com.facebook.common.references.a<android.graphics.Bitmap> r5 = r5.f32434a
            com.facebook.common.references.C13326a.m39001c(r5)
        L_0x0031:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lighten.loader.C12153g.process(android.graphics.Bitmap, com.facebook.imagepipeline.b.f):com.facebook.common.references.a");
    }
}
