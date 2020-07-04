package android.support.p022v4.util;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.util.ArrayMap */
public class ArrayMap<K, V> extends C0904k<K, V> implements Map<K, V> {

    /* renamed from: a */
    C0895g<K, V> f3106a;

    public ArrayMap() {
    }

    /* renamed from: a */
    private C0895g<K, V> m3754a() {
        if (this.f3106a == null) {
            this.f3106a = new C0895g<K, V>() {
                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final Map<K, V> mo3300b() {
                    return ArrayMap.this;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final int mo3293a() {
                    return ArrayMap.this.f3162h;
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public final void mo3301c() {
                    ArrayMap.this.clear();
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final int mo3299b(Object obj) {
                    return ArrayMap.this.mo3416b(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final int mo3294a(Object obj) {
                    return ArrayMap.this.mo3413a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo3297a(int i) {
                    ArrayMap.this.mo3422d(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final Object mo3295a(int i, int i2) {
                    return ArrayMap.this.f3161g[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final V mo3296a(int i, V v) {
                    return ArrayMap.this.mo3414a(i, v);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo3298a(K k, V v) {
                    ArrayMap.this.put(k, v);
                }
            };
        }
        return this.f3106a;
    }

    public Set<Entry<K, V>> entrySet() {
        return m3754a().mo3352d();
    }

    public Set<K> keySet() {
        return m3754a().mo3353e();
    }

    public Collection<V> values() {
        return m3754a().mo3354f();
    }

    public ArrayMap(int i) {
        super(i);
    }

    /* renamed from: a */
    public final boolean mo3288a(Collection<?> collection) {
        return C0895g.m3818c(this, collection);
    }

    public ArrayMap(C0904k kVar) {
        super(kVar);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo3415a(this.f3162h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
