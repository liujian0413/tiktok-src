package android.support.p022v4.util;

import com.C1642a;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: android.support.v4.util.f */
public class C0894f<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f3132a;

    /* renamed from: b */
    private int f3133b;

    /* renamed from: c */
    private int f3134c;

    /* renamed from: d */
    private int f3135d;

    /* renamed from: e */
    private int f3136e;

    /* renamed from: f */
    private int f3137f;

    /* renamed from: g */
    private int f3138g;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo3346b(K k, V v) {
        return 1;
    }

    /* renamed from: a */
    public final void mo3343a() {
        mo3344a(-1);
    }

    /* renamed from: b */
    public final synchronized int mo3345b() {
        return this.f3133b;
    }

    /* renamed from: c */
    public final synchronized Map<K, V> mo3348c() {
        return new LinkedHashMap(this.f3132a);
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f3137f + this.f3138g;
        if (i2 != 0) {
            i = (this.f3137f * 100) / i2;
        } else {
            i = 0;
        }
        return C1642a.m8035a(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f3134c), Integer.valueOf(this.f3137f), Integer.valueOf(this.f3138g), Integer.valueOf(i)});
    }

    public C0894f(int i) {
        if (i > 0) {
            this.f3134c = i;
            this.f3132a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    public final V mo3341a(K k) {
        if (k != null) {
            synchronized (this) {
                V v = this.f3132a.get(k);
                if (v != null) {
                    this.f3137f++;
                    return v;
                }
                this.f3138g++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: b */
    public final V mo3347b(K k) {
        V remove;
        if (k != null) {
            synchronized (this) {
                remove = this.f3132a.remove(k);
                if (remove != null) {
                    this.f3133b -= m3806c(k, remove);
                }
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3344a(int r4) {
        /*
            r3 = this;
        L_0x0000:
            monitor-enter(r3)
            int r0 = r3.f3133b     // Catch:{ all -> 0x006d }
            if (r0 < 0) goto L_0x004e
            java.util.LinkedHashMap<K, V> r0 = r3.f3132a     // Catch:{ all -> 0x006d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x0011
            int r0 = r3.f3133b     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x004e
        L_0x0011:
            int r0 = r3.f3133b     // Catch:{ all -> 0x006d }
            if (r0 <= r4) goto L_0x004c
            java.util.LinkedHashMap<K, V> r0 = r3.f3132a     // Catch:{ all -> 0x006d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x001e
            goto L_0x004c
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r3.f3132a     // Catch:{ all -> 0x006d }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x006d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x006d }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x006d }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x006d }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x006d }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x006d }
            java.util.LinkedHashMap<K, V> r2 = r3.f3132a     // Catch:{ all -> 0x006d }
            r2.remove(r1)     // Catch:{ all -> 0x006d }
            int r2 = r3.f3133b     // Catch:{ all -> 0x006d }
            int r0 = r3.m3806c(r1, r0)     // Catch:{ all -> 0x006d }
            int r2 = r2 - r0
            r3.f3133b = r2     // Catch:{ all -> 0x006d }
            int r0 = r3.f3136e     // Catch:{ all -> 0x006d }
            int r0 = r0 + 1
            r3.f3136e = r0     // Catch:{ all -> 0x006d }
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.util.C0894f.mo3344a(int):void");
    }

    /* renamed from: c */
    private int m3806c(K k, V v) {
        int b = mo3346b(k, v);
        if (b >= 0) {
            return b;
        }
        StringBuilder sb = new StringBuilder("Negative size: ");
        sb.append(k);
        sb.append("=");
        sb.append(v);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final V mo3342a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f3135d++;
            this.f3133b += m3806c(k, v);
            put = this.f3132a.put(k, v);
            if (put != null) {
                this.f3133b -= m3806c(k, put);
            }
        }
        mo3344a(this.f3134c);
        return put;
    }
}
