package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.collect.C17882cb.C17883a;
import com.google.common.collect.ImmutableCollection.C17583b;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class ImmutableMultiset<E> extends C17773bm<E> implements C17882cb<E> {
    private transient ImmutableList<E> asList;
    private transient ImmutableSet<C17883a<E>> entrySet;

    /* renamed from: com.google.common.collect.ImmutableMultiset$a */
    public static class C17607a<E> extends C17583b<E> {

        /* renamed from: a */
        C17893cf<E> f48719a;

        /* renamed from: b */
        boolean f48720b;

        /* renamed from: c */
        boolean f48721c;

        public C17607a() {
            this(4);
        }

        /* renamed from: a */
        public ImmutableMultiset<E> mo45487a() {
            if (this.f48719a.f49160c == 0) {
                return ImmutableMultiset.m58608of();
            }
            if (this.f48721c) {
                this.f48719a = new C17893cf<>(this.f48719a);
                this.f48721c = false;
            }
            this.f48720b = true;
            return new C17914cr(this.f48719a);
        }

        C17607a(boolean z) {
        }

        /* renamed from: b */
        public C17607a<E> mo45404a(Iterator<? extends E> it) {
            super.mo45404a(it);
            return this;
        }

        C17607a(int i) {
            this.f48719a = C17893cf.m59454a(i);
        }

        /* renamed from: b */
        public C17607a<E> mo45402a(E... eArr) {
            super.mo45402a(eArr);
            return this;
        }

        /* renamed from: c */
        private static <T> C17893cf<T> mo45606c(Iterable<T> iterable) {
            if (iterable instanceof C17914cr) {
                return ((C17914cr) iterable).f49204b;
            }
            if (iterable instanceof C18023f) {
                return ((C18023f) iterable).backingMap;
            }
            return null;
        }

        /* renamed from: a */
        public C17607a<E> mo45403b(E e) {
            return mo45486a(e, 1);
        }

        /* renamed from: b */
        public C17607a<E> mo45401a(Iterable<? extends E> iterable) {
            if (iterable instanceof C17882cb) {
                C17882cb b = C17884cc.m59432b(iterable);
                C17893cf c = mo45606c(b);
                if (c != null) {
                    this.f48719a.mo46242f(Math.max(this.f48719a.f49160c, c.f49160c));
                    for (int b2 = c.mo46233b(); b2 >= 0; b2 = c.mo46234b(b2)) {
                        mo45486a(c.mo46238c(b2), c.mo46240d(b2));
                    }
                } else {
                    this.f48719a.mo46242f(Math.max(this.f48719a.f49160c, b.entrySet().size()));
                    for (C17883a aVar : b.entrySet()) {
                        mo45486a(aVar.mo45308b(), aVar.mo45307a());
                    }
                }
            } else {
                super.mo45401a(iterable);
            }
            return this;
        }

        /* renamed from: a */
        public C17607a<E> mo45486a(E e, int i) {
            if (i == 0) {
                return this;
            }
            if (this.f48720b) {
                this.f48719a = new C17893cf<>(this.f48719a);
                this.f48721c = false;
            }
            this.f48720b = false;
            C17439m.m57962a(e);
            this.f48719a.mo46230a(e, i + this.f48719a.mo46235b((Object) e));
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultiset$b */
    final class C17608b extends C17623b<C17883a<E>> {
        private static final long serialVersionUID = 0;

        public final int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return ImmutableMultiset.this.isPartialView();
        }

        /* access modifiers changed from: 0000 */
        public final Object writeReplace() {
            return new C17609c(ImmutableMultiset.this);
        }

        public final int size() {
            return ImmutableMultiset.this.elementSet().size();
        }

        private C17608b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17883a<E> mo45491a(int i) {
            return ImmutableMultiset.this.getEntry(i);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof C17883a)) {
                return false;
            }
            C17883a aVar = (C17883a) obj;
            if (aVar.mo45307a() > 0 && ImmutableMultiset.this.count(aVar.mo45308b()) == aVar.mo45307a()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultiset$c */
    static class C17609c<E> implements Serializable {

        /* renamed from: a */
        final ImmutableMultiset<E> f48723a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return this.f48723a.entrySet();
        }

        C17609c(ImmutableMultiset<E> immutableMultiset) {
            this.f48723a = immutableMultiset;
        }
    }

    ImmutableMultiset() {
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m58608of() {
        return C17914cr.f49203a;
    }

    public abstract ImmutableSet<E> elementSet();

    /* access modifiers changed from: 0000 */
    public abstract C17883a<E> getEntry(int i);

    /* access modifiers changed from: 0000 */
    public abstract Object writeReplace();

    public static <E> C17607a<E> builder() {
        return new C17607a<>();
    }

    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> asList2 = super.asList();
        this.asList = asList2;
        return asList2;
    }

    public ImmutableSet<C17883a<E>> entrySet() {
        ImmutableSet<C17883a<E>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<C17883a<E>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    public int hashCode() {
        return C17933db.m59564a((Set<?>) entrySet());
    }

    public C17995dt<E> iterator() {
        final C17995dt it = entrySet().iterator();
        return new C17995dt<E>() {

            /* renamed from: a */
            int f48715a;

            /* renamed from: b */
            E f48716b;

            public final boolean hasNext() {
                if (this.f48715a > 0 || it.hasNext()) {
                    return true;
                }
                return false;
            }

            public final E next() {
                if (this.f48715a <= 0) {
                    C17883a aVar = (C17883a) it.next();
                    this.f48716b = aVar.mo45308b();
                    this.f48715a = aVar.mo45307a();
                }
                this.f48715a--;
                return this.f48716b;
            }
        };
    }

    public String toString() {
        return entrySet().toString();
    }

    private ImmutableSet<C17883a<E>> createEntrySet() {
        if (isEmpty()) {
            return ImmutableSet.m58649of();
        }
        return new C17608b();
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] eArr) {
        return copyFromElements(eArr);
    }

    public boolean equals(Object obj) {
        return C17884cc.m59429a((C17882cb<?>) this, obj);
    }

    private static <E> ImmutableMultiset<E> copyFromElements(E... eArr) {
        return new C17607a().mo45402a(eArr).mo45487a();
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> it) {
        return new C17607a().mo45404a(it).mo45487a();
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m58609of(E e) {
        return copyFromElements(e);
    }

    public boolean contains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.isPartialView()) {
                return immutableMultiset;
            }
        }
        C17607a aVar = new C17607a(C17884cc.m59423a(iterable));
        aVar.mo45401a(iterable);
        return aVar.mo45487a();
    }

    static <E> ImmutableMultiset<E> copyFromEntries(Collection<? extends C17883a<? extends E>> collection) {
        C17607a aVar = new C17607a(collection.size());
        for (C17883a aVar2 : collection) {
            aVar.mo45486a(aVar2.mo45308b(), aVar2.mo45307a());
        }
        return aVar.mo45487a();
    }

    public final int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public final int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public final int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m58610of(E e, E e2) {
        return copyFromElements(e, e2);
    }

    /* access modifiers changed from: 0000 */
    public int copyIntoArray(Object[] objArr, int i) {
        C17995dt it = entrySet().iterator();
        while (it.hasNext()) {
            C17883a aVar = (C17883a) it.next();
            Arrays.fill(objArr, i, aVar.mo45307a() + i, aVar.mo45308b());
            i += aVar.mo45307a();
        }
        return i;
    }

    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m58611of(E e, E e2, E e3) {
        return copyFromElements(e, e2, e3);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m58612of(E e, E e2, E e3, E e4) {
        return copyFromElements(e, e2, e3, e4);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m58613of(E e, E e2, E e3, E e4, E e5) {
        return copyFromElements(e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m58614of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        return new C17607a().mo45403b(e).mo45403b(e2).mo45403b(e3).mo45403b(e4).mo45403b(e5).mo45403b(e6).mo45402a(eArr).mo45487a();
    }
}
