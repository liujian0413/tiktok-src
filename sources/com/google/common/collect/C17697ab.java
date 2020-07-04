package com.google.common.collect;

import com.google.common.base.C17439m;
import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.google.common.collect.ab */
final class C17697ab<T> extends C17896ch<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Comparator<T> f48924a;

    public final int hashCode() {
        return this.f48924a.hashCode();
    }

    public final String toString() {
        return this.f48924a.toString();
    }

    C17697ab(Comparator<T> comparator) {
        this.f48924a = (Comparator) C17439m.m57962a(comparator);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17697ab)) {
            return false;
        }
        return this.f48924a.equals(((C17697ab) obj).f48924a);
    }

    public final int compare(T t, T t2) {
        return this.f48924a.compare(t, t2);
    }
}
