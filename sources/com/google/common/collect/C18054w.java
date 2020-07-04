package com.google.common.collect;

import com.google.common.base.C17427g;
import com.google.common.base.C17439m;
import com.google.common.base.C17440n;
import com.google.common.base.C17441o;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.common.collect.w */
public final class C18054w {

    /* renamed from: com.google.common.collect.w$a */
    static class C18055a<E> extends AbstractCollection<E> {

        /* renamed from: a */
        final Collection<E> f49355a;

        /* renamed from: b */
        final C17440n<? super E> f49356b;

        public void clear() {
            C17777bq.m59094a((Iterable<T>) this.f49355a, this.f49356b);
        }

        public boolean isEmpty() {
            if (!C17777bq.m59100c(this.f49355a, this.f49356b)) {
                return true;
            }
            return false;
        }

        public Iterator<E> iterator() {
            return C17782br.m59119b(this.f49355a.iterator(), this.f49356b);
        }

        public Object[] toArray() {
            return C17795bu.m59145a(iterator()).toArray();
        }

        public int size() {
            int i = 0;
            for (E apply : this.f49355a) {
                if (this.f49356b.apply(apply)) {
                    i++;
                }
            }
            return i;
        }

        public boolean containsAll(Collection<?> collection) {
            return C18054w.m59711a((Collection<?>) this, collection);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C18055a<E> mo46588a(C17440n<? super E> nVar) {
            return new C18055a<>(this.f49355a, C17441o.m57991a(this.f49356b, nVar));
        }

        public boolean add(E e) {
            C17439m.m57968a(this.f49356b.apply(e));
            return this.f49355a.add(e);
        }

        public boolean addAll(Collection<? extends E> collection) {
            for (Object apply : collection) {
                C17439m.m57968a(this.f49356b.apply(apply));
            }
            return this.f49355a.addAll(collection);
        }

        public boolean contains(Object obj) {
            if (C18054w.m59710a(this.f49355a, obj)) {
                return this.f49356b.apply(obj);
            }
            return false;
        }

        public boolean remove(Object obj) {
            if (!contains(obj) || !this.f49355a.remove(obj)) {
                return false;
            }
            return true;
        }

        public <T> T[] toArray(T[] tArr) {
            return C17795bu.m59145a(iterator()).toArray(tArr);
        }

        public boolean removeAll(Collection<?> collection) {
            Iterator it = this.f49355a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f49356b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            Iterator it = this.f49355a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f49356b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        C18055a(Collection<E> collection, C17440n<? super E> nVar) {
            this.f49355a = collection;
            this.f49356b = nVar;
        }
    }

    /* renamed from: com.google.common.collect.w$b */
    static class C18056b<F, T> extends AbstractCollection<T> {

        /* renamed from: a */
        final Collection<F> f49357a;

        /* renamed from: b */
        final C17427g<? super F, ? extends T> f49358b;

        public final void clear() {
            this.f49357a.clear();
        }

        public final boolean isEmpty() {
            return this.f49357a.isEmpty();
        }

        public final int size() {
            return this.f49357a.size();
        }

        public final Iterator<T> iterator() {
            return C17782br.m59112a(this.f49357a.iterator(), this.f49358b);
        }

        C18056b(Collection<F> collection, C17427g<? super F, ? extends T> gVar) {
            this.f49357a = (Collection) C17439m.m57962a(collection);
            this.f49358b = (C17427g) C17439m.m57962a(gVar);
        }
    }

    /* renamed from: a */
    static <T> Collection<T> m59707a(Iterable<T> iterable) {
        return (Collection) iterable;
    }

    /* renamed from: a */
    static StringBuilder m59706a(int i) {
        C18053v.m59700a(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824));
    }

    /* renamed from: a */
    static String m59705a(Collection<?> collection) {
        StringBuilder a = m59706a(collection.size());
        a.append('[');
        boolean z = true;
        for (Object next : collection) {
            if (!z) {
                a.append(", ");
            }
            z = false;
            if (next == collection) {
                a.append("(this Collection)");
            } else {
                a.append(next);
            }
        }
        a.append(']');
        return a.toString();
    }

    /* renamed from: a */
    public static <F, T> Collection<T> m59708a(Collection<F> collection, C17427g<? super F, T> gVar) {
        return new C18056b(collection, gVar);
    }

    /* renamed from: a */
    static boolean m59710a(Collection<?> collection, Object obj) {
        C17439m.m57962a(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: b */
    static boolean m59712b(Collection<?> collection, Object obj) {
        C17439m.m57962a(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static <E> Collection<E> m59709a(Collection<E> collection, C17440n<? super E> nVar) {
        if (collection instanceof C18055a) {
            return ((C18055a) collection).mo46588a(nVar);
        }
        return new C18055a((Collection) C17439m.m57962a(collection), (C17440n) C17439m.m57962a(nVar));
    }

    /* renamed from: a */
    static boolean m59711a(Collection<?> collection, Collection<?> collection2) {
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }
}
