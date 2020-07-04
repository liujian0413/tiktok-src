package com.google.common.collect;

import com.google.common.base.C17439m;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMultimap<K, V> extends C18041n<K, V> {
    private static final long serialVersionUID = 0;
    private transient Comparator<? super K> keyComparator;
    private transient Comparator<? super V> valueComparator;

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public Comparator<? super K> keyComparator() {
        return this.keyComparator;
    }

    public Comparator<? super V> valueComparator() {
        return this.valueComparator;
    }

    /* access modifiers changed from: 0000 */
    public Map<K, Collection<V>> createAsMap() {
        return createMaybeNavigableAsMap();
    }

    public /* bridge */ /* synthetic */ Set entries() {
        return super.entries();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public NavigableSet<K> keySet() {
        return (NavigableSet) super.keySet();
    }

    public /* bridge */ /* synthetic */ C17882cb keys() {
        return super.keys();
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <K extends Comparable, V extends Comparable> TreeMultimap<K, V> create() {
        return new TreeMultimap<>(C17896ch.m59497b(), C17896ch.m59497b());
    }

    public NavigableMap<K, Collection<V>> asMap() {
        return (NavigableMap) super.asMap();
    }

    /* access modifiers changed from: 0000 */
    public SortedSet<V> createCollection() {
        return new TreeSet(this.valueComparator);
    }

    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ boolean putAll(C17862by byVar) {
        return super.putAll(byVar);
    }

    public /* bridge */ /* synthetic */ SortedSet removeAll(Object obj) {
        return super.removeAll(obj);
    }

    /* access modifiers changed from: 0000 */
    public Collection<V> createCollection(K k) {
        if (k == null) {
            keyComparator().compare(k, k);
        }
        return super.createCollection(k);
    }

    public NavigableSet<V> get(K k) {
        return (NavigableSet) super.get((Object) k);
    }

    public static <K extends Comparable, V extends Comparable> TreeMultimap<K, V> create(C17862by<? extends K, ? extends V> byVar) {
        return new TreeMultimap<>(C17896ch.m59497b(), C17896ch.m59497b(), byVar);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(keyComparator());
        objectOutputStream.writeObject(valueComparator());
        C17928cz.m59555a((C17862by<K, V>) this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.keyComparator = (Comparator) C17439m.m57962a((Comparator) objectInputStream.readObject());
        this.valueComparator = (Comparator) C17439m.m57962a((Comparator) objectInputStream.readObject());
        setMap(new TreeMap(this.keyComparator));
        C17928cz.m59553a((C17862by<K, V>) this, objectInputStream);
    }

    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public /* bridge */ /* synthetic */ SortedSet replaceValues(Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }

    TreeMultimap(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        super(new TreeMap(comparator));
        this.keyComparator = comparator;
        this.valueComparator = comparator2;
    }

    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    public static <K, V> TreeMultimap<K, V> create(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        return new TreeMultimap<>((Comparator) C17439m.m57962a(comparator), (Comparator) C17439m.m57962a(comparator2));
    }

    private TreeMultimap(Comparator<? super K> comparator, Comparator<? super V> comparator2, C17862by<? extends K, ? extends V> byVar) {
        this(comparator, comparator2);
        putAll(byVar);
    }
}
