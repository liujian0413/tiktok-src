package com.google.common.collect;

import com.google.common.base.C17439m;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] EMPTY_ARRAY = new Object[0];

    /* renamed from: com.google.common.collect.ImmutableCollection$a */
    static abstract class C17582a<E> extends C17583b<E> {

        /* renamed from: a */
        Object[] f48676a;

        /* renamed from: b */
        int f48677b = 0;

        /* renamed from: c */
        boolean f48678c;

        C17582a(int i) {
            C18053v.m59700a(i, "initialCapacity");
            this.f48676a = new Object[i];
        }

        /* renamed from: a */
        public C17582a<E> mo45403b(E e) {
            C17439m.m57962a(e);
            m58526a(this.f48677b + 1);
            Object[] objArr = this.f48676a;
            int i = this.f48677b;
            this.f48677b = i + 1;
            objArr[i] = e;
            return this;
        }

        /* renamed from: a */
        private void m58526a(int i) {
            if (this.f48676a.length < i) {
                this.f48676a = Arrays.copyOf(this.f48676a, m58531a(this.f48676a.length, i));
                this.f48678c = false;
                return;
            }
            if (this.f48678c) {
                this.f48676a = (Object[]) this.f48676a.clone();
                this.f48678c = false;
            }
        }

        /* renamed from: a */
        public C17583b<E> mo45401a(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                m58526a(this.f48677b + collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.f48677b = ((ImmutableCollection) collection).copyIntoArray(this.f48676a, this.f48677b);
                    return this;
                }
            }
            super.mo45401a(iterable);
            return this;
        }

        /* renamed from: a */
        public C17583b<E> mo45402a(E... eArr) {
            C17892ce.m59447a((Object[]) eArr);
            m58526a(this.f48677b + eArr.length);
            System.arraycopy(eArr, 0, this.f48676a, this.f48677b, eArr.length);
            this.f48677b += eArr.length;
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableCollection$b */
    public static abstract class C17583b<E> {
        C17583b() {
        }

        /* renamed from: b */
        public abstract C17583b<E> mo45403b(E e);

        /* renamed from: a */
        public C17583b<E> mo45404a(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo45403b(it.next());
            }
            return this;
        }

        /* renamed from: a */
        public C17583b<E> mo45401a(Iterable<? extends E> iterable) {
            for (Object b : iterable) {
                mo45403b(b);
            }
            return this;
        }

        /* renamed from: a */
        public C17583b<E> mo45402a(E... eArr) {
            for (E b : eArr) {
                mo45403b(b);
            }
            return this;
        }

        /* renamed from: a */
        static int m58531a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    ImmutableCollection() {
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: 0000 */
    public abstract boolean isPartialView();

    public abstract C17995dt<E> iterator();

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return EMPTY_ARRAY;
        }
        Object[] objArr = new Object[size];
        copyIntoArray(objArr, 0);
        return objArr;
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C17587d(toArray());
    }

    public ImmutableList<E> asList() {
        if (isEmpty()) {
            return ImmutableList.m58536of();
        }
        return ImmutableList.asImmutableList(toArray());
    }

    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final <T> T[] toArray(T[] tArr) {
        C17439m.m57962a(tArr);
        int size = size();
        if (tArr.length < size) {
            tArr = C17892ce.m59448a(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        copyIntoArray(tArr, 0);
        return tArr;
    }

    /* access modifiers changed from: 0000 */
    public int copyIntoArray(Object[] objArr, int i) {
        C17995dt it = iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            objArr[i] = it.next();
            i = i2;
        }
        return i;
    }
}
