package com.google.common.collect;

import com.google.common.base.C17439m;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class EnumHashBiMap<K extends Enum<K>, V> extends C17689a<K, V> {
    private static final long serialVersionUID = 0;
    private transient Class<K> keyType;

    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public final Class<K> keyType() {
        return this.keyType;
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ /* synthetic */ C18050s inverse() {
        return super.inverse();
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    public final /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> create(Class<K> cls) {
        return new EnumHashBiMap<>(cls);
    }

    /* access modifiers changed from: 0000 */
    public final K checkKey(K k) {
        return (Enum) C17439m.m57962a(k);
    }

    public final /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        return super.remove(obj);
    }

    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> create(Map<K, ? extends V> map) {
        EnumHashBiMap<K, V> create = create(EnumBiMap.inferKeyType(map));
        create.putAll(map);
        return create;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.keyType);
        C17928cz.m59561a((Map<K, V>) this, objectOutputStream);
    }

    private EnumHashBiMap(Class<K> cls) {
        super((Map<K, V>) C17997dv.m59638a(new EnumMap(cls)), (Map<V, K>) C17839bx.m59333a(((Enum[]) cls.getEnumConstants()).length));
        this.keyType = cls;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.keyType = (Class) objectInputStream.readObject();
        setDelegates(C17997dv.m59638a(new EnumMap(this.keyType)), new HashMap((((Enum[]) this.keyType.getEnumConstants()).length * 3) / 2));
        C17928cz.m59559a((Map<K, V>) this, objectInputStream);
    }

    public final V forcePut(K k, V v) {
        return super.forcePut(k, v);
    }

    public final V put(K k, V v) {
        return super.put(k, v);
    }
}
