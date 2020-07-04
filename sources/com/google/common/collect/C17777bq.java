package com.google.common.collect;

import com.google.common.base.C17427g;
import com.google.common.base.C17439m;
import com.google.common.base.C17440n;
import com.google.common.base.Optional;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: com.google.common.collect.bq */
public final class C17777bq {
    /* renamed from: a */
    private static <T> boolean m59096a(List<T> list, C17440n<? super T> nVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!nVar.apply(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (UnsupportedOperationException unused) {
                        m59093a(list, nVar, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        m59093a(list, nVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    /* renamed from: a */
    static <T> T[] m59097a(Iterable<? extends T> iterable, T[] tArr) {
        return m59106f(iterable).toArray(tArr);
    }

    /* renamed from: f */
    private static <E> Collection<E> m59106f(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return C17795bu.m59145a(iterable.iterator());
    }

    /* renamed from: b */
    public static <T> T m59099b(Iterable<T> iterable) {
        return C17782br.m59126d(iterable.iterator());
    }

    /* renamed from: c */
    static Object[] m59101c(Iterable<?> iterable) {
        return m59106f(iterable).toArray();
    }

    /* renamed from: d */
    public static <T> T m59102d(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return C17782br.m59131f(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return m59091a(list);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: e */
    public static boolean m59105e(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        if (!iterable.iterator().hasNext()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static <T> T m59091a(List<T> list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: a */
    public static String m59092a(Iterable<?> iterable) {
        return C17782br.m59124c(iterable.iterator());
    }

    /* renamed from: a */
    public static <T> Iterable<T> m59089a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return C17742ar.m59038a(iterable, iterable2);
    }

    /* renamed from: a */
    public static <F, T> Iterable<T> m59088a(final Iterable<F> iterable, final C17427g<? super F, ? extends T> gVar) {
        C17439m.m57962a(iterable);
        C17439m.m57962a(gVar);
        return new C17742ar<T>() {
            public final Iterator<T> iterator() {
                return C17782br.m59112a(iterable.iterator(), gVar);
            }
        };
    }

    /* renamed from: b */
    public static <T> Iterable<T> m59098b(final Iterable<T> iterable, final C17440n<? super T> nVar) {
        C17439m.m57962a(iterable);
        C17439m.m57962a(nVar);
        return new C17742ar<T>() {
            public final Iterator<T> iterator() {
                return C17782br.m59119b(iterable.iterator(), nVar);
            }
        };
    }

    /* renamed from: c */
    public static <T> boolean m59100c(Iterable<T> iterable, C17440n<? super T> nVar) {
        return C17782br.m59125c(iterable.iterator(), nVar);
    }

    /* renamed from: d */
    public static <T> T m59103d(Iterable<T> iterable, C17440n<? super T> nVar) {
        return C17782br.m59127d(iterable.iterator(), nVar);
    }

    /* renamed from: e */
    public static <T> Optional<T> m59104e(Iterable<T> iterable, C17440n<? super T> nVar) {
        return C17782br.m59128e(iterable.iterator(), nVar);
    }

    /* renamed from: a */
    public static <T> Iterable<T> m59087a(final Iterable<T> iterable, final int i) {
        boolean z;
        C17439m.m57962a(iterable);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57969a(z, (Object) "number to skip cannot be negative");
        return new C17742ar<T>() {
            public final Iterator<T> iterator() {
                if (iterable instanceof List) {
                    List list = (List) iterable;
                    return list.subList(Math.min(list.size(), i), list.size()).iterator();
                }
                final Iterator it = iterable.iterator();
                C17782br.m59107a(it, i);
                return new Iterator<T>() {

                    /* renamed from: a */
                    boolean f49010a = true;

                    public final boolean hasNext() {
                        return it.hasNext();
                    }

                    public final T next() {
                        T next = it.next();
                        this.f49010a = false;
                        return next;
                    }

                    public final void remove() {
                        C18053v.m59703a(!this.f49010a);
                        it.remove();
                    }
                };
            }
        };
    }

    /* renamed from: a */
    public static <T> T m59090a(Iterable<? extends T> iterable, T t) {
        return C17782br.m59120b(iterable.iterator(), null);
    }

    /* renamed from: a */
    public static <T> boolean m59094a(Iterable<T> iterable, C17440n<? super T> nVar) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return C17782br.m59114a(iterable.iterator(), nVar);
        }
        return m59096a((List) iterable, (C17440n) C17439m.m57962a(nVar));
    }

    /* renamed from: a */
    public static <T> boolean m59095a(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll(C18054w.m59707a(iterable));
        }
        return C17782br.m59113a(collection, ((Iterable) C17439m.m57962a(iterable)).iterator());
    }

    /* renamed from: a */
    private static <T> void m59093a(List<T> list, C17440n<? super T> nVar, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (nVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }
}
