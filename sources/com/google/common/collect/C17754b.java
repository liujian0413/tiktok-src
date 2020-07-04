package com.google.common.collect;

import com.google.common.base.C17439m;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.b */
abstract class C17754b<E> extends C17996du<E> {

    /* renamed from: a */
    private final int f48983a;

    /* renamed from: b */
    private int f48984b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo45206a(int i);

    public final int nextIndex() {
        return this.f48984b;
    }

    public final boolean hasPrevious() {
        if (this.f48984b > 0) {
            return true;
        }
        return false;
    }

    public final int previousIndex() {
        return this.f48984b - 1;
    }

    public final boolean hasNext() {
        if (this.f48984b < this.f48983a) {
            return true;
        }
        return false;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f48984b;
            this.f48984b = i + 1;
            return mo45206a(i);
        }
        throw new NoSuchElementException();
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f48984b - 1;
            this.f48984b = i;
            return mo45206a(i);
        }
        throw new NoSuchElementException();
    }

    protected C17754b(int i) {
        this(i, 0);
    }

    protected C17754b(int i, int i2) {
        C17439m.m57978b(i2, i);
        this.f48983a = i;
        this.f48984b = i2;
    }
}
