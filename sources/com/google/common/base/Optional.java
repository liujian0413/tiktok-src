package com.google.common.base;

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
    public abstract Optional<T> mo44894or(Optional<? extends T> optional);

    /* renamed from: or */
    public abstract T mo44895or(C17457s<? extends T> sVar);

    /* renamed from: or */
    public abstract T mo44896or(T t);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(C17427g<? super T, V> gVar);

    public static <T> Optional<T> absent() {
        return C17400a.m57878a();
    }

    public static <T> Optional<T> fromNullable(T t) {
        if (t == null) {
            return absent();
        }
        return new C17453p(t);
    }

    /* renamed from: of */
    public static <T> Optional<T> m57873of(T t) {
        return new C17453p(C17439m.m57962a(t));
    }

    public static <T> Iterable<T> presentInstances(final Iterable<? extends Optional<? extends T>> iterable) {
        C17439m.m57962a(iterable);
        return new Iterable<T>() {
            public final Iterator<T> iterator() {
                return new C17401b<T>() {

                    /* renamed from: b */
                    private final Iterator<? extends Optional<? extends T>> f48341b = ((Iterator) C17439m.m57962a(iterable.iterator()));

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final T mo44901a() {
                        while (this.f48341b.hasNext()) {
                            Optional optional = (Optional) this.f48341b.next();
                            if (optional.isPresent()) {
                                return optional.get();
                            }
                        }
                        return mo44905b();
                    }
                };
            }
        };
    }
}
