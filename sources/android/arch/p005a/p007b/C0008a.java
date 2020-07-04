package android.arch.p005a.p007b;

import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: android.arch.a.b.a */
public final class C0008a<K, V> extends C0009b<K, V> {

    /* renamed from: d */
    private HashMap<K, C0013c<K, V>> f13d = new HashMap<>();

    /* renamed from: c */
    public final boolean mo24c(K k) {
        return this.f13d.containsKey(k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0013c<K, V> mo21a(K k) {
        return (C0013c) this.f13d.get(k);
    }

    /* renamed from: b */
    public final V mo23b(K k) {
        V b = super.mo23b(k);
        this.f13d.remove(k);
        return b;
    }

    /* renamed from: d */
    public final Entry<K, V> mo25d(K k) {
        if (mo24c(k)) {
            return ((C0013c) this.f13d.get(k)).f21d;
        }
        return null;
    }

    /* renamed from: a */
    public final V mo22a(K k, V v) {
        C0013c a = mo21a(k);
        if (a != null) {
            return a.f19b;
        }
        this.f13d.put(k, mo27b(k, v));
        return null;
    }
}
