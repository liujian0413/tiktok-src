package com.facebook.fresco.animation.p703b.p704a;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.common.p686c.C13286a;
import com.facebook.common.references.C13326a;
import com.facebook.fresco.animation.p703b.C13470b;
import com.facebook.imagepipeline.animated.p713b.C13530c;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13646d;
import com.facebook.imagepipeline.p720g.C13649g;

/* renamed from: com.facebook.fresco.animation.b.a.a */
public class C13467a implements C13470b {

    /* renamed from: a */
    private static final Class<?> f35718a = C13467a.class;

    /* renamed from: b */
    private final C13530c f35719b;

    /* renamed from: c */
    private final boolean f35720c;

    /* renamed from: d */
    private final SparseArray<C13326a<C13645c>> f35721d;

    /* renamed from: e */
    private C13326a<C13645c> f35722e;

    /* renamed from: f */
    private int f35723f = -1;

    /* renamed from: a */
    public final synchronized void mo33003a() {
        C13326a.m39001c(this.f35722e);
        this.f35719b.mo33075c(this.f35723f);
        this.f35722e = null;
        this.f35723f = -1;
        for (int i = 0; i < this.f35721d.size(); i++) {
            C13326a aVar = (C13326a) this.f35721d.valueAt(i);
            if (aVar != null) {
                C13326a.m39001c(aVar);
                this.f35719b.mo33075c(this.f35721d.keyAt(i));
            }
        }
        this.f35721d.clear();
    }

    /* renamed from: b */
    private static C13326a<C13645c> m39601b(C13326a<Bitmap> aVar) {
        return C13326a.m38995a(new C13646d(aVar, C13649g.f36269a, 0));
    }

    /* renamed from: a */
    public final synchronized C13326a<Bitmap> mo33001a(int i) {
        return m39600a(this.f35719b.mo33071a(i));
    }

    /* renamed from: c */
    public final synchronized boolean mo33007c(int i) {
        return this.f35719b.mo33074b(i);
    }

    /* renamed from: b */
    public final synchronized C13326a<Bitmap> mo33005b(int i) {
        return m39600a(C13326a.m39000b(this.f35722e));
    }

    /* renamed from: a */
    private static C13326a<Bitmap> m39600a(C13326a<C13645c> aVar) {
        try {
            if (C13326a.m38999a(aVar) && (aVar.mo32609a() instanceof C13646d)) {
                C13646d dVar = (C13646d) aVar.mo32609a();
                if (dVar != null) {
                    return dVar.mo33268f();
                }
            }
            C13326a.m39001c(aVar);
            return null;
        } finally {
            C13326a.m39001c(aVar);
        }
    }

    /* renamed from: d */
    private synchronized void m39602d(int i) {
        C13326a aVar = (C13326a) this.f35721d.get(i);
        if (aVar != null) {
            this.f35721d.delete(i);
            C13326a.m39001c(aVar);
            C13286a.m38836a(f35718a, "removePreparedReference(%d) removed. Pending frames: %s", (Object) Integer.valueOf(i), (Object) this.f35721d);
        }
    }

    public C13467a(C13530c cVar, boolean z) {
        this.f35719b = cVar;
        this.f35720c = z;
        this.f35721d = new SparseArray<>();
    }

    /* renamed from: a */
    public final synchronized C13326a<Bitmap> mo33002a(int i, int i2, int i3) {
        if (!this.f35720c) {
            return null;
        }
        return m39600a(this.f35719b.mo33070a());
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0042=Splitter:B:22:0x0042, B:15:0x0039=Splitter:B:15:0x0039} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33006b(int r3, com.facebook.common.references.C13326a<android.graphics.Bitmap> r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.facebook.common.internal.C13307g.m38940a(r4)     // Catch:{ all -> 0x0046 }
            r5 = 0
            com.facebook.common.references.a r4 = m39601b(r4)     // Catch:{ all -> 0x0040 }
            if (r4 != 0) goto L_0x0010
            com.facebook.common.references.C13326a.m39001c(r4)     // Catch:{ all -> 0x0046 }
            monitor-exit(r2)
            return
        L_0x0010:
            com.facebook.imagepipeline.animated.b.c r5 = r2.f35719b     // Catch:{ all -> 0x003e }
            com.facebook.common.references.a r5 = r5.mo33072a(r3, r4)     // Catch:{ all -> 0x003e }
            boolean r0 = com.facebook.common.references.C13326a.m38999a(r5)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0039
            android.util.SparseArray<com.facebook.common.references.a<com.facebook.imagepipeline.g.c>> r0 = r2.f35721d     // Catch:{ all -> 0x003e }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x003e }
            com.facebook.common.references.a r0 = (com.facebook.common.references.C13326a) r0     // Catch:{ all -> 0x003e }
            com.facebook.common.references.C13326a.m39001c(r0)     // Catch:{ all -> 0x003e }
            android.util.SparseArray<com.facebook.common.references.a<com.facebook.imagepipeline.g.c>> r0 = r2.f35721d     // Catch:{ all -> 0x003e }
            r0.put(r3, r5)     // Catch:{ all -> 0x003e }
            java.lang.Class<?> r5 = f35718a     // Catch:{ all -> 0x003e }
            java.lang.String r0 = "cachePreparedFrame(%d) cached. Pending frames: %s"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x003e }
            android.util.SparseArray<com.facebook.common.references.a<com.facebook.imagepipeline.g.c>> r1 = r2.f35721d     // Catch:{ all -> 0x003e }
            com.facebook.common.p686c.C13286a.m38836a(r5, r0, r3, r1)     // Catch:{ all -> 0x003e }
        L_0x0039:
            com.facebook.common.references.C13326a.m39001c(r4)     // Catch:{ all -> 0x0046 }
            monitor-exit(r2)
            return
        L_0x003e:
            r3 = move-exception
            goto L_0x0042
        L_0x0040:
            r3 = move-exception
            r4 = r5
        L_0x0042:
            com.facebook.common.references.C13326a.m39001c(r4)     // Catch:{ all -> 0x0046 }
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fresco.animation.p703b.p704a.C13467a.mo33006b(int, com.facebook.common.references.a, int):void");
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:10:0x0020=Splitter:B:10:0x0020, B:16:0x0027=Splitter:B:16:0x0027} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33004a(int r1, com.facebook.common.references.C13326a<android.graphics.Bitmap> r2, int r3) {
        /*
            r0 = this;
            monitor-enter(r0)
            com.facebook.common.internal.C13307g.m38940a(r2)     // Catch:{ all -> 0x002b }
            r0.m39602d(r1)     // Catch:{ all -> 0x002b }
            r3 = 0
            com.facebook.common.references.a r2 = m39601b(r2)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0020
            com.facebook.common.references.a<com.facebook.imagepipeline.g.c> r3 = r0.f35722e     // Catch:{ all -> 0x001e }
            com.facebook.common.references.C13326a.m39001c(r3)     // Catch:{ all -> 0x001e }
            com.facebook.imagepipeline.animated.b.c r3 = r0.f35719b     // Catch:{ all -> 0x001e }
            com.facebook.common.references.a r3 = r3.mo33072a(r1, r2)     // Catch:{ all -> 0x001e }
            r0.f35722e = r3     // Catch:{ all -> 0x001e }
            r0.f35723f = r1     // Catch:{ all -> 0x001e }
            goto L_0x0020
        L_0x001e:
            r1 = move-exception
            goto L_0x0027
        L_0x0020:
            com.facebook.common.references.C13326a.m39001c(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)
            return
        L_0x0025:
            r1 = move-exception
            r2 = r3
        L_0x0027:
            com.facebook.common.references.C13326a.m39001c(r2)     // Catch:{ all -> 0x002b }
            throw r1     // Catch:{ all -> 0x002b }
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fresco.animation.p703b.p704a.C13467a.mo33004a(int, com.facebook.common.references.a, int):void");
    }
}
