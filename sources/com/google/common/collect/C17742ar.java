package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.base.C17440n;
import com.google.common.base.Optional;
import java.util.Iterator;

/* renamed from: com.google.common.collect.ar */
public abstract class C17742ar<E> implements Iterable<E> {

    /* renamed from: a */
    private final Optional<Iterable<E>> f48979a;

    protected C17742ar() {
        this.f48979a = Optional.absent();
    }

    /* renamed from: b */
    private Iterable<E> m59040b() {
        return (Iterable) this.f48979a.mo44896or(this);
    }

    public String toString() {
        return C17777bq.m59092a(m59040b());
    }

    /* renamed from: a */
    public final ImmutableSet<E> mo45888a() {
        return ImmutableSet.copyOf(m59040b());
    }

    /* renamed from: a */
    public static <E> C17742ar<E> m59037a(final Iterable<E> iterable) {
        if (iterable instanceof C17742ar) {
            return (C17742ar) iterable;
        }
        return new C17742ar<E>(iterable) {
            public final Iterator<E> iterator() {
                return iterable.iterator();
            }
        };
    }

    C17742ar(Iterable<E> iterable) {
        C17439m.m57962a(iterable);
        if (this == iterable) {
            iterable = null;
        }
        this.f48979a = Optional.fromNullable(iterable);
    }

    /* renamed from: a */
    private static <T> C17742ar<T> m59039a(final Iterable<? extends T>... iterableArr) {
        for (int i = 0; i < 2; i++) {
            C17439m.m57962a(iterableArr[i]);
        }
        return new C17742ar<T>() {
            public final Iterator<T> iterator() {
                return C17782br.m59129e(new C17754b<Iterator<? extends T>>(iterableArr.length) {
                    /* access modifiers changed from: private */
                    /* renamed from: b */
                    public Iterator<? extends T> mo45206a(int i) {
                        return iterableArr[i].iterator();
                    }
                });
            }
        };
    }

    /* renamed from: a */
    public final C17742ar<E> mo45889a(C17440n<? super E> nVar) {
        return m59037a(C17777bq.m59098b(m59040b(), nVar));
    }

    /* renamed from: a */
    public static <T> C17742ar<T> m59038a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return m59039a((Iterable<? extends T>[]) new Iterable[]{iterable, iterable2});
    }
}
