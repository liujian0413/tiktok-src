package com.google.common.collect;

import com.google.common.base.C17439m;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.c */
public abstract class C17870c<T> extends C17995dt<T> {

    /* renamed from: a */
    private C17872a f49133a = C17872a.NOT_READY;

    /* renamed from: b */
    private T f49134b;

    /* renamed from: com.google.common.collect.c$a */
    enum C17872a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo45252a();

    protected C17870c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo46191b() {
        this.f49133a = C17872a.DONE;
        return null;
    }

    /* renamed from: c */
    private boolean m59399c() {
        this.f49133a = C17872a.FAILED;
        this.f49134b = mo45252a();
        if (this.f49133a == C17872a.DONE) {
            return false;
        }
        this.f49133a = C17872a.READY;
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f49133a = C17872a.NOT_READY;
            T t = this.f49134b;
            this.f49134b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        boolean z;
        if (this.f49133a != C17872a.FAILED) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57981b(z);
        switch (this.f49133a) {
            case DONE:
                return false;
            case READY:
                return true;
            default:
                return m59399c();
        }
    }
}
