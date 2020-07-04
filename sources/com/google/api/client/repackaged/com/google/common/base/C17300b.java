package com.google.api.client.repackaged.com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.api.client.repackaged.com.google.common.base.b */
abstract class C17300b<T> implements Iterator<T> {

    /* renamed from: a */
    private C17302a f48170a = C17302a.NOT_READY;

    /* renamed from: b */
    private T f48171b;

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.b$a */
    enum C17302a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo44743a();

    protected C17300b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo44744b() {
        this.f48170a = C17302a.DONE;
        return null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    private boolean m57642c() {
        this.f48170a = C17302a.FAILED;
        this.f48171b = mo44743a();
        if (this.f48170a == C17302a.DONE) {
            return false;
        }
        this.f48170a = C17302a.READY;
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f48170a = C17302a.NOT_READY;
            T t = this.f48171b;
            this.f48171b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        boolean z;
        if (this.f48170a != C17302a.FAILED) {
            z = true;
        } else {
            z = false;
        }
        C17321g.m57690b(z);
        switch (this.f48170a) {
            case DONE:
                return false;
            case READY:
                return true;
            default:
                return m57642c();
        }
    }
}
