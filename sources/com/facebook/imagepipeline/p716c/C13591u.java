package com.facebook.imagepipeline.p716c;

import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.C13307g;
import com.facebook.common.p686c.C13286a;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p720g.C13647e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.c.u */
public class C13591u {

    /* renamed from: a */
    private static final Class<?> f35996a = C13591u.class;

    /* renamed from: b */
    private Map<C13265a, C13647e> f35997b = new HashMap();

    /* renamed from: a */
    public static C13591u m39988a() {
        return new C13591u();
    }

    private C13591u() {
    }

    /* renamed from: c */
    private synchronized void m39989c() {
        C13286a.m38835a(f35996a, "Count = %d", (Object) Integer.valueOf(this.f35997b.size()));
    }

    /* renamed from: b */
    public final void mo33140b() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f35997b.values());
            this.f35997b.clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C13647e eVar = (C13647e) arrayList.get(i);
            if (eVar != null) {
                eVar.close();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo33138a(C13265a aVar) {
        C13647e eVar;
        C13307g.m38940a(aVar);
        synchronized (this) {
            eVar = (C13647e) this.f35997b.remove(aVar);
        }
        if (eVar == null) {
            return false;
        }
        try {
            return eVar.mo33269a();
        } finally {
            eVar.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        return r7;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.facebook.imagepipeline.p720g.C13647e mo33139b(com.facebook.cache.common.C13265a r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.facebook.common.internal.C13307g.m38940a(r7)     // Catch:{ all -> 0x0051 }
            java.util.Map<com.facebook.cache.common.a, com.facebook.imagepipeline.g.e> r0 = r6.f35997b     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0051 }
            com.facebook.imagepipeline.g.e r0 = (com.facebook.imagepipeline.p720g.C13647e) r0     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x004e
            monitor-enter(r0)     // Catch:{ all -> 0x0051 }
            boolean r1 = com.facebook.imagepipeline.p720g.C13647e.m40238e(r0)     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x0045
            java.util.Map<com.facebook.cache.common.a, com.facebook.imagepipeline.g.e> r1 = r6.f35997b     // Catch:{ all -> 0x004b }
            r1.remove(r7)     // Catch:{ all -> 0x004b }
            java.lang.Class<?> r1 = f35996a     // Catch:{ all -> 0x004b }
            java.lang.String r2 = "Found closed reference %d for key %s (%d)"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x004b }
            r4 = 0
            int r5 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x004b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x004b }
            r3[r4] = r5     // Catch:{ all -> 0x004b }
            r4 = 1
            java.lang.String r5 = r7.mo32489a()     // Catch:{ all -> 0x004b }
            r3[r4] = r5     // Catch:{ all -> 0x004b }
            r4 = 2
            int r7 = java.lang.System.identityHashCode(r7)     // Catch:{ all -> 0x004b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x004b }
            r3[r4] = r7     // Catch:{ all -> 0x004b }
            com.facebook.common.p686c.C13286a.m38851b(r1, r2, r3)     // Catch:{ all -> 0x004b }
            r7 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            monitor-exit(r6)
            return r7
        L_0x0045:
            com.facebook.imagepipeline.g.e r7 = com.facebook.imagepipeline.p720g.C13647e.m40235a(r0)     // Catch:{ all -> 0x004b }
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            throw r7     // Catch:{ all -> 0x0051 }
        L_0x004e:
            r7 = r0
        L_0x004f:
            monitor-exit(r6)
            return r7
        L_0x0051:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p716c.C13591u.mo33139b(com.facebook.cache.common.a):com.facebook.imagepipeline.g.e");
    }

    /* renamed from: c */
    public final synchronized boolean mo33142c(C13265a aVar) {
        C13307g.m38940a(aVar);
        if (!this.f35997b.containsKey(aVar)) {
            return false;
        }
        C13647e eVar = (C13647e) this.f35997b.get(aVar);
        synchronized (eVar) {
            if (C13647e.m40238e(eVar)) {
                return true;
            }
            this.f35997b.remove(aVar);
            C13286a.m38851b(f35996a, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(eVar)), aVar.mo32489a(), Integer.valueOf(System.identityHashCode(aVar)));
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized void mo33137a(C13265a aVar, C13647e eVar) {
        C13307g.m38940a(aVar);
        C13307g.m38943a(C13647e.m40238e(eVar));
        C13647e.m40237d((C13647e) this.f35997b.put(aVar, C13647e.m40235a(eVar)));
        m39989c();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final synchronized boolean mo33141b(C13265a aVar, C13647e eVar) {
        C13307g.m38940a(aVar);
        C13307g.m38940a(eVar);
        C13307g.m38943a(C13647e.m40238e(eVar));
        C13647e eVar2 = (C13647e) this.f35997b.get(aVar);
        if (eVar2 == null) {
            return false;
        }
        C13326a b = eVar2.mo33271b();
        C13326a b2 = eVar.mo33271b();
        if (!(b == null || b2 == null)) {
            try {
                if (b.mo32609a() == b2.mo32609a()) {
                    this.f35997b.remove(aVar);
                    C13326a.m39001c(b2);
                    C13326a.m39001c(b);
                    C13647e.m40237d(eVar2);
                    m39989c();
                    return true;
                }
            } catch (Throwable th) {
                C13326a.m39001c(b2);
                C13326a.m39001c(b);
                C13647e.m40237d(eVar2);
                throw th;
            }
        }
        C13326a.m39001c(b2);
        C13326a.m39001c(b);
        C13647e.m40237d(eVar2);
        return false;
    }
}
