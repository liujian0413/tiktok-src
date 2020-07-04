package com.google.api.client.repackaged.com.google.common.base;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.api.client.repackaged.com.google.common.base.a */
final class C17299a<T> extends Optional<T> {

    /* renamed from: a */
    static final C17299a<Object> f48169a = new C17299a<>();
    private static final long serialVersionUID = 0;

    private C17299a() {
    }

    /* renamed from: a */
    static <T> Optional<T> m57638a() {
        return f48169a;
    }

    private Object readResolve() {
        return f48169a;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 1502476572;
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
    public final Optional<T> mo44736or(Optional<? extends T> optional) {
        return (Optional) C17321g.m57682a(optional);
    }

    public final <V> Optional<V> transform(C17318d<? super T, V> dVar) {
        C17321g.m57682a(dVar);
        return Optional.absent();
    }

    /* renamed from: or */
    public final T mo44737or(C17329k<? extends T> kVar) {
        return C17321g.m57683a(kVar.mo44759a(), (Object) "use Optional.orNull() instead of a Supplier that returns null");
    }

    /* renamed from: or */
    public final T mo44738or(T t) {
        return C17321g.m57683a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
    }
}
