package com.google.common.collect;

import com.google.common.base.C17439m;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.common.collect.bc */
public abstract class C17757bc<E> extends C17746as<E> implements Set<E> {
    protected C17757bc() {
    }

    /* access modifiers changed from: protected */
    public abstract Set<E> delegate();

    /* access modifiers changed from: protected */
    public int standardHashCode() {
        return C17933db.m59564a((Set<?>) this);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    /* access modifiers changed from: protected */
    public boolean standardEquals(Object obj) {
        return C17933db.m59571a((Set<?>) this, obj);
    }

    /* access modifiers changed from: protected */
    public boolean standardRemoveAll(Collection<?> collection) {
        return C17933db.m59572a((Set<?>) this, (Collection) C17439m.m57962a(collection));
    }

    public boolean equals(Object obj) {
        if (obj == this || delegate().equals(obj)) {
            return true;
        }
        return false;
    }
}
