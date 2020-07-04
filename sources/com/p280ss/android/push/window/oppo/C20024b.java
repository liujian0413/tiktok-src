package com.p280ss.android.push.window.oppo;

import com.C1642a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.push.window.oppo.b */
public final class C20024b<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f54178a;

    /* renamed from: b */
    private int f54179b;

    /* renamed from: c */
    private int f54180c;

    /* renamed from: d */
    private int f54181d;

    /* renamed from: e */
    private int f54182e;

    /* renamed from: f */
    private int f54183f;

    /* renamed from: g */
    private int f54184g;

    /* renamed from: b */
    private int m65963b(K k, V v) {
        return 1;
    }

    /* renamed from: a */
    public final synchronized void mo53611a() {
        m65962a(-1);
    }

    /* renamed from: b */
    public final synchronized Map<K, V> mo53612b() {
        return new LinkedHashMap(this.f54178a);
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f54183f + this.f54184g;
        if (i2 != 0) {
            i = (this.f54183f * 100) / i2;
        } else {
            i = 0;
        }
        return C1642a.m8034a("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f54180c), Integer.valueOf(this.f54183f), Integer.valueOf(this.f54184g), Integer.valueOf(i)});
    }

    public C20024b(int i) {
        if (i > 0) {
            this.f54180c = i;
            this.f54178a = new LinkedHashMap<>(0, 0.75f, false);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    public final synchronized V mo53609a(K k) {
        V remove;
        if (k != null) {
            remove = this.f54178a.remove(k);
            if (remove != null) {
                this.f54179b -= m65963b(k, remove);
            }
        } else {
            throw new NullPointerException("key == null");
        }
        return remove;
    }

    /* renamed from: a */
    private void m65962a(int i) {
        while (this.f54179b > i && !this.f54178a.isEmpty()) {
            Entry entry = (Entry) this.f54178a.entrySet().iterator().next();
            if (entry == null) {
                break;
            }
            Object key = entry.getKey();
            Object value = entry.getValue();
            this.f54178a.remove(key);
            this.f54179b -= m65963b(key, value);
            this.f54182e++;
        }
        if (this.f54179b < 0 || (this.f54178a.isEmpty() && this.f54179b != 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(".sizeOf() is reporting inconsistent results!");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final synchronized V mo53610a(K k, V v) {
        V put;
        if (k != null) {
            this.f54181d++;
            this.f54179b += m65963b(k, v);
            put = this.f54178a.put(k, v);
            if (put != null) {
                this.f54179b -= m65963b(k, put);
            }
            m65962a(this.f54180c);
        } else {
            throw new NullPointerException("key == null || value == null");
        }
        return put;
    }
}
