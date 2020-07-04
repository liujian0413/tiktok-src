package com.google.common.collect;

import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import com.google.common.collect.C17882cb.C17883a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.cc */
public final class C17884cc {

    /* renamed from: com.google.common.collect.cc$a */
    static abstract class C17886a<E> implements C17883a<E> {
        C17886a() {
        }

        public int hashCode() {
            int i;
            Object b = mo45308b();
            if (b == null) {
                i = 0;
            } else {
                i = b.hashCode();
            }
            return i ^ mo45307a();
        }

        public String toString() {
            String valueOf = String.valueOf(mo45308b());
            int a = mo45307a();
            if (a == 1) {
                return valueOf;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(valueOf);
            sb.append(" x ");
            sb.append(a);
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C17883a)) {
                return false;
            }
            C17883a aVar = (C17883a) obj;
            if (mo45307a() != aVar.mo45307a() || !C17434j.m57955a(mo45308b(), aVar.mo45308b())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.common.collect.cc$b */
    static abstract class C17887b<E> extends C17936c<E> {
        C17887b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract C17882cb<E> mo46213a();

        public void clear() {
            mo46213a().clear();
        }

        public boolean isEmpty() {
            return mo46213a().isEmpty();
        }

        public int size() {
            return mo46213a().entrySet().size();
        }

        public boolean contains(Object obj) {
            return mo46213a().contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return mo46213a().containsAll(collection);
        }

        public boolean remove(Object obj) {
            if (mo46213a().remove(obj, Integer.MAX_VALUE) > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.cc$c */
    static abstract class C17888c<E> extends C17936c<C17883a<E>> {
        C17888c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract C17882cb<E> mo45256a();

        public void clear() {
            mo45256a().clear();
        }

        public boolean remove(Object obj) {
            if (obj instanceof C17883a) {
                C17883a aVar = (C17883a) obj;
                Object b = aVar.mo45308b();
                int a = aVar.mo45307a();
                if (a != 0) {
                    return mo45256a().setCount(b, a, 0);
                }
            }
            return false;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof C17883a)) {
                return false;
            }
            C17883a aVar = (C17883a) obj;
            if (aVar.mo45307a() > 0 && mo45256a().count(aVar.mo45308b()) == aVar.mo45307a()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.cc$d */
    static class C17889d<E> extends C17886a<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final E f49149a;

        /* renamed from: b */
        private final int f49150b;

        /* renamed from: a */
        public final int mo45307a() {
            return this.f49150b;
        }

        /* renamed from: b */
        public final E mo45308b() {
            return this.f49149a;
        }

        C17889d(E e, int i) {
            this.f49149a = e;
            this.f49150b = i;
            C18053v.m59700a(i, "count");
        }
    }

    /* renamed from: com.google.common.collect.cc$e */
    static final class C17890e<E> implements Iterator<E> {

        /* renamed from: a */
        private final C17882cb<E> f49151a;

        /* renamed from: b */
        private final Iterator<C17883a<E>> f49152b;

        /* renamed from: c */
        private C17883a<E> f49153c;

        /* renamed from: d */
        private int f49154d;

        /* renamed from: e */
        private int f49155e;

        /* renamed from: f */
        private boolean f49156f;

        public final boolean hasNext() {
            if (this.f49154d > 0 || this.f49152b.hasNext()) {
                return true;
            }
            return false;
        }

        public final E next() {
            if (hasNext()) {
                if (this.f49154d == 0) {
                    this.f49153c = (C17883a) this.f49152b.next();
                    int a = this.f49153c.mo45307a();
                    this.f49154d = a;
                    this.f49155e = a;
                }
                this.f49154d--;
                this.f49156f = true;
                return this.f49153c.mo45308b();
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            C18053v.m59703a(this.f49156f);
            if (this.f49155e == 1) {
                this.f49152b.remove();
            } else {
                this.f49151a.remove(this.f49153c.mo45308b());
            }
            this.f49155e--;
            this.f49156f = false;
        }

        C17890e(C17882cb<E> cbVar, Iterator<C17883a<E>> it) {
            this.f49151a = cbVar;
            this.f49152b = it;
        }
    }

    /* renamed from: a */
    static <E> boolean m59431a(C17882cb<E> cbVar, Collection<? extends E> collection) {
        C17439m.m57962a(cbVar);
        C17439m.m57962a(collection);
        if (collection instanceof C17882cb) {
            return m59427a(cbVar, m59432b(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return C17782br.m59113a((Collection<T>) cbVar, collection.iterator());
    }

    /* renamed from: b */
    static <T> C17882cb<T> m59432b(Iterable<T> iterable) {
        return (C17882cb) iterable;
    }

    /* renamed from: a */
    static <E> Iterator<E> m59425a(C17882cb<E> cbVar) {
        return new C17890e(cbVar, cbVar.entrySet().iterator());
    }

    /* renamed from: a */
    static int m59423a(Iterable<?> iterable) {
        if (iterable instanceof C17882cb) {
            return ((C17882cb) iterable).elementSet().size();
        }
        return 11;
    }

    /* renamed from: a */
    static <E> Iterator<E> m59426a(Iterator<C17883a<E>> it) {
        return new C17992dq<C17883a<E>, E>(it) {
            /* renamed from: a */
            private static E m59435a(C17883a<E> aVar) {
                return aVar.mo45308b();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo45666a(Object obj) {
                return m59435a((C17883a) obj);
            }
        };
    }

    /* renamed from: a */
    public static <E> C17883a<E> m59424a(E e, int i) {
        return new C17889d(e, i);
    }

    /* renamed from: b */
    static boolean m59433b(C17882cb<?> cbVar, Collection<?> collection) {
        if (collection instanceof C17882cb) {
            collection = ((C17882cb) collection).elementSet();
        }
        return cbVar.elementSet().removeAll(collection);
    }

    /* renamed from: c */
    static boolean m59434c(C17882cb<?> cbVar, Collection<?> collection) {
        C17439m.m57962a(collection);
        if (collection instanceof C17882cb) {
            collection = ((C17882cb) collection).elementSet();
        }
        return cbVar.elementSet().retainAll(collection);
    }

    /* renamed from: a */
    private static <E> boolean m59427a(C17882cb<E> cbVar, C17882cb<? extends E> cbVar2) {
        if (cbVar2 instanceof C18023f) {
            return m59428a(cbVar, (C18023f) cbVar2);
        }
        if (cbVar2.isEmpty()) {
            return false;
        }
        for (C17883a aVar : cbVar2.entrySet()) {
            cbVar.add(aVar.mo45308b(), aVar.mo45307a());
        }
        return true;
    }

    /* renamed from: a */
    private static <E> boolean m59428a(C17882cb<E> cbVar, C18023f<? extends E> fVar) {
        if (fVar.isEmpty()) {
            return false;
        }
        fVar.addTo(cbVar);
        return true;
    }

    /* renamed from: a */
    static boolean m59429a(C17882cb<?> cbVar, Object obj) {
        if (obj == cbVar) {
            return true;
        }
        if (!(obj instanceof C17882cb)) {
            return false;
        }
        C17882cb cbVar2 = (C17882cb) obj;
        if (cbVar.size() != cbVar2.size() || cbVar.entrySet().size() != cbVar2.entrySet().size()) {
            return false;
        }
        for (C17883a aVar : cbVar2.entrySet()) {
            if (cbVar.count(aVar.mo45308b()) != aVar.mo45307a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    static <E> int m59422a(C17882cb<E> cbVar, E e, int i) {
        C18053v.m59700a(i, "count");
        int count = cbVar.count(e);
        int i2 = i - count;
        if (i2 > 0) {
            cbVar.add(e, i2);
        } else if (i2 < 0) {
            cbVar.remove(e, -i2);
        }
        return count;
    }

    /* renamed from: a */
    static <E> boolean m59430a(C17882cb<E> cbVar, E e, int i, int i2) {
        C18053v.m59700a(i, "oldCount");
        C18053v.m59700a(i2, "newCount");
        if (cbVar.count(e) != i) {
            return false;
        }
        cbVar.setCount(e, i2);
        return true;
    }
}
