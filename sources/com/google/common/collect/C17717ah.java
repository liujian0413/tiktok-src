package com.google.common.collect;

import com.google.common.collect.C17882cb.C17883a;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* renamed from: com.google.common.collect.ah */
abstract class C17717ah<E> extends C17753az<E> implements C17954dh<E> {

    /* renamed from: a */
    private transient Comparator<? super E> f48954a;

    /* renamed from: b */
    private transient NavigableSet<E> f48955b;

    /* renamed from: c */
    private transient Set<C17883a<E>> f48956c;

    /* renamed from: com.google.common.collect.ah$a */
    class C17718a extends C17888c<E> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17882cb<E> mo45256a() {
            return C17717ah.this;
        }

        public final Iterator<C17883a<E>> iterator() {
            return C17717ah.this.mo45843b();
        }

        public final int size() {
            return C17717ah.this.mo45842a().entrySet().size();
        }

        C17718a() {
        }
    }

    C17717ah() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C17954dh<E> mo45842a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract Iterator<C17883a<E>> mo45843b();

    /* renamed from: d */
    private Set<C17883a<E>> m58972d() {
        return new C17718a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C17882cb<E> delegate() {
        return mo45842a();
    }

    public C17954dh<E> descendingMultiset() {
        return mo45842a();
    }

    public Iterator<E> iterator() {
        return C17884cc.m59425a((C17882cb<E>) this);
    }

    public Object[] toArray() {
        return standardToArray();
    }

    public NavigableSet<E> elementSet() {
        NavigableSet<E> navigableSet = this.f48955b;
        if (navigableSet != null) {
            return navigableSet;
        }
        C17958b bVar = new C17958b(this);
        this.f48955b = bVar;
        return bVar;
    }

    public Set<C17883a<E>> entrySet() {
        Set<C17883a<E>> set = this.f48956c;
        if (set != null) {
            return set;
        }
        Set<C17883a<E>> d = m58972d();
        this.f48956c = d;
        return d;
    }

    public C17883a<E> firstEntry() {
        return mo45842a().lastEntry();
    }

    public C17883a<E> lastEntry() {
        return mo45842a().firstEntry();
    }

    public C17883a<E> pollFirstEntry() {
        return mo45842a().pollLastEntry();
    }

    public C17883a<E> pollLastEntry() {
        return mo45842a().pollFirstEntry();
    }

    public String toString() {
        return entrySet().toString();
    }

    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f48954a;
        if (comparator != null) {
            return comparator;
        }
        C17896ch a = C17896ch.m59496a(mo45842a().comparator()).mo46226a();
        this.f48954a = a;
        return a;
    }

    public <T> T[] toArray(T[] tArr) {
        return standardToArray(tArr);
    }

    public C17954dh<E> headMultiset(E e, BoundType boundType) {
        return mo45842a().tailMultiset(e, boundType).descendingMultiset();
    }

    public C17954dh<E> tailMultiset(E e, BoundType boundType) {
        return mo45842a().headMultiset(e, boundType).descendingMultiset();
    }

    public C17954dh<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        return mo45842a().subMultiset(e2, boundType2, e, boundType).descendingMultiset();
    }
}
