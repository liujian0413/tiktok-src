package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ArrayListMultimap<K, V> extends C18049r<K, V> {
    private static final long serialVersionUID = 0;
    transient int expectedValuesPerKey;

    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    private ArrayListMultimap() {
        this(12, 3);
    }

    public static <K, V> ArrayListMultimap<K, V> create() {
        return new ArrayListMultimap<>();
    }

    public final /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    public final /* bridge */ /* synthetic */ Collection entries() {
        return super.entries();
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ /* synthetic */ C17882cb keys() {
        return super.keys();
    }

    public final /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public final /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    /* access modifiers changed from: 0000 */
    public final List<V> createCollection() {
        return new ArrayList(this.expectedValuesPerKey);
    }

    public final void trimToSize() {
        for (Collection collection : backingMap().values()) {
            ((ArrayList) collection).trimToSize();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C17928cz.m59555a((C17862by<K, V>) this, objectOutputStream);
    }

    public final /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public final /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* bridge */ /* synthetic */ List get(Object obj) {
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ boolean putAll(C17862by byVar) {
        return super.putAll(byVar);
    }

    public final /* bridge */ /* synthetic */ List removeAll(Object obj) {
        return super.removeAll(obj);
    }

    private ArrayListMultimap(C17862by<? extends K, ? extends V> byVar) {
        int i;
        int size = byVar.keySet().size();
        if (byVar instanceof ArrayListMultimap) {
            i = ((ArrayListMultimap) byVar).expectedValuesPerKey;
        } else {
            i = 3;
        }
        this(size, i);
        putAll(byVar);
    }

    public static <K, V> ArrayListMultimap<K, V> create(C17862by<? extends K, ? extends V> byVar) {
        return new ArrayListMultimap<>(byVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 3;
        int a = C17928cz.m59551a(objectInputStream);
        setMap(C18057x.m59716a());
        C17928cz.m59554a((C17862by<K, V>) this, objectInputStream, a);
    }

    public final /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ List replaceValues(Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }

    private ArrayListMultimap(int i, int i2) {
        super(C17898cj.m59507a(i));
        C18053v.m59700a(i2, "expectedValuesPerKey");
        this.expectedValuesPerKey = i2;
    }

    public static <K, V> ArrayListMultimap<K, V> create(int i, int i2) {
        return new ArrayListMultimap<>(i, i2);
    }

    public final /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }
}
