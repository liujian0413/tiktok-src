package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.primitives.C18147e;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class MutableClassToInstanceMap<B> extends C17750aw<Class<? extends B>, B> implements C18052u<B>, Serializable {
    private final Map<Class<? extends B>, B> delegate;

    /* renamed from: com.google.common.collect.MutableClassToInstanceMap$a */
    static final class C17658a<B> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Map<Class<? extends B>, B> f48842a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return MutableClassToInstanceMap.create(this.f48842a);
        }

        C17658a(Map<Class<? extends B>, B> map) {
            this.f48842a = map;
        }
    }

    /* access modifiers changed from: protected */
    public final Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    public final Set<Entry<Class<? extends B>, B>> entrySet() {
        return new C17757bc<Entry<Class<? extends B>, B>>() {
            public final Object[] toArray() {
                return standardToArray();
            }

            public final Iterator<Entry<Class<? extends B>, B>> iterator() {
                return new C17992dq<Entry<Class<? extends B>, B>, Entry<Class<? extends B>, B>>(delegate().iterator()) {
                    /* renamed from: a */
                    private static Entry<Class<? extends B>, B> m58789a(Entry<Class<? extends B>, B> entry) {
                        return MutableClassToInstanceMap.checkedEntry(entry);
                    }

                    /* access modifiers changed from: 0000 */
                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ Object mo45666a(Object obj) {
                        return m58789a((Entry) obj);
                    }
                };
            }

            /* access modifiers changed from: protected */
            public final Set<Entry<Class<? extends B>, B>> delegate() {
                return MutableClassToInstanceMap.this.delegate().entrySet();
            }

            public final <T> T[] toArray(T[] tArr) {
                return standardToArray(tArr);
            }
        };
    }

    public static <B> MutableClassToInstanceMap<B> create() {
        return new MutableClassToInstanceMap<>(new HashMap());
    }

    private Object writeReplace() {
        return new C17658a(delegate());
    }

    static <B> Entry<Class<? extends B>, B> checkedEntry(final Entry<Class<? extends B>, B> entry) {
        return new C17751ax<Class<? extends B>, B>() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Entry<Class<? extends B>, B> delegate() {
                return entry;
            }

            public final B setValue(B b) {
                return super.setValue(MutableClassToInstanceMap.cast((Class) getKey(), b));
            }
        };
    }

    public static <B> MutableClassToInstanceMap<B> create(Map<Class<? extends B>, B> map) {
        return new MutableClassToInstanceMap<>(map);
    }

    private MutableClassToInstanceMap(Map<Class<? extends B>, B> map) {
        this.delegate = (Map) C17439m.m57962a(map);
    }

    public final <T extends B> T getInstance(Class<T> cls) {
        return cast(cls, get(cls));
    }

    public final void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Entry entry : linkedHashMap.entrySet()) {
            cast((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }

    public static <B, T extends B> T cast(Class<T> cls, B b) {
        return C18147e.m59984a(cls).cast(b);
    }

    public final B put(Class<? extends B> cls, B b) {
        return super.put(cls, cast(cls, b));
    }

    public final <T extends B> T putInstance(Class<T> cls, T t) {
        return cast(cls, put(cls, (B) t));
    }
}
