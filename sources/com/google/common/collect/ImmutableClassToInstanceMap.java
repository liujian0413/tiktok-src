package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.collect.ImmutableMap.C17591a;
import com.google.common.primitives.C18147e;
import java.io.Serializable;
import java.util.Map;
import java.util.Map.Entry;

public final class ImmutableClassToInstanceMap<B> extends C17750aw<Class<? extends B>, B> implements C18052u<B>, Serializable {
    private static final ImmutableClassToInstanceMap<Object> EMPTY = new ImmutableClassToInstanceMap<>(ImmutableMap.m58576of());
    private final ImmutableMap<Class<? extends B>, B> delegate;

    /* renamed from: com.google.common.collect.ImmutableClassToInstanceMap$a */
    public static final class C17581a<B> {

        /* renamed from: a */
        private final C17591a<Class<? extends B>, B> f48675a = ImmutableMap.builder();

        /* renamed from: a */
        public final ImmutableClassToInstanceMap<B> mo45385a() {
            ImmutableMap b = this.f48675a.mo45379b();
            if (b.isEmpty()) {
                return ImmutableClassToInstanceMap.m58521of();
            }
            return new ImmutableClassToInstanceMap<>(b);
        }

        /* renamed from: a */
        public final <T extends B> C17581a<B> mo45384a(Map<? extends Class<? extends T>, ? extends T> map) {
            for (Entry entry : map.entrySet()) {
                Class cls = (Class) entry.getKey();
                this.f48675a.mo45375a(cls, m58523a(cls, entry.getValue()));
            }
            return this;
        }

        /* renamed from: a */
        private static <B, T extends B> T m58523a(Class<T> cls, B b) {
            return C18147e.m59984a(cls).cast(b);
        }
    }

    /* renamed from: of */
    public static <B> ImmutableClassToInstanceMap<B> m58521of() {
        return EMPTY;
    }

    /* access modifiers changed from: protected */
    public final Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    public static <B> C17581a<B> builder() {
        return new C17581a<>();
    }

    /* access modifiers changed from: 0000 */
    public final Object readResolve() {
        if (isEmpty()) {
            return m58521of();
        }
        return this;
    }

    private ImmutableClassToInstanceMap(ImmutableMap<Class<? extends B>, B> immutableMap) {
        this.delegate = immutableMap;
    }

    public final <T extends B> T getInstance(Class<T> cls) {
        return this.delegate.get(C17439m.m57962a(cls));
    }

    public static <B, S extends B> ImmutableClassToInstanceMap<B> copyOf(Map<? extends Class<? extends S>, ? extends S> map) {
        if (map instanceof ImmutableClassToInstanceMap) {
            return (ImmutableClassToInstanceMap) map;
        }
        return new C17581a().mo45384a(map).mo45385a();
    }

    public final <T extends B> T putInstance(Class<T> cls, T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <B, T extends B> ImmutableClassToInstanceMap<B> m58522of(Class<T> cls, T t) {
        return new ImmutableClassToInstanceMap<>(ImmutableMap.m58577of(cls, t));
    }
}
