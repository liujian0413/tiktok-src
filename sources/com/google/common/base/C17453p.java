package com.google.common.base;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.common.base.p */
final class C17453p<T> extends Optional<T> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final T f48411a;

    public final T get() {
        return this.f48411a;
    }

    public final boolean isPresent() {
        return true;
    }

    public final T orNull() {
        return this.f48411a;
    }

    public final Set<T> asSet() {
        return Collections.singleton(this.f48411a);
    }

    public final int hashCode() {
        return this.f48411a.hashCode() + 1502476572;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Optional.of(");
        sb.append(this.f48411a);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: or */
    public final Optional<T> mo44894or(Optional<? extends T> optional) {
        C17439m.m57962a(optional);
        return this;
    }

    C17453p(T t) {
        this.f48411a = t;
    }

    /* renamed from: or */
    public final T mo44895or(C17457s<? extends T> sVar) {
        C17439m.m57962a(sVar);
        return this.f48411a;
    }

    /* renamed from: or */
    public final T mo44896or(T t) {
        C17439m.m57963a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return this.f48411a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17453p)) {
            return false;
        }
        return this.f48411a.equals(((C17453p) obj).f48411a);
    }

    public final <V> Optional<V> transform(C17427g<? super T, V> gVar) {
        return new C17453p(C17439m.m57963a(gVar.mo44914b(this.f48411a), (Object) "the Function passed to Optional.transform() must not return null."));
    }
}
