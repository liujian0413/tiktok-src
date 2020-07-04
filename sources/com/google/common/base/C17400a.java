package com.google.common.base;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.common.base.a */
final class C17400a<T> extends Optional<T> {

    /* renamed from: a */
    static final C17400a<Object> f48342a = new C17400a<>();
    private static final long serialVersionUID = 0;

    private C17400a() {
    }

    /* renamed from: a */
    static <T> Optional<T> m57878a() {
        return f48342a;
    }

    private Object readResolve() {
        return f48342a;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final boolean isPresent() {
        return false;
    }

    public final T orNull() {
        return null;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    public final Set<T> asSet() {
        return Collections.emptySet();
    }

    public final T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    /* renamed from: or */
    public final Optional<T> mo44894or(Optional<? extends T> optional) {
        return (Optional) C17439m.m57962a(optional);
    }

    public final <V> Optional<V> transform(C17427g<? super T, V> gVar) {
        C17439m.m57962a(gVar);
        return Optional.absent();
    }

    /* renamed from: or */
    public final T mo44895or(C17457s<? extends T> sVar) {
        return C17439m.m57963a(sVar.mo44946a(), (Object) "use Optional.orNull() instead of a Supplier that returns null");
    }

    /* renamed from: or */
    public final T mo44896or(T t) {
        return C17439m.m57963a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
    }
}
