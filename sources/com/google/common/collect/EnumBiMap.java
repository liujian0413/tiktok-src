package com.google.common.collect;

import com.google.common.base.C17439m;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public final class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends C17689a<K, V> {
    private static final long serialVersionUID = 0;
    private transient Class<K> keyType;
    private transient Class<V> valueType;

    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public final Class<K> keyType() {
        return this.keyType;
    }

    public final Class<V> valueType() {
        return this.valueType;
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

    /* access modifiers changed from: 0000 */
    public final K checkKey(K k) {
        return (Enum) C17439m.m57962a(k);
    }

    /* access modifiers changed from: 0000 */
    public final V checkValue(V v) {
        return (Enum) C17439m.m57962a(v);
    }

    public final /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public static <K extends Enum<K>, V extends Enum<V>> EnumBiMap<K, V> create(Map<K, V> map) {
        EnumBiMap<K, V> create = create(inferKeyType(map), inferValueType(map));
        create.putAll(map);
        return create;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.keyType);
        objectOutputStream.writeObject(this.valueType);
        C17928cz.m59561a((Map<K, V>) this, objectOutputStream);
    }

    static <K extends Enum<K>> Class<K> inferKeyType(Map<K, ?> map) {
        if (map instanceof EnumBiMap) {
            return ((EnumBiMap) map).keyType();
        }
        if (map instanceof EnumHashBiMap) {
            return ((EnumHashBiMap) map).keyType();
        }
        C17439m.m57968a(!map.isEmpty());
        return ((Enum) map.keySet().iterator().next()).getDeclaringClass();
    }

    private static <V extends Enum<V>> Class<V> inferValueType(Map<?, V> map) {
        if (map instanceof EnumBiMap) {
            return ((EnumBiMap) map).valueType;
        }
        C17439m.m57968a(!map.isEmpty());
        return ((Enum) map.values().iterator().next()).getDeclaringClass();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.keyType = (Class) objectInputStream.readObject();
        this.valueType = (Class) objectInputStream.readObject();
        setDelegates(C17997dv.m59638a(new EnumMap(this.keyType)), C17997dv.m59638a(new EnumMap(this.valueType)));
        C17928cz.m59559a((Map<K, V>) this, objectInputStream);
    }

    public static <K extends Enum<K>, V extends Enum<V>> EnumBiMap<K, V> create(Class<K> cls, Class<V> cls2) {
        return new EnumBiMap<>(cls, cls2);
    }

    private EnumBiMap(Class<K> cls, Class<V> cls2) {
        super((Map<K, V>) C17997dv.m59638a(new EnumMap(cls)), (Map<V, K>) C17997dv.m59638a(new EnumMap(cls2)));
        this.keyType = cls;
        this.valueType = cls2;
    }
}
