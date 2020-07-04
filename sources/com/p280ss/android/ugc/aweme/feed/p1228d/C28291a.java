package com.p280ss.android.ugc.aweme.feed.p1228d;

import com.C1642a;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.feed.d.a */
final class C28291a<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f74553a = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: b */
    private int f74554b;

    /* renamed from: c */
    private int f74555c = 31;

    /* renamed from: d */
    private int f74556d;

    /* renamed from: e */
    private int f74557e;

    /* renamed from: f */
    private int f74558f;

    /* renamed from: g */
    private int f74559g;

    /* renamed from: b */
    private int m93047b(K k, V v) {
        return 1;
    }

    /* renamed from: a */
    public final Collection<V> mo71973a() {
        return this.f74553a.values();
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f74558f + this.f74559g;
        if (i2 != 0) {
            i = (this.f74558f * 100) / i2;
        } else {
            i = 0;
        }
        return C1642a.m8035a(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f74555c), Integer.valueOf(this.f74558f), Integer.valueOf(this.f74559g), Integer.valueOf(i)});
    }

    public C28291a(int i) {
    }

    /* renamed from: a */
    public final V mo71971a(K k) {
        if (k != null) {
            synchronized (this) {
                V v = this.f74553a.get(k);
                if (v != null) {
                    this.f74558f++;
                    return v;
                }
                this.f74559g++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m93046a(int r4) {
        /*
            r3 = this;
        L_0x0000:
            monitor-enter(r3)
            int r0 = r3.f74554b     // Catch:{ all -> 0x006d }
            if (r0 < 0) goto L_0x004e
            java.util.LinkedHashMap<K, V> r0 = r3.f74553a     // Catch:{ all -> 0x006d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x0011
            int r0 = r3.f74554b     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x004e
        L_0x0011:
            int r0 = r3.f74554b     // Catch:{ all -> 0x006d }
            if (r0 <= r4) goto L_0x004c
            java.util.LinkedHashMap<K, V> r0 = r3.f74553a     // Catch:{ all -> 0x006d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x001e
            goto L_0x004c
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r3.f74553a     // Catch:{ all -> 0x006d }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x006d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x006d }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x006d }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x006d }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x006d }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x006d }
            java.util.LinkedHashMap<K, V> r2 = r3.f74553a     // Catch:{ all -> 0x006d }
            r2.remove(r1)     // Catch:{ all -> 0x006d }
            int r2 = r3.f74554b     // Catch:{ all -> 0x006d }
            int r0 = r3.m93047b(r1, r0)     // Catch:{ all -> 0x006d }
            int r2 = r2 - r0
            r3.f74554b = r2     // Catch:{ all -> 0x006d }
            int r0 = r3.f74557e     // Catch:{ all -> 0x006d }
            int r0 = r0 + 1
            r3.f74557e = r0     // Catch:{ all -> 0x006d }
            monitor-exit(r3)     // Catch:{ all -> 0x006d }
            goto L_0x0000
        L_0x004c:
            monitor-exit(r3)     // Catch:{ all -> 0x006d }
            return
        L_0x004e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r0.<init>()     // Catch:{ all -> 0x006d }
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x006d }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x006d }
            r0.append(r1)     // Catch:{ all -> 0x006d }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x006d }
            r4.<init>(r0)     // Catch:{ all -> 0x006d }
            throw r4     // Catch:{ all -> 0x006d }
        L_0x006d:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1228d.C28291a.m93046a(int):void");
    }

    /* renamed from: a */
    public final V mo71972a(K k, V v) {
        V put;
        if (k != null) {
            synchronized (this) {
                this.f74556d++;
                this.f74554b += m93047b(k, v);
                put = this.f74553a.put(k, v);
                if (put != null) {
                    this.f74554b -= m93047b(k, put);
                }
            }
            m93046a(this.f74555c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }
}
