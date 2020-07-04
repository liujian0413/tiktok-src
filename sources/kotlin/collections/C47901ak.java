package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: kotlin.collections.ak */
final class C47901ak<K, V> implements C47900aj<K, V> {

    /* renamed from: a */
    private final Map<K, V> f122751a;

    /* renamed from: b */
    private final C7562b<K, V> f122752b;

    /* renamed from: a */
    public final Map<K, V> mo120057a() {
        return this.f122751a;
    }

    public final void clear() {
        mo120057a().clear();
    }

    public final Set<Entry<K, V>> entrySet() {
        return m148838e();
    }

    public final Set<K> keySet() {
        return m148836c();
    }

    public final int size() {
        return m148835b();
    }

    public final Collection<V> values() {
        return m148837d();
    }

    /* renamed from: b */
    private int m148835b() {
        return mo120057a().size();
    }

    /* renamed from: c */
    private Set<K> m148836c() {
        return mo120057a().keySet();
    }

    /* renamed from: d */
    private Collection<V> m148837d() {
        return mo120057a().values();
    }

    /* renamed from: e */
    private Set<Entry<K, V>> m148838e() {
        return mo120057a().entrySet();
    }

    public final int hashCode() {
        return mo120057a().hashCode();
    }

    public final boolean isEmpty() {
        return mo120057a().isEmpty();
    }

    public final String toString() {
        return mo120057a().toString();
    }

    public final boolean containsKey(Object obj) {
        return mo120057a().containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return mo120057a().containsValue(obj);
    }

    public final boolean equals(Object obj) {
        return mo120057a().equals(obj);
    }

    public final V get(Object obj) {
        return mo120057a().get(obj);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        C7573i.m23587b(map, "from");
        mo120057a().putAll(map);
    }

    public final V remove(Object obj) {
        return mo120057a().remove(obj);
    }

    /* renamed from: a */
    public final V mo120056a(K k) {
        Map a = mo120057a();
        V v = a.get(k);
        if (v != null || a.containsKey(k)) {
            return v;
        }
        return this.f122752b.invoke(k);
    }

    public final V put(K k, V v) {
        return mo120057a().put(k, v);
    }

    public C47901ak(Map<K, V> map, C7562b<? super K, ? extends V> bVar) {
        C7573i.m23587b(map, "map");
        C7573i.m23587b(bVar, "default");
        this.f122751a = map;
        this.f122752b = bVar;
    }
}
