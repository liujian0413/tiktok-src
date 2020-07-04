package com.google.common.collect;

import com.google.common.base.C17427g;
import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import com.google.common.primitives.C18143c;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.common.collect.bu */
public final class C17795bu {

    /* renamed from: com.google.common.collect.bu$a */
    static class C17796a<F, T> extends AbstractList<T> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final List<F> f49034a;

        /* renamed from: b */
        final C17427g<? super F, ? extends T> f49035b;

        public final void clear() {
            this.f49034a.clear();
        }

        public final boolean isEmpty() {
            return this.f49034a.isEmpty();
        }

        public final Iterator<T> iterator() {
            return listIterator();
        }

        public final int size() {
            return this.f49034a.size();
        }

        public final T get(int i) {
            return this.f49035b.mo44914b(this.f49034a.get(i));
        }

        public final ListIterator<T> listIterator(int i) {
            return new C17993dr<F, T>(this.f49034a.listIterator(i)) {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final T mo45666a(F f) {
                    return C17796a.this.f49035b.mo44914b(f);
                }
            };
        }

        public final T remove(int i) {
            return this.f49035b.mo44914b(this.f49034a.remove(i));
        }

        C17796a(List<F> list, C17427g<? super F, ? extends T> gVar) {
            this.f49034a = (List) C17439m.m57962a(list);
            this.f49035b = (C17427g) C17439m.m57962a(gVar);
        }
    }

    /* renamed from: com.google.common.collect.bu$b */
    static class C17798b<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final List<F> f49037a;

        /* renamed from: b */
        final C17427g<? super F, ? extends T> f49038b;

        public final void clear() {
            this.f49037a.clear();
        }

        public final int size() {
            return this.f49037a.size();
        }

        public final ListIterator<T> listIterator(int i) {
            return new C17993dr<F, T>(this.f49037a.listIterator(i)) {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final T mo45666a(F f) {
                    return C17798b.this.f49038b.mo44914b(f);
                }
            };
        }

        C17798b(List<F> list, C17427g<? super F, ? extends T> gVar) {
            this.f49037a = (List) C17439m.m57962a(list);
            this.f49038b = (C17427g) C17439m.m57962a(gVar);
        }
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m59142a() {
        return new ArrayList<>();
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m59143a(int i) {
        C18053v.m59700a(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    /* renamed from: b */
    public static <E> ArrayList<E> m59150b(int i) {
        return new ArrayList<>(m59151c(i));
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m59144a(Iterable<? extends E> iterable) {
        C17439m.m57962a(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>(C18054w.m59707a(iterable));
        }
        return m59145a(iterable.iterator());
    }

    /* renamed from: c */
    private static int m59151c(int i) {
        C18053v.m59700a(i, "arraySize");
        return C18143c.m59970b(((long) i) + 5 + ((long) (i / 10)));
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m59145a(Iterator<? extends E> it) {
        ArrayList<E> a = m59142a();
        C17782br.m59113a((Collection<T>) a, it);
        return a;
    }

    @SafeVarargs
    /* renamed from: a */
    public static <E> ArrayList<E> m59146a(E... eArr) {
        C17439m.m57962a(eArr);
        ArrayList<E> arrayList = new ArrayList<>(m59151c(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    /* renamed from: b */
    static int m59149b(List<?> list, Object obj) {
        return m59153d(list, obj);
    }

    /* renamed from: c */
    static int m59152c(List<?> list, Object obj) {
        return m59154e(list, obj);
    }

    /* renamed from: d */
    private static int m59153d(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < size) {
                if (obj.equals(list.get(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: e */
    private static int m59154e(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                if (obj.equals(list.get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static <F, T> List<T> m59147a(List<F> list, C17427g<? super F, ? extends T> gVar) {
        if (list instanceof RandomAccess) {
            return new C17796a(list, gVar);
        }
        return new C17798b(list, gVar);
    }

    /* renamed from: a */
    static boolean m59148a(List<?> list, Object obj) {
        if (obj == C17439m.m57962a(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list2 instanceof RandomAccess)) {
            return C17782br.m59117a(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!C17434j.m57955a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
