package com.google.common.collect;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.common.collect.j */
abstract class C18035j<K, V> extends C17854e<K, V> implements NavigableMap<K, V> {

    /* renamed from: com.google.common.collect.j$a */
    final class C18037a extends C17847a<K, V> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final NavigableMap<K, V> mo46117a() {
            return C18035j.this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Iterator<Entry<K, V>> mo46118b() {
            return C18035j.this.mo45765a();
        }

        private C18037a() {
        }
    }

    C18035j() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract Iterator<Entry<K, V>> mo45765a();

    public NavigableMap<K, V> descendingMap() {
        return new C18037a();
    }

    public Set<K> keySet() {
        return navigableKeySet();
    }

    public NavigableSet<K> navigableKeySet() {
        return new C17857g(this);
    }

    public NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    public Entry<K, V> firstEntry() {
        return (Entry) C17782br.m59120b(mo45214b(), null);
    }

    public Entry<K, V> lastEntry() {
        return (Entry) C17782br.m59120b(mo45765a(), null);
    }

    public Entry<K, V> pollFirstEntry() {
        return (Entry) C17782br.m59132g(mo45214b());
    }

    public Entry<K, V> pollLastEntry() {
        return (Entry) C17782br.m59132g(mo45765a());
    }

    public K firstKey() {
        Entry firstEntry = firstEntry();
        if (firstEntry != null) {
            return firstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    public K lastKey() {
        Entry lastEntry = lastEntry();
        if (lastEntry != null) {
            return lastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    public SortedMap<K, V> headMap(K k) {
        return headMap(k, false);
    }

    public SortedMap<K, V> tailMap(K k) {
        return tailMap(k, true);
    }

    public Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    public K ceilingKey(K k) {
        return C17839bx.m59330a(ceilingEntry(k));
    }

    public Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    public K floorKey(K k) {
        return C17839bx.m59330a(floorEntry(k));
    }

    public Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    public K higherKey(K k) {
        return C17839bx.m59330a(higherEntry(k));
    }

    public Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    public K lowerKey(K k) {
        return C17839bx.m59330a(lowerEntry(k));
    }

    public SortedMap<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }
}
