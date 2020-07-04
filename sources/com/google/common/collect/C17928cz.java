package com.google.common.collect;

import com.google.common.collect.C17882cb.C17883a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.common.collect.cz */
final class C17928cz {

    /* renamed from: com.google.common.collect.cz$a */
    static final class C17930a<T> {

        /* renamed from: a */
        private final Field f49230a;

        private C17930a(Field field) {
            this.f49230a = field;
            field.setAccessible(true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo46285a(T t, Object obj) {
            try {
                this.f49230a.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo46284a(T t, int i) {
            try {
                this.f49230a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: a */
    static <K, V> void m59561a(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Entry entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* renamed from: a */
    static <K, V> void m59560a(Map<K, V> map, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* renamed from: a */
    static int m59551a(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    /* renamed from: a */
    static <K, V> void m59553a(C17862by<K, V> byVar, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        m59554a(byVar, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: a */
    static <T> C17930a<T> m59552a(Class<T> cls, String str) {
        try {
            return new C17930a<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    static <K, V> void m59555a(C17862by<K, V> byVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(byVar.asMap().size());
        for (Entry entry : byVar.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object writeObject : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    /* renamed from: a */
    static <E> void m59556a(C17882cb<E> cbVar, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        m59557a(cbVar, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: a */
    static <E> void m59558a(C17882cb<E> cbVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(cbVar.entrySet().size());
        for (C17883a aVar : cbVar.entrySet()) {
            objectOutputStream.writeObject(aVar.mo45308b());
            objectOutputStream.writeInt(aVar.mo45307a());
        }
    }

    /* renamed from: a */
    static <K, V> void m59559a(Map<K, V> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        m59560a(map, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: a */
    static <K, V> void m59554a(C17862by<K, V> byVar, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = byVar.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* renamed from: a */
    static <E> void m59557a(C17882cb<E> cbVar, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            cbVar.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }
}
