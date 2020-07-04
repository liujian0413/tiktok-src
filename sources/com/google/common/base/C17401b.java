package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.base.b */
abstract class C17401b<T> implements Iterator<T> {

    /* renamed from: a */
    private C17403a f48343a = C17403a.NOT_READY;

    /* renamed from: b */
    private T f48344b;

    /* renamed from: com.google.common.base.b$a */
    enum C17403a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo44901a();

    protected C17401b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo44905b() {
        this.f48343a = C17403a.DONE;
        return null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    private boolean m57882c() {
        this.f48343a = C17403a.FAILED;
        this.f48344b = mo44901a();
        if (this.f48343a == C17403a.DONE) {
            return false;
        }
        this.f48343a = C17403a.READY;
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f48343a = C17403a.NOT_READY;
            T t = this.f48344b;
            this.f48344b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        boolean z;
        if (this.f48343a != C17403a.FAILED) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57981b(z);
        switch (this.f48343a) {
            case READY:
                return true;
            case DONE:
                return false;
            default:
                return m57882c();
        }
    }
}
