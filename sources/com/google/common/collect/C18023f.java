package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.collect.C17882cb.C17883a;
import com.google.common.primitives.C18143c;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.f */
abstract class C18023f<E> extends C18032i<E> implements Serializable {
    private static final long serialVersionUID = 0;
    transient C17893cf<E> backingMap;
    transient long size;

    /* renamed from: com.google.common.collect.f$a */
    abstract class C18026a<T> implements Iterator<T> {

        /* renamed from: b */
        int f49338b = C18023f.this.backingMap.mo46233b();

        /* renamed from: c */
        int f49339c = -1;

        /* renamed from: d */
        int f49340d = C18023f.this.backingMap.f49161d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract T mo46529a(int i);

        public boolean hasNext() {
            m59687a();
            if (this.f49338b >= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private void m59687a() {
            if (C18023f.this.backingMap.f49161d != this.f49340d) {
                throw new ConcurrentModificationException();
            }
        }

        public T next() {
            if (hasNext()) {
                T a = mo46529a(this.f49338b);
                this.f49339c = this.f49338b;
                this.f49338b = C18023f.this.backingMap.mo46234b(this.f49338b);
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            m59687a();
            if (this.f49339c != -1) {
                z = true;
            } else {
                z = false;
            }
            C18053v.m59703a(z);
            C18023f.this.size -= (long) C18023f.this.backingMap.mo46244h(this.f49339c);
            this.f49338b = C18023f.this.backingMap.mo46228a(this.f49338b, this.f49339c);
            this.f49339c = -1;
            this.f49340d = C18023f.this.backingMap.f49161d;
        }

        C18026a() {
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract void init(int i);

    /* access modifiers changed from: 0000 */
    public final int distinctElements() {
        return this.backingMap.f49160c;
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<E> elementIterator() {
        return new C18026a<E>() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final E mo46529a(int i) {
                return C18023f.this.backingMap.mo46238c(i);
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<C17883a<E>> entryIterator() {
        return new C18026a<C17883a<E>>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public C17883a<E> mo46529a(int i) {
                return C18023f.this.backingMap.mo46241e(i);
            }
        };
    }

    public final Iterator<E> iterator() {
        return C17884cc.m59425a((C17882cb<E>) this);
    }

    public final int size() {
        return C18143c.m59970b(this.size);
    }

    public final void clear() {
        this.backingMap.mo46239c();
        this.size = 0;
    }

    C18023f(int i) {
        init(i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C17928cz.m59558a((C17882cb<E>) this, objectOutputStream);
    }

    public final int count(Object obj) {
        return this.backingMap.mo46235b(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int a = C17928cz.m59551a(objectInputStream);
        init(3);
        C17928cz.m59557a((C17882cb<E>) this, objectInputStream, a);
    }

    /* access modifiers changed from: 0000 */
    public void addTo(C17882cb<? super E> cbVar) {
        C17439m.m57962a(cbVar);
        int b = this.backingMap.mo46233b();
        while (b >= 0) {
            cbVar.add(this.backingMap.mo46238c(b), this.backingMap.mo46240d(b));
            b = this.backingMap.mo46234b(b);
        }
    }

    public final int setCount(E e, int i) {
        int i2;
        C18053v.m59700a(i, "count");
        if (i == 0) {
            i2 = this.backingMap.mo46237c((Object) e);
        } else {
            i2 = this.backingMap.mo46230a(e, i);
        }
        this.size += (long) (i - i2);
        return i2;
    }

    public final int remove(Object obj, int i) {
        boolean z;
        if (i == 0) {
            return count(obj);
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57971a(z, "occurrences cannot be negative: %s", i);
        int a = this.backingMap.mo46229a(obj);
        if (a == -1) {
            return 0;
        }
        int d = this.backingMap.mo46240d(a);
        if (d > i) {
            this.backingMap.mo46236b(a, d - i);
        } else {
            this.backingMap.mo46244h(a);
            i = d;
        }
        this.size -= (long) i;
        return d;
    }

    public final int add(E e, int i) {
        boolean z;
        if (i == 0) {
            return count(e);
        }
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57971a(z, "occurrences cannot be negative: %s", i);
        int a = this.backingMap.mo46229a((Object) e);
        if (a == -1) {
            this.backingMap.mo46230a(e, i);
            this.size += (long) i;
            return 0;
        }
        int d = this.backingMap.mo46240d(a);
        long j = (long) i;
        long j2 = ((long) d) + j;
        if (j2 > 2147483647L) {
            z2 = false;
        }
        C17439m.m57973a(z2, "too many occurrences: %s", j2);
        this.backingMap.mo46236b(a, (int) j2);
        this.size += j;
        return d;
    }

    public final boolean setCount(E e, int i, int i2) {
        C18053v.m59700a(i, "oldCount");
        C18053v.m59700a(i2, "newCount");
        int a = this.backingMap.mo46229a((Object) e);
        if (a == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.backingMap.mo46230a(e, i2);
                this.size += (long) i2;
            }
            return true;
        } else if (this.backingMap.mo46240d(a) != i) {
            return false;
        } else {
            if (i2 == 0) {
                this.backingMap.mo46244h(a);
                this.size -= (long) i;
            } else {
                this.backingMap.mo46236b(a, i2);
                this.size += (long) (i2 - i);
            }
            return true;
        }
    }
}
