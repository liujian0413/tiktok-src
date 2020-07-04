package com.google.api.client.repackaged.com.google.common.base;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.api.client.repackaged.com.google.common.base.h */
final class C17322h<T> extends Optional<T> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final T f48203a;

    public final T get() {
        return this.f48203a;
    }

    public final boolean isPresent() {
        return true;
    }

    public final T orNull() {
        return this.f48203a;
    }

    public final Set<T> asSet() {
        return Collections.singleton(this.f48203a);
    }

    public final int hashCode() {
        return this.f48203a.hashCode() + 1502476572;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Optional.of(");
        sb.append(this.f48203a);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: or */
    public final Optional<T> mo44736or(Optional<? extends T> optional) {
        C17321g.m57682a(optional);
        return this;
    }

    C17322h(T t) {
        this.f48203a = t;
    }

    /* renamed from: or */
    public final T mo44737or(C17329k<? extends T> kVar) {
        C17321g.m57682a(kVar);
        return this.f48203a;
    }

    /* renamed from: or */
    public final T mo44738or(T t) {
        C17321g.m57683a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return this.f48203a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17322h)) {
            return false;
        }
        return this.f48203a.equals(((C17322h) obj).f48203a);
    }

    public final <V> Optional<V> transform(C17318d<? super T, V> dVar) {
        return new C17322h(C17321g.m57683a(dVar.mo44753a(this.f48203a), (Object) "the Function passed to Optional.transform() must not return null."));
    }
}
