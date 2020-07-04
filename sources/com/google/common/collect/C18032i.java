package com.google.common.collect;

import com.google.common.collect.C17882cb.C17883a;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.common.collect.i */
abstract class C18032i<E> extends AbstractCollection<E> implements C17882cb<E> {
    private transient Set<E> elementSet;
    private transient Set<C17883a<E>> entrySet;

    /* renamed from: com.google.common.collect.i$a */
    class C18033a extends C17887b<E> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17882cb<E> mo46213a() {
            return C18032i.this;
        }

        public final Iterator<E> iterator() {
            return C18032i.this.elementIterator();
        }

        C18033a() {
        }
    }

    /* renamed from: com.google.common.collect.i$b */
    class C18034b extends C17888c<E> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C17882cb<E> mo45256a() {
            return C18032i.this;
        }

        public Iterator<C17883a<E>> iterator() {
            return C18032i.this.entryIterator();
        }

        public int size() {
            return C18032i.this.distinctElements();
        }

        C18034b() {
        }
    }

    C18032i() {
    }

    public abstract void clear();

    /* access modifiers changed from: 0000 */
    public abstract int distinctElements();

    /* access modifiers changed from: 0000 */
    public abstract Iterator<E> elementIterator();

    /* access modifiers changed from: 0000 */
    public abstract Iterator<C17883a<E>> entryIterator();

    /* access modifiers changed from: 0000 */
    public Set<E> createElementSet() {
        return new C18033a();
    }

    /* access modifiers changed from: 0000 */
    public Set<C17883a<E>> createEntrySet() {
        return new C18034b();
    }

    public Set<E> elementSet() {
        Set<E> set = this.elementSet;
        if (set != null) {
            return set;
        }
        Set<E> createElementSet = createElementSet();
        this.elementSet = createElementSet;
        return createElementSet;
    }

    public Set<C17883a<E>> entrySet() {
        Set<C17883a<E>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        Set<C17883a<E>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public final String toString() {
        return entrySet().toString();
    }

    public final boolean addAll(Collection<? extends E> collection) {
        return C17884cc.m59431a((C17882cb<E>) this, collection);
    }

    public final boolean equals(Object obj) {
        return C17884cc.m59429a((C17882cb<?>) this, obj);
    }

    public final boolean removeAll(Collection<?> collection) {
        return C17884cc.m59433b(this, collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        return C17884cc.m59434c(this, collection);
    }

    public final boolean add(E e) {
        add(e, 1);
        return true;
    }

    public boolean contains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    public final boolean remove(Object obj) {
        if (remove(obj, 1) > 0) {
            return true;
        }
        return false;
    }

    public int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public int setCount(E e, int i) {
        return C17884cc.m59422a(this, e, i);
    }

    public boolean setCount(E e, int i, int i2) {
        return C17884cc.m59430a(this, e, i, i2);
    }
}
