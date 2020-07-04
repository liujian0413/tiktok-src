package com.tencent.wcdb.support;

import com.C1642a;
import java.util.LinkedHashMap;

/* renamed from: com.tencent.wcdb.support.c */
public class C46446c<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f119649a;

    /* renamed from: b */
    private int f119650b;

    /* renamed from: c */
    private int f119651c;

    /* renamed from: d */
    private int f119652d;

    /* renamed from: e */
    private int f119653e;

    /* renamed from: f */
    private int f119654f;

    /* renamed from: g */
    private int f119655g;

    /* renamed from: b */
    private int m146027b(K k, V v) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo115454a(boolean z, K k, V v, V v2) {
    }

    /* renamed from: a */
    public final void mo115550a() {
        m146028b(-1);
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f119654f + this.f119655g;
        if (i2 != 0) {
            i = (this.f119654f * 100) / i2;
        } else {
            i = 0;
        }
        return C1642a.m8034a("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f119651c), Integer.valueOf(this.f119654f), Integer.valueOf(this.f119655g), Integer.valueOf(i)});
    }

    public C46446c(int i) {
        if (i > 0) {
            this.f119651c = i;
            this.f119649a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    public final void mo115551a(int i) {
        if (i > 0) {
            synchronized (this) {
                this.f119651c = i;
            }
            m146028b(i);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    public final V mo115548a(K k) {
        if (k != null) {
            synchronized (this) {
                V v = this.f119649a.get(k);
                if (v != null) {
                    this.f119654f++;
                    return v;
                }
                this.f119655g++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: b */
    public final V mo115552b(K k) {
        V remove;
        if (k != null) {
            synchronized (this) {
                remove = this.f119649a.remove(k);
                if (remove != null) {
                    this.f119650b -= m146027b(k, remove);
                }
            }
            if (remove != null) {
                mo115454a(false, k, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m146028b(int r6) {
        /*
            r5 = this;
        L_0x0000:
            monitor-enter(r5)
            int r0 = r5.f119650b     // Catch:{ all -> 0x0087 }
            if (r0 < 0) goto L_0x0068
            java.util.LinkedHashMap<K, V> r0 = r5.f119649a     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0011
            int r0 = r5.f119650b     // Catch:{ all -> 0x0087 }
            if (r0 != 0) goto L_0x0068
        L_0x0011:
            int r0 = r5.f119650b     // Catch:{ all -> 0x0087 }
            if (r0 <= r6) goto L_0x0066
            java.util.LinkedHashMap<K, V> r0 = r5.f119649a     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0066
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r5.f119649a     // Catch:{ all -> 0x0087 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0087 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x0087 }
            r1 = 0
            if (r0 == 0) goto L_0x0040
            java.util.LinkedHashMap<K, V> r0 = r5.f119649a     // Catch:{ all -> 0x0087 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0087 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0087 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0087 }
            goto L_0x0041
        L_0x0040:
            r0 = r1
        L_0x0041:
            if (r0 != 0) goto L_0x0045
            monitor-exit(r5)     // Catch:{ all -> 0x0087 }
            return
        L_0x0045:
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0087 }
            java.util.LinkedHashMap<K, V> r3 = r5.f119649a     // Catch:{ all -> 0x0087 }
            r3.remove(r2)     // Catch:{ all -> 0x0087 }
            int r3 = r5.f119650b     // Catch:{ all -> 0x0087 }
            int r4 = r5.m146027b(r2, r0)     // Catch:{ all -> 0x0087 }
            int r3 = r3 - r4
            r5.f119650b = r3     // Catch:{ all -> 0x0087 }
            int r3 = r5.f119653e     // Catch:{ all -> 0x0087 }
            r4 = 1
            int r3 = r3 + r4
            r5.f119653e = r3     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)     // Catch:{ all -> 0x0087 }
            r5.mo115454a(r4, r2, r0, r1)
            goto L_0x0000
        L_0x0066:
            monitor-exit(r5)     // Catch:{ all -> 0x0087 }
            return
        L_0x0068:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0087 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            r0.<init>()     // Catch:{ all -> 0x0087 }
            java.lang.Class r1 = r5.getClass()     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0087 }
            r0.append(r1)     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0087 }
            r6.<init>(r0)     // Catch:{ all -> 0x0087 }
            throw r6     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0087 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.support.C46446c.m146028b(int):void");
    }

    /* renamed from: a */
    public final V mo115549a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f119652d++;
            this.f119650b += m146027b(k, v);
            put = this.f119649a.put(k, v);
            if (put != null) {
                this.f119650b -= m146027b(k, put);
            }
        }
        if (put != null) {
            mo115454a(false, k, put, v);
        }
        m146028b(this.f119651c);
        return put;
    }
}
