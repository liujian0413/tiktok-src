package com.bytedance.android.live.core.p145a;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.live.core.a.c */
public class C3147c<K, V> implements C3144a<K, V> {

    /* renamed from: a */
    private Map<K, V> f9699a;

    /* renamed from: b */
    private int f9700b;

    /* renamed from: c */
    private int f9701c;

    public C3147c() {
        this(8);
    }

    /* renamed from: b */
    private static String m11917b() {
        return C3147c.class.getName();
    }

    /* renamed from: a */
    public final synchronized Map<K, V> mo9991a() {
        return new LinkedHashMap(this.f9699a);
    }

    public final synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        for (Entry entry : this.f9699a.entrySet()) {
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            sb.append(",");
        }
        sb.append("maxMemory=");
        sb.append(this.f9700b);
        sb.append(",memorySize=");
        sb.append(this.f9701c);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo9982a(K k) {
        synchronized (this) {
            if (this.f9699a.remove(k) != null) {
                this.f9701c--;
            }
        }
    }

    /* renamed from: b */
    public final V mo9984b(K k) {
        synchronized (this) {
            V v = this.f9699a.get(k);
            if (v != null) {
                return v;
            }
            return null;
        }
    }

    public C3147c(int i) {
        if (i > 0) {
            try {
                this.f9699a = new C3148d(i);
                this.f9700b = i;
            } catch (OutOfMemoryError unused) {
                this.f9699a = new C3148d(10);
                this.f9700b = 10;
            }
        } else {
            throw new IllegalArgumentException("capacity <= 0");
        }
    }

    /* renamed from: a */
    private void m11916a(int i) {
        while (this.f9701c > i && !this.f9699a.isEmpty()) {
            if (this.f9701c < 0 || (this.f9699a.isEmpty() && this.f9701c != 0)) {
                StringBuilder sb = new StringBuilder();
                sb.append(m11917b());
                sb.append(".getValueSize() is reporting inconsistent results");
                throw new IllegalStateException(sb.toString());
            }
            Entry entry = (Entry) this.f9699a.entrySet().iterator().next();
            this.f9699a.remove(entry.getKey());
            int i2 = this.f9701c;
            entry.getValue();
            this.f9701c = i2 - 1;
        }
    }

    /* renamed from: a */
    public final void mo9983a(K k, V v) {
        synchronized (this) {
            Object put = this.f9699a.put(k, v);
            this.f9701c++;
            if (put != null) {
                this.f9701c--;
            }
            m11916a(this.f9700b);
        }
    }
}
