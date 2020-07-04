package com.bytedance.jedi.model.guava.p606a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.bytedance.jedi.model.guava.a.a */
public abstract class C11854a<T> implements Iterator<T> {

    /* renamed from: a */
    private T f31657a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo29380a(T t);

    public final boolean hasNext() {
        if (this.f31657a != null) {
            return true;
        }
        return false;
    }

    public final T next() {
        if (hasNext()) {
            try {
                return this.f31657a;
            } finally {
                this.f31657a = mo29380a(this.f31657a);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    protected C11854a(T t) {
        this.f31657a = t;
    }
}
