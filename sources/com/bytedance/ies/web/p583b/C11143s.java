package com.bytedance.ies.web.p583b;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.ies.web.b.s */
public final class C11143s<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f30250a;

    /* renamed from: b */
    private int f30251b;

    /* renamed from: c */
    private int f30252c;

    /* renamed from: d */
    private int f30253d;

    /* renamed from: e */
    private int f30254e;

    /* renamed from: f */
    private int f30255f;

    /* renamed from: g */
    private int f30256g;

    /* renamed from: h */
    private final C7563m<K, V, Boolean> f30257h;

    /* renamed from: i */
    private final C7563m<K, V, C7581n> f30258i;

    /* renamed from: c */
    private final int m32619c(K k, V v) {
        return 1;
    }

    /* renamed from: a */
    public final synchronized void mo27134a() {
        StringBuilder sb = new StringBuilder("Start trimming, entry count: ");
        sb.append(this.f30250a.size());
        sb.append('.');
        C11115h.m32554a(sb.toString());
        Iterator it = this.f30250a.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (((Boolean) this.f30257h.invoke(entry.getKey(), entry.getValue())).booleanValue()) {
                this.f30258i.invoke(entry.getKey(), entry.getValue());
                it.remove();
                StringBuilder sb2 = new StringBuilder("Entry removed: ");
                sb2.append(entry.getKey());
                sb2.append('.');
                C11115h.m32554a(sb2.toString());
            }
        }
    }

    public final synchronized String toString() {
        int i;
        StringBuilder sb;
        int i2 = this.f30254e + this.f30255f;
        if (i2 != 0) {
            i = (this.f30254e * 100) / i2;
        } else {
            i = 0;
        }
        sb = new StringBuilder("LruCache[maxSize=");
        sb.append(this.f30256g);
        sb.append(",hits=");
        sb.append(this.f30254e);
        sb.append(",misses=");
        sb.append(this.f30255f);
        sb.append(",hitRate=");
        sb.append(i);
        sb.append("%%]");
        return sb.toString();
    }

    /* renamed from: a */
    public final V mo27133a(K k) {
        ObjectRef objectRef = new ObjectRef();
        synchronized (this) {
            objectRef.element = this.f30250a.get(k);
            if (objectRef.element != null) {
                this.f30254e++;
                Object obj = objectRef.element;
                return obj;
            }
            this.f30255f++;
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r0.getClass().getName());
        r1.append(".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        throw new java.lang.IllegalStateException(r1.toString());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m32617a(int r5) {
        /*
            r4 = this;
        L_0x0000:
            r0 = r4
            com.bytedance.ies.web.b.s r0 = (com.bytedance.ies.web.p583b.C11143s) r0
            monitor-enter(r0)
            int r1 = r0.f30251b     // Catch:{ all -> 0x007f }
            if (r1 < 0) goto L_0x005e
            java.util.LinkedHashMap<K, V> r1 = r0.f30250a     // Catch:{ all -> 0x007f }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x0014
            int r1 = r0.f30251b     // Catch:{ all -> 0x007f }
            if (r1 != 0) goto L_0x005e
        L_0x0014:
            int r1 = r0.f30251b     // Catch:{ all -> 0x007f }
            if (r1 > r5) goto L_0x001a
            monitor-exit(r0)
            return
        L_0x001a:
            r1 = 0
            java.util.LinkedHashMap<K, V> r2 = r0.f30250a     // Catch:{ all -> 0x007f }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x007f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x007f }
        L_0x0025:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x0032
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x007f }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x007f }
            goto L_0x0025
        L_0x0032:
            if (r1 != 0) goto L_0x0036
            monitor-exit(r0)
            return
        L_0x0036:
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x007f }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x007f }
            java.util.LinkedHashMap<K, V> r3 = r0.f30250a     // Catch:{ all -> 0x007f }
            if (r2 != 0) goto L_0x0045
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ all -> 0x007f }
        L_0x0045:
            r3.remove(r2)     // Catch:{ all -> 0x007f }
            int r3 = r0.f30251b     // Catch:{ all -> 0x007f }
            if (r1 != 0) goto L_0x004f
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ all -> 0x007f }
        L_0x004f:
            int r1 = r0.m32619c(r2, r1)     // Catch:{ all -> 0x007f }
            int r3 = r3 - r1
            r0.f30251b = r3     // Catch:{ all -> 0x007f }
            int r1 = r0.f30253d     // Catch:{ all -> 0x007f }
            int r1 = r1 + 1
            r0.f30253d = r1     // Catch:{ all -> 0x007f }
            monitor-exit(r0)
            goto L_0x0000
        L_0x005e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            r1.<init>()     // Catch:{ all -> 0x007f }
            java.lang.Class r2 = r0.getClass()     // Catch:{ all -> 0x007f }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x007f }
            r1.append(r2)     // Catch:{ all -> 0x007f }
            java.lang.String r2 = ".sizeOf() is reporting inconsistent results!"
            r1.append(r2)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007f }
            r5.<init>(r1)     // Catch:{ all -> 0x007f }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x007f }
            throw r5     // Catch:{ all -> 0x007f }
        L_0x007f:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.web.p583b.C11143s.m32617a(int):void");
    }

    /* renamed from: a */
    public final void mo27135a(K k, V v) {
        m32618b(k, v);
    }

    /* renamed from: b */
    private V m32618b(K k, V v) {
        ObjectRef objectRef = new ObjectRef();
        synchronized (this) {
            this.f30252c++;
            this.f30251b += m32619c(k, v);
            objectRef.element = this.f30250a.put(k, v);
            if (objectRef.element != null) {
                int i = this.f30251b;
                T t = objectRef.element;
                if (t == null) {
                    C7573i.m23580a();
                }
                this.f30251b = i - m32619c(k, t);
            }
        }
        if (objectRef.element != null && objectRef.element == null) {
            C7573i.m23580a();
        }
        m32617a(this.f30256g);
        return objectRef.element;
    }

    public C11143s(int i, C7563m<? super K, ? super V, Boolean> mVar, C7563m<? super K, ? super V, C7581n> mVar2) {
        C7573i.m23587b(mVar, "expireRule");
        C7573i.m23587b(mVar2, "onValueRemoved");
        this.f30256g = i;
        this.f30257h = mVar;
        this.f30258i = mVar2;
        if (this.f30256g > 0) {
            this.f30250a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
