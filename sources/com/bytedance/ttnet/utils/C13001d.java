package com.bytedance.ttnet.utils;

import com.C1642a;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: com.bytedance.ttnet.utils.d */
final class C13001d<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f34428a = new LinkedHashMap<>(0, 0.75f, false);

    /* renamed from: b */
    private int f34429b;

    /* renamed from: c */
    private int f34430c = 10;

    /* renamed from: d */
    private int f34431d;

    /* renamed from: e */
    private int f34432e;

    /* renamed from: f */
    private int f34433f;

    /* renamed from: g */
    private int f34434g;

    /* renamed from: b */
    private int m37940b(K k, V v) {
        return 1;
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f34433f + this.f34434g;
        if (i2 != 0) {
            i = (this.f34433f * 100) / i2;
        } else {
            i = 0;
        }
        return C1642a.m8034a("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f34430c), Integer.valueOf(this.f34433f), Integer.valueOf(this.f34434g), Integer.valueOf(i)});
    }

    public C13001d(int i) {
    }

    /* renamed from: a */
    public final synchronized V mo31539a(K k) {
        if (k != null) {
            V v = this.f34428a.get(k);
            if (v != null) {
                this.f34433f++;
                return v;
            }
            this.f34434g++;
            return null;
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: a */
    private void m37939a(int i) {
        while (this.f34429b > i && !this.f34428a.isEmpty()) {
            Entry entry = (Entry) this.f34428a.entrySet().iterator().next();
            if (entry == null) {
                break;
            }
            Object key = entry.getKey();
            Object value = entry.getValue();
            this.f34428a.remove(key);
            this.f34429b -= m37940b(key, value);
            this.f34432e++;
        }
        if (this.f34429b < 0 || (this.f34428a.isEmpty() && this.f34429b != 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(".sizeOf() is reporting inconsistent results!");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final synchronized V mo31540a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        this.f34431d++;
        this.f34429b += m37940b(k, v);
        put = this.f34428a.put(k, v);
        if (put != null) {
            this.f34429b -= m37940b(k, put);
        }
        m37939a(this.f34430c);
        return put;
    }
}
