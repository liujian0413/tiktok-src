package com.google.api.client.repackaged.com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    Optional() {
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    /* renamed from: or */
    public abstract Optional<T> mo44736or(Optional<? extends T> optional);

    /* renamed from: or */
    public abstract T mo44737or(C17329k<? extends T> kVar);

    /* renamed from: or */
    public abstract T mo44738or(T t);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(C17318d<? super T, V> dVar);

    public static <T> Optional<T> absent() {
        return C17299a.m57638a();
    }

    public static <T> Optional<T> fromNullable(T t) {
        if (t == null) {
            return absent();
        }
        return new C17322h(t);
    }

    /* renamed from: of */
    public static <T> Optional<T> m57633of(T t) {
        return new C17322h(C17321g.m57682a(t));
    }

    public static <T> Iterable<T> presentInstances(final Iterable<? extends Optional<? extends T>> iterable) {
        C17321g.m57682a(iterable);
        return new Iterable<T>() {
            public final Iterator<T> iterator() {
                return new C17300b<T>() {

                    /* renamed from: b */
                    private final Iterator<? extends Optional<? extends T>> f48168b = ((Iterator) C17321g.m57682a(iterable.iterator()));

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final T mo44743a() {
                        while (this.f48168b.hasNext()) {
                            Optional optional = (Optional) this.f48168b.next();
                            if (optional.isPresent()) {
                                return optional.get();
                            }
                        }
                        return mo44744b();
                    }
                };
            }
        };
    }
}
