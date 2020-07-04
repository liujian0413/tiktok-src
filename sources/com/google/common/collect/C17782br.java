package com.google.common.collect;

import com.google.common.base.C17427g;
import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import com.google.common.base.C17440n;
import com.google.common.base.Optional;
import com.google.common.primitives.C18143c;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

/* renamed from: com.google.common.collect.br */
public final class C17782br {

    /* renamed from: com.google.common.collect.br$a */
    static final class C17787a<T> extends C17754b<T> {

        /* renamed from: a */
        static final C17996du<Object> f49019a = new C17787a(new Object[0], 0, 0, 0);

        /* renamed from: b */
        private final T[] f49020b;

        /* renamed from: c */
        private final int f49021c = 0;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final T mo45206a(int i) {
            return this.f49020b[this.f49021c + i];
        }

        private C17787a(T[] tArr, int i, int i2, int i3) {
            super(0, 0);
            this.f49020b = tArr;
        }
    }

    /* renamed from: com.google.common.collect.br$b */
    static class C17788b<T> implements Iterator<T> {

        /* renamed from: a */
        private Iterator<? extends T> f49022a;

        /* renamed from: b */
        private Iterator<? extends T> f49023b = C17782br.m59108a();

        /* renamed from: c */
        private Iterator<? extends Iterator<? extends T>> f49024c;

        /* renamed from: d */
        private Deque<Iterator<? extends Iterator<? extends T>>> f49025d;

        public final T next() {
            if (hasNext()) {
                this.f49022a = this.f49023b;
                return this.f49023b.next();
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            boolean z;
            if (this.f49022a != null) {
                z = true;
            } else {
                z = false;
            }
            C18053v.m59703a(z);
            this.f49022a.remove();
            this.f49022a = null;
        }

        /* renamed from: a */
        private Iterator<? extends Iterator<? extends T>> m59139a() {
            while (true) {
                if (this.f49024c != null && this.f49024c.hasNext()) {
                    return this.f49024c;
                }
                if (this.f49025d != null && !this.f49025d.isEmpty()) {
                    this.f49024c = (Iterator) this.f49025d.removeFirst();
                }
            }
            return null;
        }

        public final boolean hasNext() {
            while (!((Iterator) C17439m.m57962a(this.f49023b)).hasNext()) {
                this.f49024c = m59139a();
                if (this.f49024c == null) {
                    return false;
                }
                this.f49023b = (Iterator) this.f49024c.next();
                if (this.f49023b instanceof C17788b) {
                    C17788b bVar = (C17788b) this.f49023b;
                    this.f49023b = bVar.f49023b;
                    if (this.f49025d == null) {
                        this.f49025d = new ArrayDeque();
                    }
                    this.f49025d.addFirst(this.f49024c);
                    if (bVar.f49025d != null) {
                        while (!bVar.f49025d.isEmpty()) {
                            this.f49025d.addFirst(bVar.f49025d.removeLast());
                        }
                    }
                    this.f49024c = bVar.f49024c;
                }
            }
            return true;
        }

        C17788b(Iterator<? extends Iterator<? extends T>> it) {
            this.f49024c = (Iterator) C17439m.m57962a(it);
        }
    }

    /* renamed from: com.google.common.collect.br$c */
    enum C17789c implements Iterator<Object> {
        INSTANCE;

        public final boolean hasNext() {
            return false;
        }

        public final Object next() {
            throw new NoSuchElementException();
        }

        public final void remove() {
            C18053v.m59703a(false);
        }
    }

    /* renamed from: com.google.common.collect.br$d */
    static class C17790d<T> extends C17995dt<T> {

        /* renamed from: a */
        final Queue<C17897ci<T>> f49028a;

        public final boolean hasNext() {
            if (!this.f49028a.isEmpty()) {
                return true;
            }
            return false;
        }

        public final T next() {
            C17897ci ciVar = (C17897ci) this.f49028a.remove();
            T next = ciVar.next();
            if (ciVar.hasNext()) {
                this.f49028a.add(ciVar);
            }
            return next;
        }

        public C17790d(Iterable<? extends Iterator<? extends T>> iterable, final Comparator<? super T> comparator) {
            this.f49028a = new PriorityQueue(2, new Comparator<C17897ci<T>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public int compare(C17897ci<T> ciVar, C17897ci<T> ciVar2) {
                    return comparator.compare(ciVar.mo45998a(), ciVar2.mo45998a());
                }
            });
            for (Iterator it : iterable) {
                if (it.hasNext()) {
                    this.f49028a.add(C17782br.m59134i(it));
                }
            }
        }
    }

    /* renamed from: com.google.common.collect.br$e */
    static class C17792e<E> implements C17897ci<E> {

        /* renamed from: a */
        private final Iterator<? extends E> f49031a;

        /* renamed from: b */
        private boolean f49032b;

        /* renamed from: c */
        private E f49033c;

        public final void remove() {
            C17439m.m57982b(!this.f49032b, (Object) "Can't remove after you've peeked at next");
            this.f49031a.remove();
        }

        /* renamed from: a */
        public final E mo45998a() {
            if (!this.f49032b) {
                this.f49033c = this.f49031a.next();
                this.f49032b = true;
            }
            return this.f49033c;
        }

        public final boolean hasNext() {
            if (this.f49032b || this.f49031a.hasNext()) {
                return true;
            }
            return false;
        }

        public final E next() {
            if (!this.f49032b) {
                return this.f49031a.next();
            }
            E e = this.f49033c;
            this.f49032b = false;
            this.f49033c = null;
            return e;
        }

        public C17792e(Iterator<? extends E> it) {
            this.f49031a = (Iterator) C17439m.m57962a(it);
        }
    }

    /* renamed from: b */
    static <T> Iterator<T> m59121b() {
        return C17789c.INSTANCE;
    }

    /* renamed from: c */
    private static <T> C17996du<T> m59123c() {
        return C17787a.f49019a;
    }

    /* renamed from: a */
    public static boolean m59116a(Iterator<?> it, Collection<?> collection) {
        C17439m.m57962a(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m59117a(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return false;
            }
            if (!C17434j.m57955a(it.next(), it2.next())) {
                return false;
            }
        }
        if (!it2.hasNext()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static <T> C17995dt<T> m59108a() {
        return m59123c();
    }

    /* renamed from: j */
    static <T> ListIterator<T> m59135j(Iterator<T> it) {
        return (ListIterator) it;
    }

    /* renamed from: e */
    public static <T> Iterator<T> m59129e(Iterator<? extends Iterator<? extends T>> it) {
        return new C17788b(it);
    }

    /* renamed from: f */
    public static <T> T m59131f(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: g */
    static <T> T m59132g(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    /* renamed from: i */
    public static <T> C17897ci<T> m59134i(Iterator<? extends T> it) {
        if (it instanceof C17792e) {
            return (C17792e) it;
        }
        return new C17792e(it);
    }

    /* renamed from: b */
    public static int m59118b(Iterator<?> it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return C18143c.m59970b(j);
    }

    /* renamed from: h */
    static void m59133h(Iterator<?> it) {
        C17439m.m57962a(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: a */
    public static <T> C17995dt<T> m59110a(final T t) {
        return new C17995dt<T>() {

            /* renamed from: a */
            boolean f49017a;

            public final boolean hasNext() {
                if (!this.f49017a) {
                    return true;
                }
                return false;
            }

            public final T next() {
                if (!this.f49017a) {
                    this.f49017a = true;
                    return t;
                }
                throw new NoSuchElementException();
            }
        };
    }

    /* renamed from: c */
    public static String m59124c(Iterator<?> it) {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(it.next());
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public static <T> C17995dt<T> m59111a(final Iterator<? extends T> it) {
        C17439m.m57962a(it);
        if (it instanceof C17995dt) {
            return (C17995dt) it;
        }
        return new C17995dt<T>() {
            public final boolean hasNext() {
                return it.hasNext();
            }

            public final T next() {
                return it.next();
            }
        };
    }

    /* renamed from: d */
    public static <T> T m59126d(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static <T> C17995dt<T> m59109a(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        C17439m.m57963a(iterable, (Object) "iterators");
        C17439m.m57963a(comparator, (Object) "comparator");
        return new C17790d(iterable, comparator);
    }

    /* renamed from: b */
    public static <T> C17995dt<T> m59119b(final Iterator<T> it, final C17440n<? super T> nVar) {
        C17439m.m57962a(it);
        C17439m.m57962a(nVar);
        return new C17870c<T>() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final T mo45252a() {
                while (it.hasNext()) {
                    T next = it.next();
                    if (nVar.apply(next)) {
                        return next;
                    }
                }
                return mo46191b();
            }
        };
    }

    /* renamed from: c */
    public static <T> boolean m59125c(Iterator<T> it, C17440n<? super T> nVar) {
        if (m59130f(it, nVar) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m59107a(Iterator<?> it, int i) {
        boolean z;
        C17439m.m57962a(it);
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57969a(z, (Object) "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    /* renamed from: d */
    public static <T> T m59127d(Iterator<T> it, C17440n<? super T> nVar) {
        C17439m.m57962a(it);
        C17439m.m57962a(nVar);
        while (it.hasNext()) {
            T next = it.next();
            if (nVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: e */
    public static <T> Optional<T> m59128e(Iterator<T> it, C17440n<? super T> nVar) {
        C17439m.m57962a(it);
        C17439m.m57962a(nVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (nVar.apply(next)) {
                return Optional.m57873of(next);
            }
        }
        return Optional.absent();
    }

    /* renamed from: f */
    private static <T> int m59130f(Iterator<T> it, C17440n<? super T> nVar) {
        C17439m.m57963a(nVar, (Object) "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (nVar.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public static <T> T m59120b(Iterator<? extends T> it, T t) {
        if (it.hasNext()) {
            return it.next();
        }
        return t;
    }

    /* renamed from: b */
    public static boolean m59122b(Iterator<?> it, Collection<?> collection) {
        C17439m.m57962a(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static <F, T> Iterator<T> m59112a(Iterator<F> it, final C17427g<? super F, ? extends T> gVar) {
        C17439m.m57962a(gVar);
        return new C17992dq<F, T>(it) {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final T mo45666a(F f) {
                return gVar.mo44914b(f);
            }
        };
    }

    /* renamed from: a */
    public static <T> boolean m59113a(Collection<T> collection, Iterator<? extends T> it) {
        C17439m.m57962a(collection);
        C17439m.m57962a(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: a */
    public static <T> boolean m59114a(Iterator<T> it, C17440n<? super T> nVar) {
        C17439m.m57962a(nVar);
        boolean z = false;
        while (it.hasNext()) {
            if (nVar.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m59115a(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (obj.equals(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
