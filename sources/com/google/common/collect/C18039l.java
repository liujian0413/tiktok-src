package com.google.common.collect;

import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.l */
public abstract class C18039l<T> extends C17995dt<T> {

    /* renamed from: a */
    private T f49348a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo45079a(T t);

    public final boolean hasNext() {
        if (this.f49348a != null) {
            return true;
        }
        return false;
    }

    public final T next() {
        if (hasNext()) {
            try {
                return this.f49348a;
            } finally {
                this.f49348a = mo45079a(this.f49348a);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    protected C18039l(T t) {
        this.f49348a = t;
    }
}
