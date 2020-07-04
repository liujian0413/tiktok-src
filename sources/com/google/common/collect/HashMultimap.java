package com.google.common.collect;

import com.google.common.base.C17439m;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class HashMultimap<K, V> extends C17760bf<K, V> {
    private static final long serialVersionUID = 0;
    transient int expectedValuesPerKey;

    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    private HashMultimap() {
        this(12, 2);
    }

    public static <K, V> HashMultimap<K, V> create() {
        return new HashMultimap<>();
    }

    public final /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    public final /* bridge */ /* synthetic */ Set entries() {
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
    public final Set<V> createCollection() {
        return C17898cj.m59511c(this.expectedValuesPerKey);
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

    public final /* bridge */ /* synthetic */ Set get(Object obj) {
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ boolean putAll(C17862by byVar) {
        return super.putAll(byVar);
    }

    public final /* bridge */ /* synthetic */ Set removeAll(Object obj) {
        return super.removeAll(obj);
    }

    public static <K, V> HashMultimap<K, V> create(C17862by<? extends K, ? extends V> byVar) {
        return new HashMultimap<>(byVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 2;
        int a = C17928cz.m59551a(objectInputStream);
        setMap(C17898cj.m59507a(12));
        C17928cz.m59554a((C17862by<K, V>) this, objectInputStream, a);
    }

    private HashMultimap(C17862by<? extends K, ? extends V> byVar) {
        super(C17898cj.m59507a(byVar.keySet().size()));
        this.expectedValuesPerKey = 2;
        putAll(byVar);
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

    public final /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }

    public static <K, V> HashMultimap<K, V> create(int i, int i2) {
        return new HashMultimap<>(i, i2);
    }

    public final /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    private HashMultimap(int i, int i2) {
        boolean z;
        super(C17898cj.m59507a(i));
        this.expectedValuesPerKey = 2;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57968a(z);
        this.expectedValuesPerKey = i2;
    }
}
